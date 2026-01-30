package mainpersona;
import java.util.*;
/**
 *
 * @author aidan
 */
public class Mainpersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Persona>personas=new TreeSet<>(
        Comparator.comparing((Persona p)->p.apellidos)
        .thenComparing(Persona::getNombre)
        .thenComparing(Persona::getApellidos));
        //Aññadir persona
        Alumno a1=new Alumno("DAW","Manuel","Martin");
        System.out.println(a1.getClass().getSimpleName());
        Alumno a2= new Alumno("DAW","Olga","Padial");
        Alumno a3=new Alumno("Bach","Pablo","Carrillo");
        Profesor p1=new Profesor("Informatica","Jose Miguel"," Cab");
        Profesor p2=new Profesor("Informatica","Carmen","Mac");
        Bedel b1=new Bedel("IES Salduba",false,"Antonio","N.");
        personas.add(a1);
        personas.add(a2);
        personas.add(a3);
        personas.add(p1);
        personas.add(p2);
        personas.add(b1);
        System.out.println("Listado\n");
        for (Persona p:personas){
            System.out.println(p);
        }
        System.out.println("Saludamos a las personas");
          for (Persona p:personas){
            System.out.println(p.saludar());
        }
    }
}
