package baloncestomain;

/**
 *
 * @author aidan
 */
public class Arbitro {
    private String nombreArbitro;
    private int edad;

    public Arbitro(String nombreArbitro, int edad) {
        this.nombreArbitro = nombreArbitro;
        this.edad = edad;
    }
    public Arbitro(){
        
    }
    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Arbitro{" + "\nNombre arbitro=" + nombreArbitro + "\nEdad=" + edad + '}';
    }
    
    
}
