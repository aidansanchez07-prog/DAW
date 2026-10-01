package com.aidansanchez.asignatura_dia;

import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class Asignatura_dia {

    public static void main(String[] args) {
        String dia;
        Scanner buffer = new Scanner(System.in);
        do {
            System.out.println("Escriba el dia de la semana que quieras saber su primera asignatura, escriba Salir cuando desee terminar");
            dia = buffer.nextLine().toLowerCase();
            switch (dia) {
                case "lunes":
                    System.out.println("Tu primera asigantura el lunes es Entornos de desarrollo");
                    break;
                case "martes":
                    System.out.println("Tu primera asignatura el martes es Sistemas operativos");
                    break;
                case "miercoles":
                    System.out.println("Tu primera asignatura el miercoles es Sistemas operativos");
                    break;
                case "jueves":
                    System.out.println("Tu primera asignatura el jueves es Base de Datos");
                    break;
                case "viernes":
                    System.out.println("Tu primera asignatura el viernes es Programacion");
                    break;
                case "salir":
                    break;
                default:
                    System.out.println("Elija un valor adecuado");

            }
        }
        while(!dia.equals("salir"));
    }
    
}
