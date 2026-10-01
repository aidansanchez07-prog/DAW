package com.aidansanchez.factorialrecursivo;

/**
 *
 * @author aidan
 */
public class FactorialRecursivo {

    public static void main(String[] args) {
        System.out.println("Ingrese de que numero quieres el factorial: ");
        int a = Integer.parseInt(System.console().readLine());
        int c = 1;
        if (a > 0) {
            c=factorial (a);
            System.out.println("El resultado es " + c);
        }

    }

    public static int factorial(int num) {
        //Recursividad lo importante es definir los casos base
        if (num == 0 || num == 1) {
            return 1;
        } else {
            int result=num*factorial(num-1);
            System.out.println(result);
            return num * factorial(num - 1);
        }
    }

}
