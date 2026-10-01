package com.webcrudempleados.modelo;

/**
 *
 * @author jmigu
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private String fechaIngreso;
    private double sueldo;
    private String nombreDepto;
    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellidos, String fechaIngreso, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }
    public Empleado(int id, String nombre, String apellidos, String fechaIngreso, double sueldo, String nombreDepto) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
        this.nombreDepto=nombreDepto;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaIngreso=" + fechaIngreso + ", sueldo=" + sueldo + ", nombreDepto=" + nombreDepto + '}';
    }

    
    
}
