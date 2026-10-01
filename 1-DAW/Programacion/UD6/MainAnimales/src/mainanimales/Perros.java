package mainanimales;

/**
 *
 * @author aidan
 */
public class Perros extends Animales {
    private String raza;

    public Perros() {
    }

    public Perros(String raza) {
        this.raza = raza;
    }

    public Perros(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "\nPerro" +super.toString()+ "\nraza=" + raza ;
    }
    
}
