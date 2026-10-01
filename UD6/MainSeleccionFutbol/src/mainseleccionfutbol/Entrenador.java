package mainseleccionfutbol;

import java.util.Date;
import java.time.*;
/**
 *
 * @author aidan
 */
public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador(String idFederacion, int id, String Nombre, String Apellidos, Date fechaNacimiento) {
        super(id, Nombre, Apellidos, fechaNacimiento);
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String Nombre, String Apellidos, Date fechaNacimiento) {
        super(id, Nombre, Apellidos, fechaNacimiento);
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String Concentrarse() {
        return Nombre + " entra en la concentración";
    }

    @Override
    public String Viajar() {
        return Nombre + " viaja para iniciar la concentracion";
    }

    public void dirigirPartido() {
        System.out.println(this.Nombre + " designa como formación 4-2-1-3 para la selección " + this.idFederacion);
    }

    public void dirigirEntrenamiento() {
        System.out.println(this.Nombre + " dirige el entrenamiento de la seleccion " + this.idFederacion);
    }

    @Override
    public String toString() {
        return"\n"+ this.getClass().getSimpleName()+"\nId"+id + "\nNombre: " + Nombre + "\nEdad: " + this.calculaEdad() + "\nFederacion: " + idFederacion;
    }

}
