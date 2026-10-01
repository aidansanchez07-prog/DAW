

package com.aidansanchez.ej82_tema1;
import java.util.Scanner;
/**
 *
 * @author aidan
 */
public class EJ82_Tema1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        double h;
        double b;
        Scanner buffer= new Scanner(System.in);
        System.out.println("De cuanta altura quieres la L?");
        h=buffer.nextInt();
        for(int i=0;h>=i;i++){
            System.out.println("*");
        }
        
        b=h*2;
        
        for(int a=0;a<=b;a++){
            System.out.print("*");
        }
    }
}
