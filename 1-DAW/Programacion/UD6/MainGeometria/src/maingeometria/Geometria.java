package maingeometria;

/**
 *
 * @author aidan
 */
public interface Geometria {
    
    public double pi=3.14159;
    double perimetro();
    public abstract double area();
    
    default void SoyGeometrico(){
        System.out.println("Estoy en geometría");
    }
}
