package mainficherofutbol;

/**
 *
 * @author aidan
 */

import java.time.*;
import java.util.Date;

/**
 *
 * @author aidan
 */
public abstract class SeleccionFutbol {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected Date fechaNacimiento;
    public abstract String Concentrarse();
    public abstract String Viajar();

    public SeleccionFutbol(int id, String Nombre, String Apellidos, Date fechaNacimiento) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //calcular edad
  public int calculaEdad(){
        //opcion1 -> no es la mejor solucion, ni la más exacta. getYear esta deprecated.
//        Date hoy = new Date();
//        return hoy.getYear()-this.getFechaNacimiento().getYear();

        //opcion2. Conviertiendo de Date a LocalDate.
        LocalDate fechaNac = this.fechaNacimiento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        
        //fecha actual en LocalDate
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNac, hoy).getYears();
    }

    @Override
    public String toString() {
        return (id+1)+"\nNombre: " + Nombre + "\nApellidos: " + Apellidos + "\nFecha de Nacimiento: " + fechaNacimiento;
    }
    
}
