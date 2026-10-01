package com.aidansanchez.mainfutbolbbdd;

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
                    switch (texto[0]) {
                        case "F":
                            dorsal = Integer.parseInt(texto[1]);
                            try {
                                dm = Demarcacion.valueOf(texto[2].toLowerCase());
                            } catch (IllegalArgumentException e) {
                                logError = "Demarcacion erronea en la linea: " + contador;
                                escribeLog(".\\log.txt", logError);
                            }
                            id = Integer.parseInt(texto[3]);
                            fechaNacimiento = obtenFechaNacimiento(texto[6]);
                            goles = Integer.parseInt(texto[7]);
                            faltas = Integer.parseInt(texto[8]);
                            partidosJugados = Integer.parseInt(texto[9]);
                            tarjetasAmarillas = Integer.parseInt(texto[10]);
                            tarjetasRojas = Integer.parseInt(texto[11]);
                            Futbolista fTemp = new Futbolista(dorsal, dm, id, texto[4], texto[5], fechaNacimiento, goles, faltas, partidosJugados, tarjetasAmarillas, tarjetasRojas);
                            lista.add(fTemp);
                            break;
                        case "E":
                            id = Integer.parseInt(texto[2]);
                            fechaNacimiento = obtenFechaNacimiento(texto[5]);
                            Entrenador eTemp = new Entrenador(texto[1], id, texto[3], texto[4], fechaNacimiento);
                            lista.add(eTemp);
                            break;
                        case "M":
                            aniosExperiencia = Integer.parseInt(texto[2]);
                            id = Integer.parseInt(texto[3]);
                            fechaNacimiento = obtenFechaNacimiento(texto[6]);
                            Masajista mTemp = new Masajista(texto[1], aniosExperiencia, id, texto[4], texto[5], fechaNacimiento);
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
        }
    }
 
    public static void listarEmpleados(LinkedList<SeleccionFutbol> lista) {
        for (SeleccionFutbol sf : lista) {
            System.out.println(sf);
        }
    }
 
    public static void escribeLog(String ruta, String logError) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
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
        sdf.setLenient(false);
        try {
            return sdf.parse(fechaNacimiento);
        } catch (Exception e) {
            System.out.println("Fecha con formato incorrecto: " + fechaNacimiento);
            return null;
        }
    }
}
