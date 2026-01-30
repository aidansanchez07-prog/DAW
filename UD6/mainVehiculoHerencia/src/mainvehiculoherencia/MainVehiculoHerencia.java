package mainvehiculoherencia;

import java.util.*;
/**
 *
 * @author aidan
 */
public class MainVehiculoHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche c1= new Coche("ford","focus",5);
        System.out.println(c1);
        Coche c2= new Coche("ford","focus",5,"Berlina");
        System.out.println(c2);
        Moto m1=new Moto(125,"Honda","CBF",false);
        System.out.println(m1);
        Moto m2=new Moto(125,"Honda","CBF",false,"Naked");
        System.out.println(m2);
        Vehiculo v1=c1;
        System.out.println(v1.tipoVehiculo);
        c1.arrancar();
        System.out.println("----1----");
        Vehiculo v2=new Vehiculo("Honda","Civic");
        v2.arrancar();
        System.out.println("----2-----");
        Coche c3= new Coche ("Ford","Kuga",5,"Sub");
        Vehiculo v3=c3;
        System.out.println(c2.obtenerTipoVehiculo());
        c3.imprimir();
        v3.imprimir();
        System.out.println(v3.tipoVehiculo);
        System.out.println(c3.getTipoVehiculo());

        Vehiculo v4 = new Vehiculo();

         v4.ClonarVehiculo(c3.getMarca(), c3.getModelo());
        System.out.println(v4);
        v4.imprimir();
        
        //Polimorfismo
        ArrayList<Vehiculo> listaVehiculos=new ArrayList<>();
        listaVehiculos.add(c1);
        listaVehiculos.add(c2);
        listaVehiculos.add(m1);
        listaVehiculos.add(m2);
        for (int i = 0; i < listaVehiculos.size(); i++) {
            listaVehiculos.get(i).imprimir();
        }
    }
    
}
