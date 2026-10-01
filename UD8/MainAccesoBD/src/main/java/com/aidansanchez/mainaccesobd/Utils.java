package com.aidansanchez.mainaccesobd;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aidan
 */
public class Utils {
    
    
    public static void primerAccesoABBDD(String URL,String usuario,String password){
       String ficheroSalida = "productos.txt";
        String sql = "Select * from productos";
        try {
            //Conectamos a la BBDD
            System.out.println("a");
            Connection con = DriverManager.getConnection(URL, usuario, password);
            System.out.println("b");
            //Preparamos la consulta
            Statement st = con.createStatement();
            //Ejecutamos la consulta
            ResultSet rs = st.executeQuery(sql);

            //Escritura en fichero
            PrintWriter pw = new PrintWriter(new FileWriter(ficheroSalida));

            //Vamos a recorrer el rs y vamos a insertar los datos en el fichero
            while (rs.next()) {
                int id = rs.getInt("id"); //ese es el nombre del campo en la tabla de la BBDD
                String titulo = rs.getString("titulo");
                String descripcion = rs.getString("descripcion");
                double precio = rs.getDouble("precio");

                System.out.println(id + ";" + titulo + ";" + descripcion + ";" + precio);
                pw.println(id + ";" + titulo + ";" + descripcion + ";" + precio);
            }
            System.out.println("Datos exportados correctamente");
            pw.close();
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Error al cerrar la conexion con la BBDD");
            }
        } catch (SQLException sqle) {
            System.out.println("Error de conexion o consulta SQL");
        } catch (IOException ioe) {
            System.out.println("Error al escribir en el fichero");
        }
}
    public static double obtenNumeroDouble(String num) {
        double numero = 0;
        boolean correcto = true;
        do {
            try {
                if (correcto) {
                    numero = Double.parseDouble(num);
                } else {
                    correcto = true;
                    numero = Double.parseDouble(System.console().readLine());
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero incorrecto");
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }
    public static void ConsultaABBDDConParametros(String URL,String usuario,String password,double precioMax){
         String ficheroSalida = "productosMenoresAImporte_"+precioMax+".txt";
        //String sql = "Select * from productos Where precio<="+precioMax;
        String sql="Select * from productos where precio<=? ";
        try {
            //Conectamos a la BBDD
            System.out.println("a");
            Connection con = DriverManager.getConnection(URL, usuario, password);
            
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setDouble(1,precioMax);
            //ps.setString(1, "teclado");
            System.out.println("b");
            //Preparamos la consulta
            
            //Ejecutamos la consulta
            ResultSet rs = ps.executeQuery();

            //Escritura en fichero
            PrintWriter pw = new PrintWriter(new FileWriter(ficheroSalida));

            System.out.println("Datos obtenidos:");
            //Vamos a recorrer el rs y vamos a insertar los datos en el fichero
            while (rs.next()) {
                int id = rs.getInt("id"); //ese es el nombre del campo en la tabla de la BBDD
                String titulo = rs.getString("titulo");
                String descripcion = rs.getString("descripcion");
                double precio = rs.getDouble("precio");

                System.out.println(id + ";" + titulo + ";" + descripcion + ";" + precio);
                pw.println(id + ";" + titulo + ";" + descripcion + ";" + precio);
            }
            System.out.println("Datos exportados correctamente");
            pw.close();
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Error al cerrar la conexion con la BBDD");
            }
        } catch (SQLException sqle) {
            System.out.println("Error de conexion o consulta SQL");
        } catch (IOException ioe) {
            System.out.println("Error al escribir en el fichero");
        }
    }
}
