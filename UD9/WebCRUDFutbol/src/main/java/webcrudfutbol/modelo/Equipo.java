package webcrudfutbol.modelo;

/**
 *
 * @author aidan
 */
public class Equipo {
    private int idequipo;
    private String nombre;
    private String descripcion;

    public Equipo() {
    }

    public Equipo(int idequipo, String nombre, String descripcion) {
        this.idequipo = idequipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "idequipo=" + idequipo + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
}
