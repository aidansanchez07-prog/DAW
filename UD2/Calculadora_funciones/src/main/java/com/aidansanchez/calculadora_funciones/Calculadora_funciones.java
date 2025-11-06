package com.aidansanchez.calculadora_funciones;

/**
 *
 * @author aidan
 */
public class Calculadora_funciones {

    public static void main(String[] args) {
        System.out.println("Bienvenido a mi calculadora");
        int opcion;
        int n1, n2;
       // System.out.printf(String formato, Object... args);
//Significado:
//•	El primer argumento (formato) es una cadena de formato que contiene texto y especificadores de formato.
//•	Los argumentos siguientes (args) son los valores que se insertan en los lugares indicados dentro de la cadena de formato.

//Un especificador tiene la siguiente forma:
//%[argument_index$][flags][width][.precision]conversion
//Ejemplo:
       // System.out.printf("%1$08.2f", 12.345);
//Desglose:
//•	% → Indica el inicio del especificador.
//•	1$ → (opcional) indica el índice del argumento (el primero, segundo, etc.).
//•	0 → (flag) rellena con ceros.
//•	8 → (width) ancho total mínimo del campo (8 caracteres).
//•	.2 → (precision) número de decimales.
//•	f → (conversion) tipo de formato (en este caso, número flotante).

        do {
            System.out.println("Pulse 1 para sumar, 2 restar, 3 multiplicar, 4 division y 0 para salir");
            opcion = Integer.parseInt(System.console().readLine());
            if (opcion > 0 && opcion < 5) {
                System.out.println("Ingrese el primer numero");
                n1 = Integer.parseInt(System.console().readLine());
                System.out.println("Ingrese el segundo numero");
                n2 = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1: {
                        System.out.println(Utilidades.sumar(n1, n2));
                        break;
                    }
                    case 2: {
                        System.out.println(Utilidades.restar(n1, n2));
                        break;
                    }
                    case 3: {
                        System.out.println(Utilidades.multiplicar(n1, n2));
                        break;
                    }
                    case 4: {
                        if(n2==0){
                            System.out.println("No se puede dividir entre 0");
                        }
                        else{
                           // System.out.printf(String,Object... args");
                           //Un especificador tiene la siguiente forma;
                           //%[argument_index$][flags][width][.precision]conversion
                        //System.out.println(Utilidades.dividir(n1, n2));
                            //System.out.println("La division de "+n1+" entre "+n2+" es: "+ Utilidades.dividir(n1, n2) );
                            //System.out.printf("El resultado de la division es: %.2f",Utilidades.dividir(n1, n2));
                            System.out.printf("La division de "+n1+" entre "+n2+" es: %.2f\n", Utilidades.dividir(n1, n2) );
                            System.out.printf("La division de %2$d entre %3$d es: %1$.2f\n", Utilidades.dividir(n1, n2),n1,n2 );
                            
                        break;}
                    }
                }
            }
        } while (opcion != 0);
        System.out.println("Adios");
    }
}
