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
public interface ICola {
   
    public int GetNum();
    public void Acola(Object elemento)throws Exception;
    public Object Desacola()throws Exception;
    public Object Primero()throws Exception;
}
