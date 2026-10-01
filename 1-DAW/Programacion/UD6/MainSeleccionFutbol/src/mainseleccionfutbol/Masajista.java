package mainseleccionfutbol;

import java.util.Date;
import java.time.*;
/**
 *
 * @author aidan
 */
public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String titulacion, int aniosExperiencia, int id, String Nombre, String Apellidos, Date fechaNacimiento) {
        super(id, Nombre, Apellidos, fechaNacimiento);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(int id, String Nombre, String Apellidos, Date fechaNacimiento) {
        super(id, Nombre, Apellidos, fechaNacimiento);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
     @Override
    public String Concentrarse() {
        return Nombre + "(masajista) convocado para la concentracion de la seleccion";
    }

    @Override
    public String Viajar() {
        return Nombre + " viaja a la concentracion";
    }

    public void darMasaje(String jugador) {
        System.out.println(Nombre+" realiza un masaje a "+jugador);
    }

   

    @Override
    public String toString() {
        return "\n"+this.getClass().getSimpleName()+"\nId"+id + "\nNombre: " + Nombre + "\nEdad: " + this.calculaEdad() + "\nTitulacion: " + titulacion+"\nAños de experiencia: "+aniosExperiencia;
    }
}
