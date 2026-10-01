package com.webcrudfutbol.modelo;

/**
 *
 * @author aidan
 */
public class Futbolista {
    private int idfutbolista;
    private String nombre;
    private int goles;
    private double sueldo;
    private String nombreEquipo;

    public Futbolista() {
    }

    public Futbolista(int idfutbolista, String nombre, int goles, double sueldo) {
        this.idfutbolista = idfutbolista;
        this.nombre = nombre;
        this.goles = goles;
        this.sueldo = sueldo;
    }

    public Futbolista(int idfutbolista, String nombre, int goles, double sueldo, String nombreEquipo) {
        this.idfutbolista = idfutbolista;
        this.nombre = nombre;
        this.goles = goles;
        this.sueldo = sueldo;
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
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

    @Override
    public String toString() {
        return "Futbolista{" + "idfutbolista=" + idfutbolista + ", nombre=" + nombre + ", goles=" + goles + ", sueldo=" + sueldo + ", nombreEquipo=" + nombreEquipo + '}';
    }
    
}
