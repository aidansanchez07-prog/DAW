package mainanimales;

/**
 *
 * @author aidan
 */
public class Gatos extends Animales{
    private String raza;

    public Gatos() {
    }

    public Gatos(String raza) {
        this.raza = raza;
    }

    public Gatos(String raza, String nombre, int edad) {
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
        return "\nGato" + super.toString()+"\nraza=" + raza  ;
    }
    
}
