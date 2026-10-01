package mainseleccionfutbol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author aidan
 */
public class MainSeleccionFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<SeleccionFutbol> listaSeleccion = new LinkedList<>();
//        int id = 0;
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("Introduce la fecha de nacimiento  dd/MM/yyyy");
//        String fechaN = System.console().readLine();
//        try {
//            Date fechaNac = sdf.parse(fechaN);
//            Entrenador e1 = new Entrenador("España", 1, "Luis", "de la Fuente", fechaNac);
//            System.out.println(e1);
//        } catch (Exception e) {
//            System.out.println("Introduce correctamente la variable");
//        }
//
//        //Entrenador e1=new Entrenador("España",1,"Luis","de la Fuente",new Date("21/07/1961"));
//        System.out.println("Dime la demarcacion del jugador: ");
//        Demarcacion dm=Demarcacion.portero;
//        try {
//             dm = Demarcacion.valueOf(System.console().readLine().toLowerCase());
//        } catch (IllegalArgumentException e) {
//            System.out.println("La demarcación introducida no es correcta.");
//
//        }
//        try {
//            Date fechaNac = sdf.parse("15/09/1995");
//            Futbolista f1 = new Futbolista(1, dm, 2, "David", "Raya", fechaNac);
//            System.out.println(f1);
//        } catch (ParseException e) {
//            System.out.println("Introduce correctamente la variable");
//        }
//Opcion 2 para el date
        
// LocalDate: representa a fechas sin la hora y nos facilita su manejo para declararlas, sumar y restar fechas y compararlas.
// LocalTime: es idéntica a la anterior pero para el manejo de horas, sin ninguna fecha asociada, pudiendo así compararlas, sumar o restar tiempo a las mismas...
// LocalDateTime: como puedes suponer, es una combinación de las dos anteriores, que permite hacer lo mismo con fechas y horas simultáneamente.
// Instant: es muy parecida a la anterior pero a la vez muy diferente. Se usa para almacenar un punto determinado en el tiempo, o sea con fecha y hora, pero guarda su valor como un timestamp de UNIX, es decir, en nanosegundos desde el epoch de UNIX (1/1/1970 a las 00:00) y usando la zona horaria UTC. Es muy útil para manejar momentos en el tiempo de manera neutra e intercambiarlo entre aplicaciones y sistemas, por lo que lo verás utilizado muy a menudo.
// ZonedDateTime: esta clase es como la LocalDateTime pero teniendo en cuenta una zona horaria concreta, ya que las anteriores no la tienen en cuenta.
// Period: esta clase auxiliar nos ayuda a obtener diferencias entre fechas en distintos periodos (segundos, minutos, días...) y también a añadir esas diferencias a las fechas.
// Duration: esta es muy parecida a la anterior pero para manejo de horas exclusivamente.

        int op = -1;
        int opcrear = -1;
        do {
            System.out.println("Introduzca una opcion: 1 para generar un miembro de la seleccion de futbol, 2 para eliminar un miembro, 3 para listar y 0 para salir");
            op = obtenNumeroEntero("Opcion:");
            switch (op) {
                case 1:
                    do {
                        System.out.println("Introduzca una opcion: 1 para crear un futbolista, 2 para crear un entrenador, 3 para crear un masajista y 0 para cancelar la accion ");
                        opcrear = obtenNumeroEntero("Opcion:");
                        switch (opcrear) {
                            case 1:
                                listaSeleccion.add(creaFutbolista());
                                opcrear = 0;
                                break;
                            case 2:
                                listaSeleccion.add(creaEntrenador());
                                opcrear = 0;
                                break;
                            case 3:
                                listaSeleccion.add(creaMasajista());
                                opcrear = 0;
                                break;
                            case 0:
                                System.out.println("Po nada nos vemos");
                                break;
                            default:
                                System.out.println("Inserte una opcion correcta ");

                        }
                    } while (opcrear != 0);

                    break;
                case 2:
                    System.out.println("Dime el id del jugador que desea eliminar");
                    for (SeleccionFutbol sf : listaSeleccion) {
                        System.out.println(sf);
                    }
                    int id = obtenNumeroEntero("");
                    bajaIntegrante(id, listaSeleccion);
                    break;
                case 3:
                    System.out.println("Introduzca 1 para ver toda la seleccion, introduzca 2 para ver solo futbolistas, 3 para ver solo entrenadores, 4 para ver solo masajistas o 0 para cancelar la accion");
                    int oplistar = obtenNumeroEntero("");
                    listarSeleccion(oplistar, listaSeleccion);
                    break;
                case 0:
                    System.out.println("Hasta luego Lucas");
                    break;
                default:
                    System.out.println("Valor incorrrecto");

            }
        } while (op != 0);
    }

    public static int obtenNumeroEntero(String mensaje) {
        int numero = 0;
        System.out.println(mensaje);
        boolean a = true;
        do {
            try {
                numero = Integer.parseInt(System.console().readLine());
                a = true;
            } catch (NumberFormatException e) {
                numero = -1;
                System.out.println("Introduce un valor numerico");
                a = false;
            }
        } while (a == false);

        return numero;
    }

    //int dorsal, Demarcacion demarcacion, int id, String Nombre, String Apellidos, Date fechaNacimiento, int goles, int faltas, int partidosJugados,
