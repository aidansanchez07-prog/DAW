package com.webcrudempleados.dao;

import com.webcrudempleados.config.ConexionBD;
import com.webcrudempleados.modelo.Empleado;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class EmpleadoDAO {
    private Connection cn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    
    public ArrayList<Empleado> listarTodos(){
        ArrayList<Empleado>lista =new ArrayList<>();
        try{
            cn= ConexionBD.getConnection();
            String sql="select * from empleados";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Empleado empTemp=new Empleado();
                empTemp.setId(rs.getInt("id"));
                 empTemp.setNombre(rs.getString("nombre"));
                  empTemp.setApellidos(rs.getString("apellidos"));
                   empTemp.setFechaIngreso(rs.getString("fecha_ingreso"));
                    empTemp.setSueldo(rs.getDouble("sueldo"));
                    lista.add(empTemp);
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
    public int insertar(Empleado emp){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            int idDepto=0;
            String sql="";
            if(emp.getNombreDepto()==null){
                sql="select idDepto from departamentos where nombreDepto='" + emp.getNombreDepto()+"'";
                 Statement st=cn.createStatement();
                 ResultSet rs2=st.executeQuery(sql);
                 if(rs2.next()){
                     idDepto=rs2.getInt("idDepto");
                 }
            }
            if(idDepto==0){
                sql="insert into empleados(id,nombre,apellidos,sueldo,fecha_ingreso) VALUES(?,?,?,?,?)";
                ps=cn.prepareStatement(sql);
                
                int idNuevo= obtenId(cn);
                System.out.println("Voy a insertar el id: "+idNuevo);
                ps.setInt(1, idNuevo);
                ps.setString(2, emp.getNombre());
                ps.setString(3, emp.getApellidos());
                ps.setDouble(4, emp.getSueldo());
                ps.setDate(5, Date.valueOf(emp.getFechaIngreso()));
                result=ps.executeUpdate();
            }else{
                 sql="insert into empleados(id,nombre,apellidos,sueldo,fecha_ingreso,idDepto) VALUES(?,?,?,?,?,?)";
                ps=cn.prepareStatement(sql);
                
                int idNuevo= obtenId(cn);
                System.out.println("Voy a insertar el id: "+idNuevo);
                ps.setInt(1, idNuevo);
                ps.setString(2, emp.getNombre());
                ps.setString(3, emp.getApellidos());
                ps.setDouble(4, emp.getSueldo());
                ps.setDate(5, Date.valueOf(emp.getFechaIngreso()));
                ps.setInt(6, idDepto);
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
    
     public int editar(Empleado emp) {
        int result = 0;
        try {
            cn = ConexionBD.getConnection();

            int idDepto = 0;
            String sql = "";

            // para el empleado nos han puesto un nombre de Depto en el formulario y debemos localizar el idDepto asociado.
            if (emp.getNombreDepto() != null) {
                sql = "select idDepto from departamentos where nombreDepto='" + emp.getNombreDepto() + "'";

                Statement st = cn.createStatement();

                ResultSet rs2 = st.executeQuery(sql);

                if (rs2.next()) {
                    idDepto = rs2.getInt("idDepto");
                }
            }

            if (idDepto == 0) {
                sql = "update empleados set nombre=?, apellidos=?, sueldo=?, fecha_ingreso=? where id=?";

                ps = cn.prepareStatement(sql);

                System.out.println("Voy a modificar el id: " + emp.getId());
                ps.setString(1, emp.getNombre());
                ps.setString(2, emp.getApellidos());
                ps.setDouble(3, emp.getSueldo());
                ps.setDate(4, Date.valueOf(emp.getFechaIngreso()));
                ps.setInt(5, emp.getId());

                result = ps.executeUpdate();
            } else {
                sql = "update empleados set nombre=?, apellidos=?, sueldo=?, fecha_ingreso=?, idDepto=? where id=?";

                ps = cn.prepareStatement(sql);

                System.out.println("Voy a modificar el id: " + emp.getId());
                ps.setString(1, emp.getNombre());
                ps.setString(2, emp.getApellidos());
                ps.setDouble(3, emp.getSueldo());
                ps.setDate(4, Date.valueOf(emp.getFechaIngreso()));
                ps.setInt(5, idDepto);
                ps.setInt(6, emp.getId());

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
      public int borrar(Empleado emp){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            int idDepto=0;
            String sql="delete from empleados where id=?";
           
              
                ps=cn.prepareStatement(sql);
                
                
                System.out.println("Voy a eliminar el id: "+emp.getId());
                ps.setInt(1, emp.getId());
                
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
    
        public int obtenId(Connection cn) {
        int result = 1;
        Statement st = null;
        ResultSet rs1 = null;

        try {
            String sql = "select max(id) as id from empleados";
            st = cn.createStatement();
            rs1 = ps.executeQuery(sql);

            if (rs1.next()) {
                result = rs1.getInt("id");
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
        public Empleado buscarPorId(int id) {
        Empleado emp = null;

        try {
            cn = ConexionBD.getConnection();
            String sql = "select * from empleados where id = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
                emp = new Empleado();
                emp.setId(rs.getInt("id"));
                emp.setNombre(rs.getString("nombre"));
                emp.setApellidos(rs.getString("apellidos"));
                emp.setFechaIngreso(rs.getString("fecha_ingreso"));
                emp.setSueldo(rs.getDouble("sueldo"));
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
        return emp;
    }
        public int borrarPorId(int id){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            int idDepto=0;
            String sql="delete  from empleados where id=?";
           
              
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
}

