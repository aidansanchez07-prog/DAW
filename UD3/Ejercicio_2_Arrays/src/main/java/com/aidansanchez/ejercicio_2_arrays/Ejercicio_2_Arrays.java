

package com.aidansanchez.ejercicio_2_arrays;

/**
 *
 * @author aidan
 */
public class Ejercicio_2_Arrays {

    public static void main(String[] args) {
        int []notas= new int[15];
      //  for(int i=0;i<notas.length;i++){
        //    notas[i]=-1;
        //}
        //int nota =(int)(Math.random()*(max-min+1))+min;
       for(int i=0;i<notas.length;i++){    
           notas[i]=(int)(Math.random()*(11));
        }
//        double media=0;
//        for(int i=0;i<notas.length;i++){
//            media=media+notas[i];
//            System.out.println(notas[i]);
//        }
        System.out.printf("La nota media es: %.2f\n",calculaMedia(notas));
    }
    public static double calculaMedia(int[] notas){
         double media=0;
         for(int i=0;i<notas.length;i++){
         media=media+notas[i];
         System.out.println(notas[i]);
       
       }
           return media/notas.length;
    }
}
