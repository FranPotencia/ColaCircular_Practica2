/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaCircular_Practica2;

/**
 *
 * @author FranPotencia
 */
public class ColaLenta implements ICola{
    
    int capacidad, head, tail, numelementos;
    Object datos[];
    
    public ColaLenta(int capacidad){
        
        datos = new Object[capacidad];
        numelementos=0;
        head=0;
        tail=0;
        this.capacidad=capacidad;
        
    }
  

    @Override
    public int GetNum() {
        
        return numelementos;
    }

    @Override
    public synchronized void Acola(Object elemento) throws Exception {
        Thread.sleep(100);
        if(!colallena()){
            
            Thread.sleep(100);
            datos[tail]=elemento;
            Thread.sleep(100);
            tail=(tail+1)%capacidad;
            Thread.sleep(100);
            numelementos++;
            Thread.sleep(100);
        }
        else{
        throw new Exception("COLA LLENA"); 
        }
    }

    @Override
    public synchronized Object Desacola() throws Exception {
        Thread.sleep(10);
        if(!colavacia()){
            
            Object numdesacola=datos[head];
            Thread.sleep(10);
            head=(head+1)%capacidad;
            Thread.sleep(10);
            numelementos--;
            Thread.sleep(100);
            return numdesacola;
            
        }
        else{
        throw new Exception("COLA VACÍA");
        }
    }

    @Override
    public Object Primero() throws Exception {
        
        if(numelementos != 0){
            return datos[head];
        }
        throw new Exception("COLA VACÍA"); 
    }
    
    public boolean colallena(){
        
        if(numelementos==capacidad)
            return true;
        else
            return false;
    }
    
    public boolean colavacia(){
        
        if(numelementos==0)
            return true;
        else
            return false;
    }
}
