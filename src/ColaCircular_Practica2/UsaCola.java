/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaCircular_Practica2;

import java.util.Random;

/**
 *
 * @author FranPotencia
 */
public class UsaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      ColaLenta colaL = new ColaLenta(5);
      
      //Productor
      Productor p1 = new Productor(colaL,"Productor");
      
      //Consumidor
      Consumidor r1 = new Consumidor(colaL,"Consumidor");
      Thread c1 = new Thread(r1);
      
      p1.start();
      c1.start();
                     

          
        }
    }

    
