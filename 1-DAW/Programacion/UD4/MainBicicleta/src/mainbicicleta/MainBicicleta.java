package mainbicicleta;
import Utilidades.Utilities;
/**
 *
 * @author aidan
 */
public class MainBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta(1, 1, 1);
        Bicicleta bici2 = new Bicicleta(1, 1, 1);
        Bicicleta bici3 = new Bicicleta(1, 1, 1);
        Bicicleta bici4 = new Bicicleta(1, 1, 1);
        bici1.acelerar();
        bici2.acelerar();
        bici3.acelerar();
        bici4.acelerar();
        //Mostrar estado actual de velocidad de cada bici
        System.out.println("La velocidad de bici 1 es: " + bici1.getVelocidadActual());
        System.out.println("La velocidad de bici 2 es: " + bici2.getVelocidadActual());
        System.out.println("La velocidad de bici 3 es: " + bici3.getVelocidadActual());
        System.out.println("La velocidad de bici 4 es: " + bici4.getVelocidadActual());
        System.out.println(bici1.getPinonActual());
       
            bici1.cambiarPinon("+");
        System.out.println(bici1.getPinonActual());
        System.out.println(bici1.getPlatoActual());
       
            bici1.cambiarPlato("+");
        System.out.println(bici1.getPlatoActual());
        
//        while(bici1.getVelocidadActual()<101&&bici2.getVelocidadActual()<101&&bici3.getVelocidadActual()<101&&bici4.getVelocidadActual()<101){
//            bici1.acelerar();
//            bici2.acelerar();
//            bici3.acelerar();
//            bici4.acelerar();
//            if(bici1.getVelocidadActual()==bici2.getVelocidadActual()||bici1.getVelocidadActual()==bici3.getVelocidadActual()||bici1.getVelocidadActual()==bici4.getVelocidadActual()||bici2.getVelocidadActual()==bici3.getVelocidadActual()||bici2.getVelocidadActual()==bici4.getVelocidadActual()||bici3.getVelocidadActual()==bici4.getVelocidadActual()){
//                
//                bici1.frenar();
//                bici2.frenar();
//                bici3.frenar();
//                bici4.frenar();
//
//            }
//            
//        }
//        System.out.println("La velocidad de bici 1 es: " + bici1.getVelocidadActual());
//        System.out.println("La velocidad de bici 2 es: " + bici2.getVelocidadActual());
//        System.out.println("La velocidad de bici 3 es: " + bici3.getVelocidadActual());
//        System.out.println("La velocidad de bici 4 es: " + bici4.getVelocidadActual());
//        if(bici1.getVelocidadActual()>bici2.getVelocidadActual()){
//            if(bici1.getVelocidadActual()>bici3.getVelocidadActual()){
//                if(bici1.getVelocidadActual()>bici4.getVelocidadActual()){
//                    System.out.println("Ha ganado Bici1");
//                }
//            }
//        }
//        if(bici2.getVelocidadActual()>bici1.getVelocidadActual()){
//            if(bici2.getVelocidadActual()>bici3.getVelocidadActual()){
//                if(bici2.getVelocidadActual()>bici4.getVelocidadActual()){
//                    System.out.println("Ha ganado Bici2");
//                }
//            }
//        }
//        if(bici3.getVelocidadActual()>bici2.getVelocidadActual()){
//            if(bici3.getVelocidadActual()>bici1.getVelocidadActual()){
//                if(bici3.getVelocidadActual()>bici4.getVelocidadActual()){
//                    System.out.println("Ha ganado Bici3");
//                }
//            }
//        }
//        if(bici4.getVelocidadActual()>bici2.getVelocidadActual()){
//            if(bici4.getVelocidadActual()>bici3.getVelocidadActual()){
//                if(bici4.getVelocidadActual()>bici1.getVelocidadActual()){
//                    System.out.println("Ha ganado Bici4");
//                }
//            }
//        }
        
    }

}
