package mainanimales;

/**
 *
 * @author aidan
 */
public class Animales {
    protected String nombre;
    protected int edad;

    public Animales() {
    }

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "\nnombre=" + nombre + "\nedad=" + edad;
    }
    
}
