

package com.aidansanchez.tiendaapp;
import java.util.Scanner;
/**
 *
 * @author aidan
 */
public class TiendaApp {

    public static void main(String[] args) {
            int opcion;
            int total=0;
            Scanner buffer= new Scanner(System.in);
            do{
        System.out.println("===== MENU DE COMPRA =====");
       System.out.println("1. Camiseta - 15$");
       System.out.println("2. Pantalón - 25$");
       System.out.println("3. Zapatillas - 50$");
       System.out.println("4. Gorra - 10$");
       System.out.println("5. Finalizar compra");
       System.out.print("Elige una opcion: ");
       opcion=buffer.nextInt();
       switch(opcion)
       {
           case 1:
               total=total+15;
               System.out.println("Se añadio camiseta a la compra: "+total);
               break;
           case 2:
               total=total+25;
               System.out.println("Se añadio pantalon a la compra: "+total);
               break;
           case 3:
               total=total+50;
               System.out.println("Se añadio zapatillas a la compra: "+total);
               break;
           case 4:
               total=total+10;
               System.out.println("Se añadio gorra a la compra: "+total);
               break;
           case 5:
               System.out.println("Gracias por su compra el total de su cesta sera: "+total);
               break;
           default:
               System.out.println("Escriba un valor correcto");
       }       
       
       }
        while(opcion!=5);       
    }
}
