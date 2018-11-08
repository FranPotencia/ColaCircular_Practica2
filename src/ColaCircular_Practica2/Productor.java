/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaCircular_Practica2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FranPotencia
 */
public class Productor extends Thread {

    private ColaLenta lacola;
    Random rnd = new Random();

    public Productor(ColaLenta lacola, String msg) {
        super(msg);
        this.lacola = lacola; 
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                rnd.setSeed(System.currentTimeMillis());
                int aleatorio = rnd.nextInt(99);
                System.out.println("Soy: " + Thread.currentThread().getName());
                System.out.println("Se intenta acolar el número: " + aleatorio);
                lacola.Acola(aleatorio);
                System.out.println("Se ha acolado el número: " + aleatorio);
                System.out.println("La cola contiene: " + lacola.GetNum() + " elementos");
                System.out.println("El primer elemento es: " + lacola.Primero());
                
                Thread.sleep(2000);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
               System.out.println("- - - - - - - - - - - -");
        }
    }
}
