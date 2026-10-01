package webcrudempleados.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import webcrudfutbol.config.ConexionBD;
import webcrudfutbol.modelo.Equipo;
import webcrudfutbol.modelo.Futbolista;

/**
 *
 * @author aidan
 */
public class FutbolDAO {
    private Connection cn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    public ArrayList<Futbolista> listarf(){
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
           System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
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
     public ArrayList<Equipo> listare(){
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
           System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());    
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
    public int insertarf(Futbolista fut) {
    int result = 0;
    try {
        cn = ConexionBD.getConnection();

  
        if (fut.getEquipo() == null || fut.getEquipo().getIdequipo() <= 0) {
            System.out.println("Error: El futbolista debe tener un equipo válido.");
            return 0;
        }

        String sqlEquipo = "SELECT idequipo FROM equipo WHERE idequipo = ?";
        ps = cn.prepareStatement(sqlEquipo);
        ps.setInt(1, fut.getEquipo().getIdequipo());
        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            System.out.println("Error: El equipo con id '" + fut.getEquipo().getIdequipo() + "' no existe.");
            return 0;
        }


        String sqlInsert = "INSERT INTO futbolista(idfutbolista, nombre, goles, sueldo, idequipo) VALUES(?,?,?,?,?)";
        ps = cn.prepareStatement(sqlInsert);

        int idNuevo = obtenIdf(cn);
        System.out.println("Voy a insertar el id: " + idNuevo);

        ps.setInt(1, idNuevo);
        ps.setString(2, fut.getNombre());
        ps.setInt(3, fut.getGoles());
        ps.setDouble(4, fut.getSueldo());
        ps.setInt(5, fut.getEquipo().getIdequipo());

        result = ps.executeUpdate();

    } catch (SQLException sqle) {
        System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (cn != null) cn.close();
            if (ps != null) ps.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    System.out.println("Resultado de los registros afectados: " + result);
    return result;
}
    public int insertare(Equipo eq) {
    int result = 0;
    try {
        cn = ConexionBD.getConnection();

  
        if (eq.getNombre() == null || eq.getNombre().isEmpty()) {
            System.out.println("Error: El equipo debe tener un nombre.");
            return 0;
        }

        String sqlInsert = "INSERT INTO equipo(idequipo, nombre, descripcion) VALUES(?,?,?)";
        ps = cn.prepareStatement(sqlInsert);

        int idNuevo = obtenIde(cn);
        System.out.println("Voy a insertar el id: " + idNuevo);

        ps.setInt(1, idNuevo);
        ps.setString(2, eq.getNombre());
        ps.setString(3, eq.getDescripcion());

        result = ps.executeUpdate();

    } catch (SQLException sqle) {
        System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (cn != null) cn.close();
            if (ps != null) ps.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    System.out.println("Resultado de los registros afectados: " + result);
    return result;
}
    public int editarf(Futbolista fut) {
    int result = 0;
    try {
        cn = ConexionBD.getConnection();

       
        if (fut.getEquipo() == null || fut.getEquipo().getIdequipo() <= 0) {
            System.out.println("Error: El futbolista debe tener un equipo válido.");
            return 0;
        }

        String sqlEquipo = "SELECT idequipo FROM equipo WHERE idequipo = ?";
        ps = cn.prepareStatement(sqlEquipo);
        ps.setInt(1, fut.getEquipo().getIdequipo());
        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            System.out.println("Error: El equipo con id '" + fut.getEquipo().getIdequipo() + "' no existe.");
            return 0;
        }

        String sql = "UPDATE futbolista SET nombre=?, goles=?, sueldo=?, idequipo=? WHERE idfutbolista=?";
        ps = cn.prepareStatement(sql);

        System.out.println("Voy a modificar el futbolista id: " + fut.getIdfutbolista());

        ps.setString(1, fut.getNombre());
        ps.setInt(2, fut.getGoles());
        ps.setDouble(3, fut.getSueldo());
        ps.setInt(4, fut.getEquipo().getIdequipo());
        ps.setInt(5, fut.getIdfutbolista());

        result = ps.executeUpdate();

    } catch (SQLException sqle) {
        System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (cn != null) cn.close();
            if (ps != null) ps.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    System.out.println("Resultado de los registros afectados: " + result);
    return result;
}
    public int editare(Equipo eq) {
    int result = 0;
    try {
        cn = ConexionBD.getConnection();

     
        if (eq.getNombre() == null || eq.getNombre().isEmpty()) {
            System.out.println("Error: El equipo debe tener un nombre.");
            return 0;
        }

        String sql = "UPDATE equipo SET nombre=?, descripcion=? WHERE idequipo=?";
        ps = cn.prepareStatement(sql);

        System.out.println("Voy a modificar el equipo id: " + eq.getIdequipo());

        ps.setString(1, eq.getNombre());
        ps.setString(2, eq.getDescripcion());
        ps.setInt(3, eq.getIdequipo());

        result = ps.executeUpdate();

    } catch (SQLException sqle) {
        System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (cn != null) cn.close();
            if (ps != null) ps.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    System.out.println("Resultado de los registros afectados: " + result);
    return result;
}
    public int borrarf(Futbolista fut) {
    int result = 0;
    try {
        cn = ConexionBD.getConnection();

        String sql = "DELETE FROM futbolista WHERE idfutbolista=?";
        ps = cn.prepareStatement(sql);

        System.out.println("Voy a eliminar el futbolista id: " + fut.getIdfutbolista());
        ps.setInt(1, fut.getIdfutbolista());

        result = ps.executeUpdate();

    } catch (SQLException sqle) {
        System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (cn != null) cn.close();
            if (ps != null) ps.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    System.out.println("Resultado de los registros afectados: " + result);
    return result;
}
     public  int obtenIdf(Connection cn) {
        int result = 1;
        Statement st = null;
        ResultSet rs1 = null;

        try {
            String sql = "select max(idfutbolista) as idfutbolista from futbolista";
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
     public int borrare(Equipo eq) {
    int result = 0;
    try {
        cn = ConexionBD.getConnection();

        // Verificar que no tenga futbolistas asociados antes de borrar
        String sqlCheck = "SELECT COUNT(*) FROM futbolista WHERE idequipo=?";
        ps = cn.prepareStatement(sqlCheck);
        ps.setInt(1, eq.getIdequipo());
        ResultSet rs = ps.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            System.out.println("Error: No se puede borrar el equipo porque tiene futbolistas asociados.");
            return 0;
        }

        String sql = "DELETE FROM equipo WHERE idequipo=?";
        ps = cn.prepareStatement(sql);

        System.out.println("Voy a eliminar el equipo id: " + eq.getIdequipo());
        ps.setInt(1, eq.getIdequipo());

        result = ps.executeUpdate();

    } catch (SQLException sqle) {
        System.out.println("Error SQL: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("Error general: " + e.getMessage());
    } finally {
        try {
            if (cn != null) cn.close();
            if (ps != null) ps.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    System.out.println("Resultado de los registros afectados: " + result);
    return result;
}
     public  int obtenIde(Connection cn) {
        int result = 1;
        Statement st = null;
        ResultSet rs1 = null;

        try {
            String sql = "select max(idequipo) as idequipo from equipo";
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
     public Futbolista buscarPorIdf(int id) {
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
     public Equipo buscarPorIde(int id) {
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
        public int borrarPorIdf(int id){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            int idDepto=0;
            String sql="delete  from futbolista where idfutbolista=?";
           
              
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
        public int borrarPorIde(int id){
        int result=0;
        try{
            cn=ConexionBD.getConnection();
            int idDepto=0;
            String sql="delete  from equipo where idequipo=?";
           
              
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
