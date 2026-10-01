package com.aidansanchez.sueldo_horas_extra;

import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class Sueldo_horas_extra {

    public static void main(String[] args) {
        double horas;
        double extra;
        double salario;
        double dinerohora;
        Scanner buffer = new Scanner(System.in);
        System.out.println("Escribe cuantas horas has trabajado este mes");
        horas = buffer.nextInt();
        System.out.println("A cuanto cobras la hora");
        dinerohora = buffer.nextInt();
        if (horas < 160) {
            System.out.println("Trabaja mas cabron pero tu sueldo es "+(dinerohora*horas));
            
        } else {
            extra = horas - 160;
            salario = dinerohora * extra * 1.5 + dinerohora * 160;
            System.out.println("Has hecho " + horas + " de las cuales " + extra + " son extras, y las cobras las normales a " + dinerohora + " euros la hora y las extra se añadira un 50% extra a las horas normales por eso su sueldo total sera " + salario);
        }

    }
}
