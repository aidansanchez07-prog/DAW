package com.aidansanchez.repaso_ud1;

/**
 *
 * @author aidan
 */
public class Repaso_UD1 {
//variable estatica de clase

    static int contadorObjetos;
    //variable constante
    public static final double pi = 3.14149;

    public static void main(String[] args) {
        byte b = 10;
        short s = 300;
        int i = 5000;
        long l = 1000000L;
        float f = 5.75f;
        double d = 123.456;
        char c = 'H';
        boolean bool = true;
        String texto = "Hola javeros y javeras";
        int suma = i + b;
        int resta = i - s;
        int multiplicacion = b * 2;
        double division = d / 2;
        int resto = i % 7;;
        //asignacion compuesta
        i += 10;//equivale a i=i+10
        s *= 2;//equivale a s=s*2
        //incremento y decremento
        System.out.println("b: " + b);
        b++;
        System.out.println("b: " + b);
        System.out.println("l:" + l);
        l--;
        System.out.println("l: " + l);
        //Relaciones
        boolean esMayor = d > f;
        boolean esIgual = b == 11;
        boolean distinto = i != 0;
        //logica
        boolean resultadoLogico = !(5 == 6);
        System.out.println("Result: " + resultadoLogico);
        resultadoLogico = (esMayor && bool);
        System.out.println("Result2: " + resultadoLogico);
        System.out.println("Result3: " + (bool || esIgual));
        System.out.println("Es mayor: " + esMayor);
        resultadoLogico = (esMayor && bool) && esIgual;
        System.out.println("Result4: " + (resultadoLogico));
        //operador ternario
        String mensaje = (resultadoLogico) ? "Condicion verdadera" : "Condicion falsa";
        System.out.println("Mensaje: " + mensaje);
        //sentencia de control
        if (b > 5 && b < 20) {
            System.out.println("b esta entre 5 y 20");
        } else if (b > 20) {
            System.out.println("b es mayor que 20");
        } else {
            System.out.println("b es menor que 5");
        }
        //switch
        System.out.println("c: " + c);
        switch (c) {
            case 'H':
                System.out.println("Hombre");
                break;
            case 'M':
                System.out.println("Mujer");
                break;
            default:
                System.out.println("Otra opción");
        }
        System.out.println("\nBucle for");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue;
            }
            if (j == 4) {
                break;
            }
            System.out.println("Iteracion " + j);

        }
        //while
        System.out.println("Bucle while");
        int numero = 0;
        esMayor = true;
        while (numero < 10 && esMayor) {
            if (numero == 5) {
                esMayor = false;
                continue;
            }
            System.out.println("Iteracion: " + numero);
            numero++;
        }
        //do while
        System.out.println("\ndo-while");
        do {
            System.out.println("Voy por: " + numero);
            numero++;
        } while (numero < 10 && !esMayor);
        //lectura por consola
        int prim = 0;
        int segun = 0;
        boolean numKO=true;
        do {
            try {
                System.out.println("Por favor introduce un numero entero");
                prim = Integer.parseInt(System.console().readLine());
                
                System.out.println("Por favor introduce el segundo numero entero");
                segun = Integer.parseInt(System.console().readLine());

                System.out.println("El resultado de la suma es: " + (prim + segun));
                numKO=false;            } 
            catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Por favor introduce un formato numerico");

            }
        } while (numKO==true);

    }
}
