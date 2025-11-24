package mainbicicleta;

import java.util.Random;

/**
 *
 * @author aidan
 */
public class Bicicleta {
    //Creamos nuestro objeeto bicicleta

    //Atributos (que definen el estado del objeto)
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;

    //Constructor
    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    //Metodos get- devuelven al main el valor actual del objeto del atributo oportuno referenciado en metodo get
    public int getVelocidadActual() {
        return this.velocidadActual;
    }

    public int getPlatoActual() {
        return this.platoActual;
    }

    public int getPinonActual() {
        return this.pinonActual;
    }

    //Metodos set - establecen el valor del atributo del objeto
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public void setPinonActual(int pinonActual) {
        this.pinonActual = pinonActual;
    }
    //Metodos - Cambiamos el comportamiento
    public void acelerar(){
        Random aleatorio=new Random();
        this.velocidadActual =velocidadActual+aleatorio.nextInt(10)+1;
    }
     public void frenar(){
        Random aleatorio=new Random();
        this.velocidadActual =velocidadActual-aleatorio.nextInt(10)+1;
    }
     public void cambiarPlato(int plato){
         this.platoActual = plato;
        
     }
     public void cambiarPinon(int pinon){
  
        this.pinonActual = pinon;
     }
}
