package ej15_array;

/**
 *
 * @author aidan
 */
public class Ej15_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 15: Funcionamiento de un restaurante (reservas). Disponemos de 
        //10 mesas y cada mesa puede ocuparse de 1 a 4 comensales, si junto 2 mesas 
        //puedo disponer de 6 comensales y si junto 3 mesas puedo disponer de 8 comensales
        //y si junto 4 mesas tengo 10 comensales. Gestionar el programa que ofrece un menú 
        //con la opción 1 para reservar y la opción 0 para terminar.
        final int num_mesas=10;
        int[] mesas= new int [num_mesas];
        int opcion=2;
        int comensales=0;
        for(int i=0;i<mesas.length;i++){
            mesas[i]=-1;
        }
        System.out.println("Bienvenido al restaurante IES Salduba");
        do{
             System.out.println("Pulse 1 para reservar o 0 para salir");
             opcion=Integer.parseInt(System.console().readLine());
             if(opcion==1){
                 if(!mesaLibre(mesas,0)){
                     System.out.println("Estamos completos");
                 }
                 else{
                     System.out.println("Dime el numero de comensales");
                     comensales=Integer.parseInt(System.console().readLine());
                     if(!mesaLibre(mesas,comensales)){
                         System.out.println("Lo siento no tenemos espacio para su grupo.");
                     }
                     else{
                         int numMesasAReservar=0;
                         if(comensales<=4){
                             for(int i=0; i<mesas.length;i++){
                                 if (mesas[i]==-1){
                                     mesas[i]=comensales;
                                     System.out.println("Reserva completa");
                                     break;
                                 }
                                 
                             }
                         }
                        else if(comensales>=5 && comensales<7){
                            
                        }
                         else if(comensales>=7 && comensales<8){
                            
                        }
                         else if(comensales>=9 && comensales<10){
                            
                        }
                         else{
                             System.out.println("No aceptamos reservas de mas de 10");
                         }
                     }
                 }
             }
             else if(opcion>1 || opcion<0){
                 System.out.println("Opcion incorrecta");
             }
        }while(opcion!=0);
        System.out.println("Gracias por utilizar nuestro servicio");
        
    }
    public static boolean mesaLibre(int[] mesa, int comensales){
        if(comensales==0){
            for(int i=0; i<mesa.length;i++){
                if (mesa[i]==-1){
                    return true;
                }
            }
            return false;
        }else if(comensales>0){
            int numMesasNecesarias=0;
            int mesasDisponibles=0;
            if(comensales<=4){
               numMesasNecesarias=1;
            }else if(comensales>4 &&comensales<=6){
                numMesasNecesarias=2;
            }else if(comensales>6 &&comensales<=8){
                numMesasNecesarias=3;
            }else if(comensales>8 &&comensales<=10){
                numMesasNecesarias=4;
            }
            for(int i=0;i<mesa.length;i++){
                if(mesa[i]==-1){
                    mesasDisponibles++;
                }
            }
            if(numMesasNecesarias>=mesasDisponibles){
                return true;
            }else{
                return false;
            }
        }
       return false;
    }
    
}