//            int tarjetasAmarillas, int tarjetasRojas
    public static Futbolista creaFutbolista() {
        System.out.println("Introduce un dorsal");
        int dorsal = obtenNumeroEntero("");
        Demarcacion dm = obtenDemarcacion();
        System.out.println("Introduce el id");
        int id = obtenNumeroEntero("");
        System.out.println("Dime el nombre");
        String nombre = System.console().readLine();
        System.out.println("Dime los apellidos");
        String apellidos = System.console().readLine();
        Date fechaNac = obtenFechaNacimiento();
        System.out.println("Dime el numero de goles");
        int goles = obtenNumeroEntero("");
        System.out.println("Dime el numero de faltas");
        int faltas = obtenNumeroEntero("");
        System.out.println("Dime el numero de partidos jugados");
        int partidosJugados = obtenNumeroEntero("");
        System.out.println("dime el numero de tarjetas amarillas");
        int tarjetasAmarillas = obtenNumeroEntero("");
        System.out.println("Dime el numero de tarjetas rojas");
        int tarjetasRojas = obtenNumeroEntero("");
        Futbolista fTemp = new Futbolista(dorsal, dm, id, nombre, apellidos, fechaNac, goles, faltas, partidosJugados, tarjetasAmarillas, tarjetasRojas);
        return fTemp;
    }

    public static Entrenador creaEntrenador() {
        System.out.println("Dime el id de la federacion");
        String idFederacion = System.console().readLine();
        System.out.println("Dime el id");
        int id = obtenNumeroEntero("");
        System.out.println("Dime el nombre");
        String nombre = System.console().readLine();
        System.out.println("Dime los apellidos");
        String apellidos = System.console().readLine();

        Date fechaNac = obtenFechaNacimiento();
        Entrenador eTemp = new Entrenador(idFederacion, id, nombre, apellidos, fechaNac);
        return eTemp;
    }

    //String titulacion, int aniosExperiencia, int id, String Nombre, String Apellidos, Date fechaNacimiento
    public static Masajista creaMasajista() {
        System.out.println("Dime la titulacion");
        String titulacion = System.console().readLine();
        System.out.println("Dime sus años de experiencia");
        int aniosExperiencia = obtenNumeroEntero("");
        System.out.println("Dime el id");
        int id = obtenNumeroEntero("");
        System.out.println("Dime el nombre");
        String nombre = System.console().readLine();
        System.out.println("Dime los apellidos");
        String apellidos = System.console().readLine();
        Date fechaNac = obtenFechaNacimiento();
        Masajista mTemp = new Masajista(titulacion, aniosExperiencia, id, nombre, apellidos, fechaNac);
        return mTemp;
    }

  public static Date obtenFechaNacimiento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String fechaN ;
        Date fechaNac = new Date("01/01/0101");
        boolean a = true;
        do {
            try {
                        System.out.println("Introduce la fecha de nacimiento (formato dd/mm/yyyy): ");
                 fechaN = System.console().readLine();
                fechaNac = sdf.parse(fechaN);
                a = true;
            } catch (Exception e) {
                System.out.println("Introduce correctamente la variable.");
                a = false;
            }
        } while (a == false);
        return fechaNac;
    }

    public static void bajaIntegrante(int id, LinkedList<SeleccionFutbol> listaSeleccion) {
        Iterator<SeleccionFutbol> it = listaSeleccion.iterator();

        while (it.hasNext()) {
            SeleccionFutbol p = it.next();

            if (p.id == id) {
                it.remove();
                System.out.println("Integrante con id " + id + " eliminado.");
                
            }
        }
        System.out.println("No existe ningún integrante con id " + id);
    }

    public static Demarcacion obtenDemarcacion() {
        boolean a = true;
        Demarcacion dm = Demarcacion.portero;
        do {
            System.out.println("Dime la demarcacion del jugador: ");

            try {
                dm = Demarcacion.valueOf(System.console().readLine().toLowerCase());
                a = true;
            } catch (IllegalArgumentException e) {
                System.out.println("La demarcación introducida no es correcta.");
                a = false;
            }
        } while (a == false);
        return dm;
    }

    public static void listarSeleccion(int opcion, LinkedList<SeleccionFutbol> listaSeleccion) {
        do {
            switch (opcion) {
                case 1:
                    for (SeleccionFutbol sf : listaSeleccion) {
                        System.out.println(sf);
                    }
                    opcion = 0;
                    break;
                case 2:
                    System.out.println("Futbolistas:");
                    for (SeleccionFutbol sf : listaSeleccion) {
                        if (sf instanceof Futbolista) {
                            System.out.println(sf);
                        }
                    }
                    opcion = 0;
                    break;
                case 3:
                    System.out.println("Entrenadores:");
                    for (SeleccionFutbol sf : listaSeleccion) {
                        if (sf instanceof Entrenador) {
                            System.out.println(sf);
                        }
                    }
                    opcion = 0;
                    break;
                case 4:
                    System.out.println("Masajistas:");
                    for (SeleccionFutbol sf : listaSeleccion) {
                        if (sf instanceof Masajista) {
                            System.out.println(sf);
                        }
                    }
                    opcion = 0;
                    break;
                case 0:
                    System.out.println("Po nada nos vemos");
                default:
                    System.out.println("Introduce una valor valido");

            }
        } while (opcion != 0);
    }
}
