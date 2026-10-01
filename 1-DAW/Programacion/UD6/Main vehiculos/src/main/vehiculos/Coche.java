package main.vehiculos;

import java.io.IOException;

/**
 *
 * @author aidan
 */
public class Coche implements Vehiculo{
  private String matricula;
    private String Marca;
    private String Modelo;
    private int numRuedas;
    private int VelocidadActual;
    
    public static int velocidadMaxima=125;
    public void acelerar() throws IOException{
        this.VelocidadActual+=(int)(Math.random()*20);
        if(VelocidadActual>velocidadMaxima){
            throw new IOException("Illo que te van a multar");
        }
    }
    public void acelerarMucho() throws DemasiadoRapidoException{
        this.VelocidadActual+=(int)(Math.random()*50);
        if(VelocidadActual>velocidadMaxima){
            throw new DemasiadoRapidoException("Illo que te vas a matar");
        }
    }
    public Coche() {
    }

    public Coche(String matricula, String Marca, String Modelo, int numRuedas, int VelocidadActual) {
        this.matricula = matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.numRuedas = numRuedas;
        this.VelocidadActual = VelocidadActual;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual= VelocidadActual;
    }

    
    
    @Override
    public void arrancar(){
        System.out.println("Arrancando coche");
    }
    @Override
    public void detener(){
        System.out.println("Deteniendo coche");
    }
}
