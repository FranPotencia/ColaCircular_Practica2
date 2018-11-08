/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaCircular_Practica2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FranPotencia
 */
public class Consumidor implements Runnable {

    private ColaLenta lacola;
    private String msg;

    public Consumidor(ColaLenta lacola, String msg) {
        this.msg=msg;
        this.lacola = lacola;

    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                int desacolado = (int) lacola.Primero();
                    System.out.println("Soy: " + msg);
                    System.out.println("Se intenta desacolar el número: " + desacolado);
                    lacola.Desacola();
                    System.out.println("Se ha desacolado el número: " + desacolado);
                    System.out.println("La cola contiene: " + lacola.GetNum() + " elementos");
                    System.out.println("El primer elemento es: " + lacola.Primero());
                    System.out.println("- - - - - - - - - - - -");
                    Thread.sleep(2000);
                
            } catch (Exception ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("- - - - - - - - - - - -");
        }
    }
}
