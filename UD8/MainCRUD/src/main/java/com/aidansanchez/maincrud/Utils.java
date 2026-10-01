package com.aidansanchez.maincrud;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class Utils {

    private static final String URL = "jdbc:mysql://localhost:3307/1rodaw";
    private static final String usuario = "root";
    private static final String password = "KXQQJF";

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

    public static int obtenNumeroEntero(String num) {
        int numero = 0;
        boolean correcto = true;
        do {
            try {
                if (correcto) {
                    numero = Integer.parseInt(num);
                } else {
                    correcto = true;
                    numero = Integer.parseInt(System.console().readLine());
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero incorrecto");
                correcto = false;
            }
        } while (!correcto);
        return numero;
    }

    public static boolean insertar(Scanner sc, int opcion) {
        boolean correcto = true;

        //id-obtenemos el ultimo que hay en la BBDD
        try {
            //Conectamos a la BBDD
            Connection con = DriverManager.getConnection(URL, usuario, password);
            if (opcion == 1) {
                System.out.println("Insertamos Cliente");
            } else if (opcion == 2) {
                System.out.println("Insertamos Cuenta");
            }
            
            String sql = "Select Max(id) as id from productos";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int id = 1;
            while (rs.next()) {
                id = rs.getInt("id") + 1;

            }
            System.out.println("Dime el titulo");
            String titulo = sc.nextLine();
            System.out.println("Dime la descripcion");
            String descripcion = sc.nextLine();
            System.out.println("Dime el precio");
            double precio = obtenNumeroDouble(sc.nextLine());
            sql = """
               insert into productos(id,titulo,descripcion,precio)
               values(?,?,?,?);
               """;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, titulo);
            ps.setString(3, descripcion);
            ps.setDouble(4, precio);

            ps.executeUpdate();
            System.out.println("Producto creado correctamente");
            try {
                con.close();
            } catch (SQLException sqle) {
                correcto = false;
            }
        } catch (SQLException sqle) {
            correcto = false;
        }

        return correcto;
    }

    public static void listar() {
        try {
            String sql = "Select * from productos";
            Connection con = DriverManager.getConnection(URL, usuario, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id"); //ese es el nombre del campo en la tabla de la BBDD
                String titulo = rs.getString("titulo");
                String descripcion = rs.getString("descripcion");
                double precio = rs.getDouble("precio");

                System.out.println(id + ";" + titulo + ";" + descripcion + ";" + precio);
            }
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Error al cerrar la conexion con la BBDD");
            }
        } catch (SQLException sqle) {
            System.out.println("Error de conexion o consulta SQL");
        }
    }

    public static void borrar(Scanner sc) {

        listar();

        try {
            System.out.println("Elige cual id desea eliminar");
            int idborrar = obtenNumeroEntero(sc.nextLine());
            String sql = "Delete from productos where id=" + idborrar;

            Connection con = DriverManager.getConnection(URL, usuario, password);

            Statement st = con.createStatement();
            int resultado = st.executeUpdate(sql);
            System.out.println("El resultado a sido:" + resultado);
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Error al cerrar la conexion con la BBDD");
            }
        } catch (SQLException sqle) {
            System.out.println("Error de conexion o consulta SQL");
        }

    }

    public static int modificar(Scanner sc) {
        listar();
        int resultado = 0;
        try {
            System.out.println("Elige cual id desea eliminar");
            int idborrar = obtenNumeroEntero(sc.nextLine());
            System.out.println("Que precio seria");
            double precionuevo = obtenNumeroDouble(sc.nextLine());
            String sql = "UPDATE productos set precio=" + precionuevo + "Where id=" + idborrar;

            Connection con = DriverManager.getConnection(URL, usuario, password);

            Statement st = con.createStatement();
            resultado = st.executeUpdate(sql);
            System.out.println("El resultado a sido:" + resultado);
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Error al cerrar la conexion con la BBDD");
            }
        } catch (SQLException sqle) {
            System.out.println("Error de conexion o consulta SQL");
        }
        return resultado;
    }

}
