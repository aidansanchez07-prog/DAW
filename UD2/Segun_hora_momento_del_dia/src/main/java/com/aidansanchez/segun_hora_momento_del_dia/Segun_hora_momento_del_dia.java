package com.aidansanchez.segun_hora_momento_del_dia;

import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class Segun_hora_momento_del_dia {

    public static void main(String[] args) {
        int hora;
        Scanner buffer = new Scanner(System.in);
        do {

            System.out.println("Introduce que hora es, si quieres salir del programa introduzca el numero 33 ");
            hora = buffer.nextInt();
            if (hora >= 0 && hora <= 6) {
                System.out.println("Estas en la madrugada");
            }
            else if (hora > 6 && hora <= 12) {
                System.out.println("Estas en la mañana");}
            else if (hora > 12 && hora <= 21){
                System.out.println("Estas en la tarde");
            }
            else if(hora>21&&hora<24){
                System.out.println("Estas en la noche");
            }
            else if(hora==33){
                System.out.println("Gracias por usarnos");
            }
            else
                System.out.println("Introduzca un valor correcto");
                    
                        
                        
            
        }while(hora!=33);
              
    }
}
