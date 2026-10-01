package mainempleados;

import java.io.BufferedReader;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class Utils {

    public static void cargaEmpleados(ArrayList<Empleados> lista, String ruta) {
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
        int cod = 0;
        double sueldo = 0;
        int contador = 1;
        int bono = 0;

        LocalDate Fecha;
        try {
            br = new BufferedReader(new FileReader(ruta));

            String linea = br.readLine();
            while (linea != null) {
                String[] texto = linea.split(";");

                if (texto.length == 7) {
                    try {
                        
                        cod = Integer.parseInt(texto[1]);
                        sueldo = Double.parseDouble(texto[4].replace(",", "."));
                        logError="Linea: "+contador+" generada correctamente";
                        bono = Integer.parseInt(texto[6]);
                    } catch (Exception e) {
                        logError = "Parametro numerico erroneo en la linea: " + contador;
                       
                    }
                    Fecha = comprobarFecha(texto[5]);
                    switch (texto[0]) {
                        case "D":
                            Directivo dTEmp = new Directivo(bono, cod, texto[2], texto[3], sueldo, Fecha);
                            lista.add(dTEmp);
                            break;
                        case "O":
                            Oficial oTemp = new Oficial(bono, cod, texto[2], texto[3], sueldo, Fecha);
                            lista.add(oTemp);
                            break;
                        case "T":
                            Tecnico tTemp = new Tecnico(bono, cod, texto[2], texto[3], sueldo, Fecha);
                            lista.add(tTemp);
                            break;
                        default:
                            logError = "Tipo de empleado no identificado en la linea: " + contador;
                    }

                } else {
                    logError = "Parametros insuficientes en la linea: " + contador;
                }
                contador++;
                escribeLog(".\\log.txt", logError);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException fnfe) {
            logError = "Fichero no encontrado en la linea: " + contador;
            escribeLog(".\\log.txt", logError);

        } catch (IOException ioe) {
            logError = "Error de lectura en la linea: " + contador;
            escribeLog(".\\log.txt", logError);

        } finally {
            
        }

    }

    public static void listarEmpleados(ArrayList<Empleados> lista) {
        for (Empleados e : lista) {
            System.out.println(e);
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

    public static int calculaDifAniosHoy(LocalDate fechaParam) {
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaParam, hoy).getYears();
    }

    public static LocalDate comprobarFecha(String fechaParam) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean correcto = true;

        LocalDate fecha = LocalDate.now();
        try {
            fecha = LocalDate.parse(fechaParam, formato);
        } catch (Exception e) {
            correcto = false;
        }
        return fecha;
    }

    public static void generaNominasMes(ArrayList<Empleados> lista, String ruta) {
        // Recordemos en el caso de directivo el sueldo final era sueldoBase + (bono * anios_experiencia)
        // En el caso de Operarios el sueldo final era sueldoBase + gratificación
        // Puesto;id;nombre;apellidos;sueldoFinalMensual;fecha_contratación;mes_anio_facturación
        //Directivo;1;Ana;López;1800.00;01/01/2002;03/2026
        //Tecnico;3;Carlos;Pérez;1660.00;01/01/2020;03/2026
        //Oficial;4;Laura;Gómez;1320.75;01/01/2020;03/2026
        //Técnico;5;Pepe;Gómez;1520,50;01/01/2018;03/2026
        //Oficial;6;José;;1550.50;01/01/2015;03/2026
        borraLog(ruta);
        for (int i = 0; i < lista.size(); i++) {
            String chorizoEmpleado = "";

            if (lista.get(i) instanceof Directivo) {
                chorizoEmpleado = "Directivo;";

            } else if (lista.get(i) instanceof Oficial) {
                chorizoEmpleado = "Oficial;";
            } else if (lista.get(i) instanceof Tecnico) {
                chorizoEmpleado = "Tecnico;";
            }

            chorizoEmpleado += lista.get(i).codEmpleado+";"+lista.get(i).getNombre() + ";" + lista.get(i).getApellidos() + ";" + lista.get(i).obtenSueldoActual() + ";" + lista.get(i).getFechaContratacion()+";"+LocalDate.now();
            System.out.println(chorizoEmpleado);
            escribeNominas(ruta, chorizoEmpleado);
        }
    }

    public static void escribeNominas(String ruta, String logError) {
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
}
