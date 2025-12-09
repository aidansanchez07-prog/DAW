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
    public void acelerar() {
        Random aleatorio = new Random();
        this.velocidadActual = velocidadActual + aleatorio.nextInt(10) + 1;
    }

    public void frenar() {
        Random aleatorio = new Random();
        this.velocidadActual = velocidadActual - aleatorio.nextInt(10) + 1;
    }

    public boolean cambiarPlato(int plato) {
        if (this.platoActual >= 1 || this.platoActual <= 3) {
            return true;
        } else {
            return false;
        }
    
    }

    public boolean cambiarPinon(int pinon) {
        if (this.pinonActual >= 1 || this.pinonActual <= 13) {
            return true;
        } else {
            return false;
        }
    
    }

    public void cambiarPlato(String plato) {
        System.out.println("Introduzca + si quieres subir el plato o - si quieres disminuirlos");
        String calibPlato = System.console().readLine();
        if (calibPlato.equals("+")) {
            if (this.platoActual == 3) {
                System.out.println("No puedes aumentar más los platos");
            } else {
                this.platoActual++;
            }

        } else if (calibPlato.equals("-")) {
            if (this.platoActual == 1) {
                System.out.println("No puedes disminuir más los platos");
            } else {
                this.platoActual--;
            }

        } else {
            System.out.println("Valor incorrecto");
        }
    }

    public void cambiarPinon(String pinon) {

        System.out.println("Introduzca + si quieres subir el pinon o - si quieres disminuirlos");
        String calibPinon = System.console().readLine();
        if (calibPinon.equals("+")) {
            if (this.pinonActual == 12) {
                System.out.println("No puedes aumentar más los pinones");
            } else {
                this.pinonActual++;
            }

        } else if (calibPinon.equals("-")) {
            if (this.pinonActual == 1) {
                System.out.println("No puedes disminuir más los pinones");
            } else {
                this.pinonActual--;
            }

        } else {
            System.out.println("Valor incorrecto");
        }
    }
}
