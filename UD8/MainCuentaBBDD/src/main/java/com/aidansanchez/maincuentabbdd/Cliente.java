package com.aidansanchez.maincuentabbdd;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private ArrayList<Cuenta> listaCuentas;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.listaCuentas = new ArrayList();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", listaCuentas=" + listaCuentas + '}';
    }
    public void asignaCuenta(String numCuenta,String nombreCuenta){
        Cuenta cu= new Cuenta(numCuenta,nombreCuenta);
        this.listaCuentas.add(cu);
    }
}
