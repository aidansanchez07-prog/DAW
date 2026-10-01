

package com.aidansanchez.ej_4_arrays;

/**
 *
 * @author aidan
 */
public class Ej_4_Arrays {

    public static void main(String[] args) {
        String cadena;
        String[] texto;
        System.out.println("Introduce una frase: ");
        cadena=System.console().readLine();
        if(cadena.contains(".")){
            texto=cadena.split("\\.");
            //Opcion 1
            for(int i=0;i<texto.length;i++){
                System.out.println("La frase "+(i+1)+" es: "+texto[i]);
            }
            //Opcion 2
//            for(String frase:texto){
//                System.out.println(frase);
//            }
        }
        else{
            System.out.println("La frase introducida no incluye el separador.");
            System.out.println(cadena);
        }
    }
}
