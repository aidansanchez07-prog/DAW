package mainficherofutbol;

/**
 *
 * @author aidan
 */
import java.io.BufferedReader;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author aidan
 */
public class Utils {

    public static void cargaEmpleados(LinkedList<SeleccionFutbol> lista, String ruta) {
        // Directivo(int bonoExperiencia, int codEmpleado, String nombre, String apellidos, double sueldoBase, LocalDate fechaContratacion)
// D;1;Ana;López;1200.50;01/01/2002;90
// O;2;Carlos;
//  Tecnico(int gratificacion, int codEmpleado, String nombre, String apellidos, double sueldoBase, LocalDate fechaContratacion)
// T;3;Carlos;Pérez;1450.00;01/01/2020;60
// O;4;Laura;Gómez;1320.75;01/01/2020;60
// T;5;Pepe;Gómez;1520,50;01/01/2018;70
// O;6;José;;1550.50;01/01/2015;80
        String logError = "";
        BufferedReader br;
        int dorsal = 0;
        int id = 0;
        int contador = 1;
        int goles = 0;
        int faltas = 0;
        int partidosJugados = 0;
        int tarjetasAmarillas = 0;
        int tarjetasRojas = 0;
        int aniosExperiencia = 0;
        Demarcacion dm = Demarcacion.portero;
        Date fechaNacimiento;
        try {
            br = new BufferedReader(new FileReader(ruta));

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] texto = linea.split(";");

                if (texto.length == 12 || texto.length == 7 || texto.length == 6) {
//                  int dorsal, Demarcacion demarcacion, int id, String Nombre, String Apellidos, Date fechaNacimiento, int goles, int faltas, int partidosJugados,
//            int tarjetasAmarillas, int tarjetasRojas

//String idFederacion, int id, String Nombre, String Apellidos, Date fechaNacimiento

//String titulacion, int aniosExperiencia, int id, String Nombre, String Apellidos, Date fechaNacimiento
                    switch (texto[0]) {
                        case "F":
                            dorsal = Integer.parseInt(texto[1]);
                            try {
                                dm = Demarcacion.valueOf(texto[2].toLowerCase());
                               
                            } catch (IllegalArgumentException e) {
                               logError = "Demarcacion erronea en la linea: " + contador;
                             escribeLog(".\\log.txt", logError);
                              
                            }
                            id=Integer.parseInt(texto[3]);
                            fechaNacimiento=obtenFechaNacimiento(texto[6]);
                            goles=Integer.parseInt(texto[7]);
                            faltas=Integer.parseInt(texto[8]);
                            partidosJugados=Integer.parseInt(texto[9]);
                            tarjetasAmarillas=Integer.parseInt(texto[10]);
                            tarjetasRojas=Integer.parseInt(texto[11]);
                                    
                            Futbolista fTemp = new Futbolista(dorsal,dm,id,texto[4],texto[5],fechaNacimiento,goles,faltas,partidosJugados,tarjetasAmarillas,tarjetasRojas);
                            lista.add(fTemp);
                            break;
                        case "E":
                             id=Integer.parseInt(texto[2]);
                              fechaNacimiento=obtenFechaNacimiento(texto[5]);
                            Entrenador eTemp = new Entrenador(texto[1],id,texto[3],texto[4],fechaNacimiento);
                            lista.add(eTemp);
                            break;
                        case "M":
                            aniosExperiencia=Integer.parseInt(texto[2]);
                            id=Integer.parseInt(texto[3]);
                             fechaNacimiento=obtenFechaNacimiento(texto[6]);
                            Masajista mTemp = new Masajista(texto[1],aniosExperiencia,id,texto[4],texto[5],fechaNacimiento);
                            lista.add(mTemp);
                            break;
                        default:
                            logError = "Tipo de empleado no identificado en la linea: " + contador;
                    }

                } else {
                    logError = "Parametros insuficientes o de más en la linea: " + contador;
                }
                contador++;
                escribeLog(".\\log.txt", logError);
            }
            br.close();
        } catch (FileNotFoundException fnfe) {
            logError = "Fichero no encontrado en la linea: " + contador;
            escribeLog(".\\log.txt", logError);
        } catch (IOException ioe) {
            logError = "Error de lectura en la linea: " + contador;
            escribeLog(".\\log.txt", logError);
        } catch (Exception e) {
            logError = "Parametro numerico erroneo en la linea: " + contador;
            escribeLog(".\\log.txt", logError);
        } finally {

        }

    }

    public static void listarEmpleados(LinkedList<SeleccionFutbol> lista) {
        for (SeleccionFutbol sf : lista) {
            System.out.println(sf);
        }

    }

    public static void escribeLog(String ruta, String logError) {
        try {
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(logError);
            bw.newLine();
            bw.close();

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        } catch (Exception e) {

        }
    }

    public static void borraLog(String ruta) {
        File fichero = new File(ruta);
        if (fichero.exists()) {
            fichero.delete();
        }
    }

    public static int calculaDifAniosHoy(Date fechaNacimiento) {
        Date hoy = new Date();
        return hoy.getYear() - fechaNacimiento.getYear();
    }

    public static Date obtenFechaNacimiento(String fechaNacimiento) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date fechaNac = new Date("01/01/0101");
        boolean a = true;
        do {
            try {
                System.out.println("Introduce la fecha de nacimiento (formato dd/mm/yyyy): ");

                fechaNac = sdf.parse(fechaNacimiento);
                a = true;
            } catch (Exception e) {
                System.out.println("Introduce correctamente la variable.");
                a = false;
            }
        } while (a == false);
        return fechaNac;
    }
}
