package com.aidansanchez.mainfutbolbbdd;

import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 *
 * @author aidan
 */
public class UtilsBBDD {
    private static final String URL = "jdbc:mysql://localhost:3307/1rodaw";
    private static final String usuario = "root";
    private static final String password = "KXQQJF";
 
    public static void insertarTodos(LinkedList<SeleccionFutbol> lista) {
        for (SeleccionFutbol s : lista) {
            if (s instanceof Futbolista) {
                insertarFutbolista((Futbolista) s);
            } else if (s instanceof Entrenador) {
                insertarEntrenador((Entrenador) s);
            } else if (s instanceof Masajista) {
                insertarMasajista((Masajista) s);
            }
        }
    }
 
    private static void insertarFutbolista(Futbolista f) {
        String sqlBase = "INSERT INTO seleccion_futbol (nombre, apellidos, fecha_nacimiento, tipo) VALUES (?,?,?,?)";
        String sqlFut  = "INSERT INTO futbolista (id, dorsal, demarcacion) VALUES (?,?,?)";
        String sqlEst  = "INSERT INTO estadisticas_futbolista (id, goles, faltas, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES (?,?,?,?,?,?)";
 
        try (Connection con = DriverManager.getConnection(URL, usuario, password)) {
            PreparedStatement ps = con.prepareStatement(sqlBase, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, f.getNombre());
            ps.setString(2, f.getApellidos());
            ps.setDate(3, new java.sql.Date(f.getFechaNacimiento().getTime()));
            ps.setString(4, "futbolista");
            ps.executeUpdate();
 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
 
                PreparedStatement ps2 = con.prepareStatement(sqlFut);
                ps2.setInt(1, id);
                ps2.setInt(2, f.getDorsal());
                ps2.setString(3, f.getDemarcacion().name().toLowerCase());
                ps2.executeUpdate();
 
                if (f.getEstadisticas() != null) {
                    PreparedStatement ps3 = con.prepareStatement(sqlEst);
                    ps3.setInt(1, id);
                    ps3.setInt(2, f.getEstadisticas().getGoles());
                    ps3.setInt(3, f.getEstadisticas().getFaltas());
                    ps3.setInt(4, f.getEstadisticas().getPartidosJugados());
                    ps3.setInt(5, f.getEstadisticas().getTarjetasAmarillas());
                    ps3.setInt(6, f.getEstadisticas().getTarjetasRojas());
                    ps3.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.out.println("Error SQL insertando futbolista: " + e.getMessage());
        }
    }
 
    private static void insertarEntrenador(Entrenador e) {
        String sqlBase = "INSERT INTO seleccion_futbol (nombre, apellidos, fecha_nacimiento, tipo) VALUES (?,?,?,?)";
        String sqlEnt  = "INSERT INTO entrenador (id, id_federacion) VALUES (?,?)";
 
        try (Connection con = DriverManager.getConnection(URL, usuario, password)) {
            PreparedStatement ps = con.prepareStatement(sqlBase, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellidos());
            ps.setDate(3, new java.sql.Date(e.getFechaNacimiento().getTime()));
            ps.setString(4, "entrenador");
            ps.executeUpdate();
 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                PreparedStatement ps2 = con.prepareStatement(sqlEnt);
                ps2.setInt(1, id);
                ps2.setString(2, e.getIdFederacion());
                ps2.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL insertando entrenador: " + ex.getMessage());
        }
    }
 
    private static void insertarMasajista(Masajista m) {
        String sqlBase = "INSERT INTO seleccion_futbol (nombre, apellidos, fecha_nacimiento, tipo) VALUES (?,?,?,?)";
        String sqlMas  = "INSERT INTO masajista (id, titulacion, anios_experiencia) VALUES (?,?,?)";
 
        try (Connection con = DriverManager.getConnection(URL, usuario, password)) {
            PreparedStatement ps = con.prepareStatement(sqlBase, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getNombre());
            ps.setString(2, m.getApellidos());
            ps.setDate(3, new java.sql.Date(m.getFechaNacimiento().getTime()));
            ps.setString(4, "masajista");
            ps.executeUpdate();
 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                PreparedStatement ps2 = con.prepareStatement(sqlMas);
                ps2.setInt(1, id);
                ps2.setString(2, m.getTitulacion());
                ps2.setInt(3, m.getAniosExperiencia());
                ps2.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL insertando masajista: " + ex.getMessage());
        }
    }
 
    public static void listarDesdeDB() {
        String sql = "SELECT sf.*, f.dorsal, f.demarcacion, e.id_federacion, m.titulacion, m.anios_experiencia " +
                     "FROM seleccion_futbol sf " +
                     "LEFT JOIN futbolista f ON sf.id = f.id " +
                     "LEFT JOIN entrenador e ON sf.id = e.id " +
                     "LEFT JOIN masajista m ON sf.id = m.id";
 
        try (Connection con = DriverManager.getConnection(URL, usuario, password)) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("---------------------------");
                System.out.println("Nombre: " + rs.getString("nombre") + " " + rs.getString("apellidos"));
                System.out.println("Tipo: " + rs.getString("tipo"));
                switch (rs.getString("tipo")) {
                    case "futbolista" ->
                        System.out.println("Dorsal: " + rs.getInt("dorsal") + " | Demarcacion: " + rs.getString("demarcacion"));
                    case "entrenador" ->
                        System.out.println("ID Federacion: " + rs.getString("id_federacion"));
                    case "masajista" ->
                        System.out.println("Titulacion: " + rs.getString("titulacion") + " | Experiencia: " + rs.getInt("anios_experiencia"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error SQL listando: " + e.getMessage());
        }
    }
 
    public static void eliminarEmpleado(int id) {
        String sql = "DELETE FROM seleccion_futbol WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, usuario, password)) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            System.out.println(filas > 0 ? "Eliminado correctamente." : "No encontrado.");
        } catch (SQLException e) {
            System.out.println("Error SQL eliminando: " + e.getMessage());
        }
    }
}
