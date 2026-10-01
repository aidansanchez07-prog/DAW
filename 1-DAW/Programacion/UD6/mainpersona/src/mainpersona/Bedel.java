package mainpersona;

/**
 *
 * @author aidan
 */
public class Bedel extends Persona{
    private String centroTrabajo;
    private boolean turnoTarde;

    public Bedel(String centroTrabajo, boolean turnoTarde, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.centroTrabajo = centroTrabajo;
        this.turnoTarde = turnoTarde;
    }

    public Bedel(String centroTrabajo, boolean turnoTarde, String nombre, String apellidos, String direccion) {
        super(nombre, apellidos, direccion);
        this.centroTrabajo = centroTrabajo;
        this.turnoTarde = turnoTarde;
    }

    public String getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(String centroTrabajo) {
        this.centroTrabajo = centroTrabajo;
    }

    public boolean isTurnoTarde() {
        return turnoTarde;
    }

    public void setTurnoTarde(boolean turnoTarde) {
        this.turnoTarde = turnoTarde;
    }
    @Override
    public String saludar(){
        return "(Bedel)Hola: "+this.nombre+" "+this.apellidos;
    }

    @Override
    public String toString() {
        return "\nBedel" +super.toString()+ "\nCentro de trabajo: " + centroTrabajo + "\n Turno: " + (turnoTarde ? "Tarde":"Mañana") ;
    }
    
}
