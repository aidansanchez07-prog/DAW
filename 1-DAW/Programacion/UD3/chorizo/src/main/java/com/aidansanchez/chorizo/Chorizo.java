

package com.aidansanchez.chorizo;

/**
 *
 * @author aidan
 */
public class Chorizo {

    public static void main(String[] args) {
        String chorizo;
        chorizo="Esta;es;la;asignatura;de;programacion";
        String [] texto;
        texto=chorizo.split(";");
        System.out.println(texto[5]);
    }
}
