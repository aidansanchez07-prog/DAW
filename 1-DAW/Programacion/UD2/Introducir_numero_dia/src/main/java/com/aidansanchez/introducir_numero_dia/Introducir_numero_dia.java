package com.aidansanchez.introducir_numero_dia;



/**
 *
 * @author aidan
 */
public class Introducir_numero_dia {

    public static void main(String[] args) {
        int dia = 0;
        
        do {
            System.out.println("Introduzca el numero del dia de la semana que quieres saber, cuando quieras salir introduce el numero 33");
                
            try {
                
                dia=Integer.parseInt(System.console().readLine());
                switch (dia) {
                    case 1:
                        System.out.println("Es lunes");
                        break;
                    case 2:
                        System.out.println("Es martes");
                        break;
                    case 3:
                        System.out.println("Es miercoles");
                        break;
                    case 4:
                        System.out.println("Es jueves");
                        break;
                    case 5:
                        System.out.println("Es viernes");
                        break;
                    case 6:
                        System.out.println("Es sabado");
                        break;
                    case 7:
                        System.out.println("Es domingo");
                        break;
                    case 33:
                        break;
                    default:
                        System.out.println("Introduzca un valor valido");

                }
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Por favor introduce un formato numerico");
                dia=0;
                
            }
        } while (dia != 33);
    }
}
