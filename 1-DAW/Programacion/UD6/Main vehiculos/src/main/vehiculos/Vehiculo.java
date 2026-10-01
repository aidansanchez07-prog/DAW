package main.vehiculos;

/**
 *
 * @author aidan
 */
public interface Vehiculo {
  
    public void arrancar();
    public void detener();
    default void claxon(){
        System.out.println("Sonando el claxon en vehiculo");
    }
}
