

package com.aidansanchez.fibonacci;

/**
 *
 * @author aidan
 */
public class Fibonacci {

    public static void main(String[] args) {
        int a=1;
        int b=0;
        //Los numeros de abajo es para ponerle un limite y no sea infinito
        while(a<40 && b<40){
            if(b==0){
                b=b+a;
                System.out.println(a);
                System.out.println(b);
                
                        
            }
            else{
                a=a+b;
                System.out.println(a);
                b=b+a;
                System.out.println(b);
            }
        }
    }
}
