package baloncestomain;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class BaloncestoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Equipos> listaEquipos = new ArrayList<>();
        ArrayList<Arbitro> listaArbitros = new ArrayList<>();
        ArrayList<Partido> listaPartidos = new ArrayList<>();
        int opcion = -1;
        do {
            System.out.println("\n===== MENÚ LIGA BALONCESTO =====");
            System.out.println("1. Crear equipo");
            System.out.println("2. Crear jugador y añadirlo a un equipo");
            System.out.println("3. Añadir arbitro");
            System.out.println("4. Crear Jornada");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = Integer.parseInt(System.console().readLine());
            String nombreEquipo;
            String nombreEstadio;
            Double espectadores;
            String direccion;
            String ciudad;
            String division;
            boolean asciende;
            switch (opcion) {
                case 1:
                    // EquipoFutbol equipo1 = new EquipoFutbol("Málaga CF", "Rosaleda",30.044,"P.º Martiricos, s/n", "Málaga" ,"Primera división",false);
                    Equipos temp;
                    System.out.println("Introduce el nombre del equipo");
                    nombreEquipo = System.console().readLine();
                    System.out.println("Introduce el nombre del Estadio");
                    nombreEstadio = System.console().readLine();
                    System.out.println("Capacidad del campo");
                    espectadores = Double.parseDouble(System.console().readLine());
                    System.out.println("Introduce La direccion");
                    direccion = System.console().readLine();
                    System.out.println("Nombre de la ciudad");
                    ciudad = System.console().readLine();

                    temp = new Equipos(nombreEquipo, nombreEstadio, espectadores, direccion, ciudad);
                    listaEquipos.add(temp);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del equipo al que quieres añadir el jugador.");
                    nombreEquipo = System.console().readLine();
                    // controlo si existe el equipo.
                    for (int i = 0; i < listaEquipos.size(); i++) {
                        if (listaEquipos.get(i).getNombreEquipo().equalsIgnoreCase(nombreEquipo)) {
                            // Crear jugador
                            System.out.print("Nombre jugador: ");
                            String nomJugador = System.console().readLine();
                            int edad = obtenNumeroEntero("Edad: ");
                            double peso = obtenNumeroDouble("Peso: ");
                            double altura = obtenNumeroDouble("Altura: ");

                            //opcion 1
                            //Estadisticas estadisticas = new Estadisticas(goles, faltas, partidos, amarillas, rojas);
                            //Jugador jugador = new Jugador(nomJugador, edad, peso, altura, estadisticas);
                            // opcion 2
                            // creo el jugador con todos los datos (en el constructor del jugador crea el objeto estadisticas con los datos que le paso)
                            Jugador jugador = new Jugador(nomJugador, edad, peso, altura);
                            listaEquipos.get(i).altaJugador(jugador);
                        } else if ((i == listaEquipos.size() - 1) && (!listaEquipos.get(i).getNombreEquipo().equalsIgnoreCase(nombreEquipo))) {
                            System.out.println("Equipo no encontrado.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Dime el nombre del arbitro");
                    String nombreArbitro = System.console().readLine();
                    int edadArbitro = obtenNumeroEntero("Dime la edad del árbitro: ");
                    listaArbitros.add(new Arbitro(nombreArbitro, edadArbitro));

                    break;
                case 4:
                    listaPartidos = creaJornada(listaEquipos, listaArbitros);
                    mostrarPartidos(listaPartidos);

                    break;
                case 5:
                    for (int i = 0; i < listaEquipos.size(); i++) {
                        System.out.println(listaEquipos.get(i));
                    }
                case 0:
                    break;
                default:

            }
        } while (opcion != 0);
    }

    public static ArrayList<Partido> creaJornada(ArrayList<Equipos> listaEquipos, ArrayList<Arbitro> listaArbitros) {
        ArrayList< Partido> listaEncuentros = new ArrayList<>();
        ArrayList<Equipos>listaEquipos2=listaEquipos=new ArrayList<>(listaEquipos);
        ArrayList<Arbitro>listaArbitros2=listaArbitros=new ArrayList<>(listaArbitros);
//        listaEquipos2=listaEquipos;
//        listaArbitros2=listaArbitros;
        while(listaEquipos2.size()>1 && (listaArbitros2.size()>0)){
           int pos1=(int)(Math.random()*listaEquipos2.size());
           Equipos eq1=listaEquipos2.get(pos1);
           listaEquipos2.remove(pos1);
           pos1=(int)(Math.random()*listaEquipos2.size());
           Equipos eq2=listaEquipos2.get(pos1);
           listaEquipos2.remove(pos1);
           pos1=(int)(Math.random()*listaArbitros2.size());
           Arbitro arbiTemp=listaArbitros2.get(pos1);
           listaArbitros2.remove(pos1);
           Partido partidoTemp= new Partido(eq1,eq2, arbiTemp);
           listaEncuentros.add(partidoTemp);
        }
        return listaEncuentros;
    }
    public static void mostrarPartidos(ArrayList<Partido> listaEncuentros){
        for (int i = 0; i < listaEncuentros.size(); i++) {
            System.out.println(listaEncuentros.get(i));
        }
    }

    public static int obtenNumeroEntero(String mensaje) {
        int numero = -1;
        do {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Formato de número incorrecto.");
                numero = -1;
            }
        } while (numero == -1);
        return numero;
    }

    public static double obtenNumeroDouble(String mensaje) {
        double numero = -1;
        do {
            System.out.print(mensaje);
            try {
                numero = Double.parseDouble(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Formato de número incorrecto.");
                numero = -1;
            }
        } while (numero == -1);
        return numero;
    }
}
