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
public class Tecnico extends Operario {

    public Tecnico(int grattificacion, int codEmpleado, String nombre, String apellidos, double sueldo, LocalDate fechaContratacion) {
        super(grattificacion, codEmpleado, nombre, apellidos, sueldo, fechaContratacion);
    }



 
    
    @Override
      public double obtenSueldoActual(){
            return sueldo+grattificacion;
      }
      @Override
    public String toString() {
        return "\nTecnico"+super.toString() +"\nSueldo: "+obtenSueldoActual() ;
    }
}
