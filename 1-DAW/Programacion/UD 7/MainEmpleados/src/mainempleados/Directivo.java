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
public class Directivo extends Empleados {
    private int bonoExperiencia;

    public Directivo(int bonoExperiencia, int codEmpleado, String nombre, String apellidos, double sueldo, LocalDate fechaContratacion) {
        super(codEmpleado, nombre, apellidos, sueldo, fechaContratacion);
        this.bonoExperiencia = bonoExperiencia;
    }

    

    public int getBonoExperiencia() {
        return bonoExperiencia;
    }

    public void setBonoExperiencia(int bonoExperiencia) {
        this.bonoExperiencia = bonoExperiencia;
    }
  
    @Override
      public double obtenSueldoActual(){
          return (sueldo+(bonoExperiencia*Utils.calculaDifAniosHoy(this.fechaContratacion )));
      }

    @Override
    public String toString() {
        return "\nDirectivo" +super.toString()+ "\nBono Experiencia: " + bonoExperiencia+"\nSueldo: "+obtenSueldoActual();
    }
      
}
