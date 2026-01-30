package mainseleccionfutbol;

import java.util.Date;

/**
 *
 * @author aidan
 */
public abstract class SeleccionFutbol {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected Date fechaNacimiento;
    public abstract void Concentrarse();
    public abstract void Viajar();

    public SeleccionFutbol(int id, String Nombre, String Apellidos, Date fechaNacimiento) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //calcular edad
    public int calculaEdad(){
        return 1;
    }

    @Override
    public String toString() {
        return (id+1)+"\nNombre: " + Nombre + "\nApellidos: " + Apellidos + "\nFecha de Nacimiento: " + fechaNacimiento;
    }
    
}
