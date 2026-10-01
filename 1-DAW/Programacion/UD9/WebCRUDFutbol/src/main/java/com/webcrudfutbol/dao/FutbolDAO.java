package com.webcrudfutbol.dao;

import com.webcrudfutbol.config.ConexionBD;
import com.webcrudfutbol.modelo.Equipo;
import com.webcrudfutbol.modelo.Futbolista;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class FutbolDAO {
    private Connection cn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;

    public ArrayList<Futbolista> listarTodosFutbolistas(){
        ArrayList<Futbolista>lista =new ArrayList<>();
        try{
            cn= ConexionBD.getConnection();
            String sql="select * from futbolista";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Futbolista futTemp=new Futbolista();
                futTemp.setIdfutbolista(rs.getInt("idfutbolista"));
                futTemp.setNombre(rs.getString("nombre"));
                futTemp.setGoles(rs.getInt("goles"));
                futTemp.setSueldo(rs.getDouble("sueldo"));
                lista.add(futTemp);
            }
        }catch(SQLException sqle){
            
        }catch(Exception e){
            
        }finally{
            try{
                if(cn!=null){
                    cn.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(rs!=null){
                    rs.close();
                }
            }catch(SQLException sqle2){
           
            }
        }
        return lista;
    }

    public ArrayList<Equipo> listarTodosEquipos(){
        ArrayList<Equipo>lista =new ArrayList<>();
        try{
            cn= ConexionBD.getConnection();
            String sql="select * from equipo";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Equipo eqTemp=new Equipo();
                eqTemp.setIdequipo(rs.getInt("idequipo"));
                eqTemp.setNombre(rs.getString("nombre"));
                eqTemp.setDescripcion(rs.getString("descripcion"));
                lista.add(eqTemp);
            }
        }catch(SQLException sqle){
            
        }catch(Exception e){
            
        }finally{
            try{
                if(cn!=null){
                    cn.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(rs!=null){
                    rs.close();
                }
            }catch(SQLException sqle2){
           
            }
        }
        return lista;
    }

    public ArrayList<Futbolista> listarFutbolistasConEquipo(){
        ArrayList<Futbolista>lista =new ArrayList<>();
        try{
            cn= ConexionBD.getConnection();
            String sql="select f.idfutbolista, f.nombre, f.goles, f.sueldo, e.nombre as nombreEquipo from futbolista f inner join equipo e on f.idequipo = e.idequipo";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Futbolista futTemp=new Futbolista();
                futTemp.setIdfutbolista(rs.getInt("idfutbolista"));
                futTemp.setNombre(rs.getString("nombre"));
                futTemp.setGoles(rs.getInt("goles"));
                futTemp.setSueldo(rs.getDouble("sueldo"));
                futTemp.setNombreEquipo(rs.getString("nombreEquipo"));
                lista.add(futTemp);
            }
        }catch(SQLException sqle){
            
        }catch(Exception e){
            
        }finally{
            try{
                if(cn!=null){
                    cn.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(rs!=null){
                    rs.close();
                }
            }catch(SQLException sqle2){
           
            }
        }
        return lista;
    }

    public int insertarFutbolista(Futbolista fut){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            int idEquipo=0;
            String sql="";
            if(fut.getNombreEquipo()!=null){
                sql="select idequipo from equipo where nombre='"+fut.getNombreEquipo()+"'";
                Statement st=cn.createStatement();
                ResultSet rs2=st.executeQuery(sql);
                if(rs2.next()){
                    idEquipo=rs2.getInt("idequipo");
                }
            }
            if(idEquipo==0){
                sql="insert into futbolista(idfutbolista,nombre,goles,sueldo) VALUES(?,?,?,?)";
                ps=cn.prepareStatement(sql);
                int idNuevo=obtenIdFutbolista(cn);
                System.out.println("Voy a insertar el id: "+idNuevo);
                ps.setInt(1, idNuevo);
                ps.setString(2, fut.getNombre());
                ps.setInt(3, fut.getGoles());
                ps.setDouble(4, fut.getSueldo());
                result=ps.executeUpdate();
            }else{
                sql="insert into futbolista(idfutbolista,nombre,goles,sueldo,idequipo) VALUES(?,?,?,?,?)";
                ps=cn.prepareStatement(sql);
                int idNuevo=obtenIdFutbolista(cn);
                System.out.println("Voy a insertar el id: "+idNuevo);
                ps.setInt(1, idNuevo);
                ps.setString(2, fut.getNombre());
                ps.setInt(3, fut.getGoles());
                ps.setDouble(4, fut.getSueldo());
                ps.setInt(5, idEquipo);
                result=ps.executeUpdate();
            }
        }catch (SQLException sqle) {

        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Resultado de los registros afectados: " + result);
        return result;
    }

    public int editarFutbolista(Futbolista fut) {
        int result = 0;
        try {
            cn = ConexionBD.getConnection();
            int idEquipo = 0;
            String sql = "";
            if (fut.getNombreEquipo() != null) {
                sql = "select idequipo from equipo where nombre='" + fut.getNombreEquipo() + "'";
                Statement st = cn.createStatement();
                ResultSet rs2 = st.executeQuery(sql);
                if (rs2.next()) {
                    idEquipo = rs2.getInt("idequipo");
                }
            }
            if (idEquipo == 0) {
                sql = "update futbolista set nombre=?, goles=?, sueldo=? where idfutbolista=?";
                ps = cn.prepareStatement(sql);
                System.out.println("Voy a modificar el id: " + fut.getIdfutbolista());
                ps.setString(1, fut.getNombre());
                ps.setInt(2, fut.getGoles());
                ps.setDouble(3, fut.getSueldo());
                ps.setInt(4, fut.getIdfutbolista());
                result = ps.executeUpdate();
            } else {
                sql = "update futbolista set nombre=?, goles=?, sueldo=?, idequipo=? where idfutbolista=?";
                ps = cn.prepareStatement(sql);
                System.out.println("Voy a modificar el id: " + fut.getIdfutbolista());
                ps.setString(1, fut.getNombre());
                ps.setInt(2, fut.getGoles());
                ps.setDouble(3, fut.getSueldo());
                ps.setInt(4, idEquipo);
                ps.setInt(5, fut.getIdfutbolista());
                result = ps.executeUpdate();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Resultado de los registros afectados: " + result);
        return result;
    }

    public int borrarFutbolistaPorId(int id){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            String sql="delete from futbolista where idfutbolista=?";
            ps=cn.prepareStatement(sql);
            System.out.println("Voy a eliminar el id: "+id);
            ps.setInt(1, id);
            result=ps.executeUpdate();
        }catch (SQLException sqle) {
            
        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Resultado de los registros afectados: " + result);
        return result;
    }

    public int obtenIdFutbolista(Connection cn) {
        int result = 1;
        Statement st = null;
        ResultSet rs1 = null;
        try {
            String sql = "select max(idfutbolista) as idfutbolista from futbolista";
            st = cn.createStatement();
            rs1 = st.executeQuery(sql);
            if (rs1.next()) {
                result = rs1.getInt("idfutbolista");
                result++;
            }
        } catch (SQLException sqle) {
        } catch (Exception e) {
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (rs1 != null) {
                    rs1.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("El id que se insertará será: " + result);
        return result;
    }

    public Futbolista buscarFutbolistaPorId(int id) {
        Futbolista fut = null;
        try {
            cn = ConexionBD.getConnection();
            String sql = "select * from futbolista where idfutbolista = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                fut = new Futbolista();
                fut.setIdfutbolista(rs.getInt("idfutbolista"));
                fut.setNombre(rs.getString("nombre"));
                fut.setGoles(rs.getInt("goles"));
                fut.setSueldo(rs.getDouble("sueldo"));
            }
        } catch (SQLException sqle) {

        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return fut;
    }

    public int insertarEquipo(Equipo eq){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            String sql="insert into equipo(idequipo,nombre,descripcion) VALUES(?,?,?)";
            ps=cn.prepareStatement(sql);
            int idNuevo=obtenIdEquipo(cn);
            System.out.println("Voy a insertar el id: "+idNuevo);
            ps.setInt(1, idNuevo);
            ps.setString(2, eq.getNombre());
            ps.setString(3, eq.getDescripcion());
            result=ps.executeUpdate();
        }catch (SQLException sqle) {

        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Resultado de los registros afectados: " + result);
        return result;
    }

    public int editarEquipo(Equipo eq) {
        int result = 0;
        try {
            cn = ConexionBD.getConnection();
            String sql = "update equipo set nombre=?, descripcion=? where idequipo=?";
            ps = cn.prepareStatement(sql);
            System.out.println("Voy a modificar el id: " + eq.getIdequipo());
            ps.setString(1, eq.getNombre());
            ps.setString(2, eq.getDescripcion());
            ps.setInt(3, eq.getIdequipo());
            result = ps.executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Resultado de los registros afectados: " + result);
        return result;
    }

    public int borrarEquipoPorId(int id){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            String sql="delete from equipo where idequipo=?";
            ps=cn.prepareStatement(sql);
            System.out.println("Voy a eliminar el id: "+id);
            ps.setInt(1, id);
            result=ps.executeUpdate();
        }catch (SQLException sqle) {
            
        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Resultado de los registros afectados: " + result);
        return result;
    }

    public int obtenIdEquipo(Connection cn) {
        int result = 1;
        Statement st = null;
        ResultSet rs1 = null;
        try {
            String sql = "select max(idequipo) as idequipo from equipo";
            st = cn.createStatement();
            rs1 = st.executeQuery(sql);
            if (rs1.next()) {
                result = rs1.getInt("idequipo");
                result++;
            }
        } catch (SQLException sqle) {
        } catch (Exception e) {
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (rs1 != null) {
                    rs1.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("El id que se insertará será: " + result);
        return result;
    }

    public Equipo buscarEquipoPorId(int id) {
        Equipo eq = null;
        try {
            cn = ConexionBD.getConnection();
            String sql = "select * from equipo where idequipo = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                eq = new Equipo();
                eq.setIdequipo(rs.getInt("idequipo"));
                eq.setNombre(rs.getString("nombre"));
                eq.setDescripcion(rs.getString("descripcion"));
            }
        } catch (SQLException sqle) {

        } catch (Exception e) {

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return eq;
    }
}
