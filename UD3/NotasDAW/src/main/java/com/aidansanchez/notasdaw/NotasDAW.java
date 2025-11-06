package com.aidansanchez.notasdaw;

import java.util.Arrays;

/**
 *
 * @author aidan
 */
public class NotasDAW {

    public static void main(String[] args) {
        int[] notas = new int[15];
        int nota = 0;
        int contador = 0;
        System.out.println("Bienvenido al calculo de notas media DAW");
        do {
            System.out.println("Por favor introduce la siguiente nota, Recuerda -1 para finalizar");
            nota = (int) Float.parseFloat(System.console().readLine());
            if (nota <= 10 && nota >= 0) {
                //que pasa si la nota es decimal 

                notas[contador] = nota;
                contador++;
                //bug que pasa si sobrepaso 15
            } else if (nota > 10 || nota < -1) {
                System.out.println("Introduzca un numero entre -1 y 10");
            }
            if (contador == 15) {
                System.out.println("Ya has introducido todas tus notas, te hago la media");
                nota = -1;
            }
         
        } while ((nota != -1) && contador < 15);
        
         float media =calculaMedia(notas,contador);
        System.out.printf("La media de las notas es: %.2f ",media);
        //for (int i = 0; i < notas.length; i++) {
          //  notas[i] = i;
        //}
        //for (int i = 0; i < notas.length; i++) {
       //     System.out.println(notas[i]);
        //}
    }

    public static float calculaMedia(int[] notas, int contador) {
        int suma = 0;
        for (int i = 0; i < contador; i++) {
            suma = suma + notas[i];
        }
        return suma / contador;
    }
}
