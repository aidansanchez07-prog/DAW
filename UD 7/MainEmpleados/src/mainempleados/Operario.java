/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempleados;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Daw
 */
public class Operario extends Empleados {
      protected int grattificacion;

    public Operario(int grattificacion, int codEmpleado, String nombre, String apellidos, double sueldo, LocalDate fechaContratacion) {
        super(codEmpleado, nombre, apellidos, sueldo, fechaContratacion);
        this.grattificacion = grattificacion;
    }

    

    public int getGrattificacion() {
        return grattificacion;
    }

    public void setGrattificacion(int grattificacion) {
        this.grattificacion = grattificacion;
    }
      
      
      
      
      @Override
      public double obtenSueldoActual(){
          return sueldo+grattificacion;
      }

    @Override
    public String toString() {
        return super.toString() + "\nGratificacion: " + grattificacion ;
    }
      
}
