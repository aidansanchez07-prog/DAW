

package com.aidansanchez.saludos;
import java.util.Scanner;
/*
 *
 * @author aidan
 */
public class Saludos {

    public static void main(String[] args) {
        String nombre;
        Scanner buffer= new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre=buffer.nextLine();
        System.out.println("Bienvenido "+ nombre+ " encantado de saludarte");
    }
}
