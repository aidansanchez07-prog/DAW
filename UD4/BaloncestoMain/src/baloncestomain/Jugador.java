package baloncestomain;

/**
 *
 * @author aidan
 */
public class Jugador {
 private String nombreJugador;
    private int edad;
    private double peso;
    private double altura;
    
    //constructor vacio

    public Jugador() {
    }

    public Jugador(String nombreJugador, int edad, double peso, double altura) {
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        
    }
    
    public Jugador(String nombreJugador, int edad, double peso, double altura, int goles,int faltas, int partidos, int amarillas, int rojas) {
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        
       
    }

    // getters y setters
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() { 
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    
   // sobre escribimos el toString
    @Override
    public String toString() {
        return "\n---Jugador ---\n" +
                "\n Nombre jugador=" + nombreJugador + 
                "\n Edad=" + edad +
                "\n Peso=" + peso +
                "\n altura=" + altura ;
               
    }
}
