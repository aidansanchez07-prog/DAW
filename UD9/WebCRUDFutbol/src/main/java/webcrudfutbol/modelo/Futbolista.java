package webcrudfutbol.modelo;

/**
 *
 * @author aidan
 */
public class Futbolista {
    private int idfutbolista;
    private String nombre;
    private int goles;
    private double sueldo;
    private Equipo equipo;

    public Futbolista() {
    }

    public Futbolista(int idfutbolista, String nombre, int goles, double sueldo, Equipo equipo) {
        this.idfutbolista = idfutbolista;
        this.nombre = nombre;
        this.goles = goles;
        this.sueldo = sueldo;
        this.equipo = equipo;
    }

    public int getIdfutbolista() {
        return idfutbolista;
    }

    public void setIdfutbolista(int idfutbolista) {
        this.idfutbolista = idfutbolista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "idfutbolista=" + idfutbolista + ", nombre=" + nombre + ", goles=" + goles + ", sueldo=" + sueldo + ", equipo=" + equipo.getNombre() + '}';
    }

   
    
}
