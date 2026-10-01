package mainempleados;

import java.time.LocalDate;

/**
 *
 * @author aidan
 */
public abstract class Empleados {
    protected int codEmpleado;
    protected String nombre;
    protected String apellidos;
    protected double sueldo;
    protected LocalDate fechaContratacion;
    
    public abstract double obtenSueldoActual();

    public Empleados(int codEmpleado, String nombre, String apellidos, double sueldo, LocalDate fechaContratacion) {
        this.codEmpleado = codEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.fechaContratacion = fechaContratacion;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "\nEmpleado" + "\ncodEmpleado=" + codEmpleado + "\nnombre=" + nombre + "\napellidos=" + apellidos + "\nsueldo=" + sueldo + "\nfechaContratacion=" + fechaContratacion + '}';
    }
    
}
