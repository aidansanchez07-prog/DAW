package main.carrera;

import java.util.Random;

/**
 *
 * @author aidan
 */
public class Bicicleta {
    private String nombre;
    private int max;
    private int velocidadActual;
    private int posicionX;
    public Bicicleta(String nombre, int max, int velocidadActual, int posicionX){
       this.nombre=nombre;
       this.max=max;
       this.velocidadActual=velocidadActual;
       this.posicionX=posicionX;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    public int getVelocidadActual() {
        return this.velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public int getposicionX() {
        return this.posicionX;
    }
    public void setposicionX(int posicionX) {
        this.posicionX =posicionX;
    }
     public void acelerar() {
        Random aleatorio = new Random();
        this.velocidadActual = velocidadActual + aleatorio.nextInt(5) + 1;
    }

    public void frenar() {
        Random aleatorio = new Random();
        this.velocidadActual = velocidadActual - aleatorio.nextInt(5) + 1;
    }
    public void avanzar(){
        this.posicionX=posicionX+velocidadActual;
    }
}
