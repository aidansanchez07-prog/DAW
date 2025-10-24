

package com.aidansanchez.factorial;

/**
 *
 * @author aidan
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Ingrese de que numero quieres el factorial: ");
        int a=Integer.parseInt(System.console().readLine());
        int c=1;
        if(a>0){
        for(int b=a;b>1;b--){
            
                c=c*b;
            
        }
        }
        
        System.out.println("El resultado es "+c);
    }
}
