package main.vehiculos;

import java.io.IOException;

/**
 *
 * @author aidan
 */
public class MainVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1= new Coche("1234KNJ","Ford","focus",0,4);
        c1.arrancar();
        boolean terminar=false;
//        do{
//        try{
//            c1.acelerar();
//            System.out.println(c1.getVelocidadActual());
//        }catch(IOException e){
//            
//            System.out.println(e.getMessage());
//            terminar=true;
//        }
//        }while(terminar==false);
        do{
        try{
            c1.acelerarMucho();
            System.out.println(c1.getVelocidadActual());
        }catch(DemasiadoRapidoException e){
            
            System.out.println(e.getMessage());
            terminar=true;
        }
        }while(terminar==false);
    }
    
}
