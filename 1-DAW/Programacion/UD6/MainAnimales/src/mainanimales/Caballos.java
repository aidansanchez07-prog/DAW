package mainanimales;

/**
 *
 * @author aidan
 */
public class Caballos extends Animales{
    private String raza;

    public Caballos() {
    }

    public Caballos(String raza) {
        this.raza = raza;
    }

    public Caballos(String raza, String nombre, int edad) {
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
        return "\nCaballo"+ super.toString()+ "\nraza=" + raza ;
    }

}