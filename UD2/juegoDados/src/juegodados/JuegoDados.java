package juegodados;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JuegoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //juego de los dados
        
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 6;
        int opcion = 0;
        int numJA, numJB, numBancaA, numBancaB = 0;
        
        do {
            System.out.println("Bienvenido al juego de los dados.");
            System.out.println ("Pulse 1 para jugar, pulse 2 para salir.");
            opcion = sc.nextInt();
            
            
            if (opcion == 1) {
                System.out.println("Vamos a proceder con su tirada de dado.");
                numJA = lanzarDado();
                numJB = lanzarDado();
                numBancaA = lanzarDado();
                numBancaB = lanzarDado();
                
                ganador(numJA, numJB, numBancaA, numBancaB);
                
            } else if (opcion == 2) {
                System.out.println("Gracias por jugar.");
            } else {
                System.out.println("Opcion no valida. Por favor, introduzca un numero valido.");
            }
        }while (opcion != 2);
    }
    public static int lanzarDado() {
        int min = 1;
        int max = 6;
        
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    public static void ganador(int nJA, int nJB, int nBancaA, int nBancaB) {
        
        if (nJA + nJB > nBancaA + nBancaB) {
                    System.out.println("Has ganado, sacaste un " + nJA + " y un " + nJB);
                    System.out.println("La banca sacó un " + nBancaA + " y un " + nBancaB);
                }else if (nBancaA + nBancaB > nJA + nJB) {
                    System.out.println("Ganá la banca, saca un " + nBancaA + " y un " + nBancaB);
                    System.out.println("Sacaste un " + nJA + " y un " + nJB);
                } else {
                    System.out.println("Empataste!");
                }
    }
    
} 
    
      