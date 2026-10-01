package com.aidansanchez.maincuentabbdd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class Utils {
    private static final String URL = "jdbc:mysql://localhost:3307/1rodaw";
    private static final String usuario = "root";
    private static final String password = "KXQQJF";
    public static boolean buscaCliente(String dni,ArrayList<Cliente>listaClientes){
        boolean encontrado=false;
        for (int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).getDni().equalsIgnoreCase(dni)){
                encontrado=true;
                break;
            }
        }
        
        return encontrado;
    }
    
    public static String creaCliente(String dni, String nombre, String apellido,ArrayList<Cliente>listaClientes){
        if (!buscaCliente(dni,listaClientes)) {
            
            Cliente cli=new Cliente(dni,nombre,apellido);
            listaClientes.add(cli);
            return "Cliente con dni "+dni+"creado goty";
        }else{
            return "Cliente con dni "+dni+"creado mal";
        }
    }
    public static String cargaDatos(ArrayList<Cliente> listaClientes){
        String sql = "select * from clientes";
         String resultado="Reporte cargas datos realizada";
        try {
            // Conectamos a la BBDD
            Connection con = DriverManager.getConnection(URL, usuario, password);

            // creo la consulta
            Statement st = con.createStatement();
            // Ejecutamos la consulta
            ResultSet rs = st.executeQuery(sql);

            // Vamos a recorrer el rs y vamos a listar en consola.
            while (rs.next()) {
                String dni = rs.getString("dni"); // ese "id" es el nombre del campo en la tabla de la BBDD.
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
               
                resultado+=Utils.creaCliente(dni, nombre, apellidos, listaClientes);
                
               
            }
            rs.close();
            sql = "select * from cuentas";           

            rs = st.executeQuery(sql);
            while(rs.next()){
                String dniCliente=rs.getString("dniCliente");
                String numCuenta=rs.getString("numCuenta");
                String nombreBanco=rs.getString("nombreBanco");
                resultado+=Utils.asociaCuenta(dniCliente, numCuenta, nombreBanco, listaClientes);
            }
            rs.close();
            st.close();
            con.close();
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Error al cerrar la conexión con la BBDD.");
            }
        } catch (SQLException sqle) {
            System.out.println("Error de conexión o consulta SQL.");
        }
        return resultado;
    }
    public static void muestraDatos( ArrayList<Cliente> listaClientes){
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i));
        }
    }
    public static String asociaCuenta(String dniCliente,String numCuenta,String nombreBanco,ArrayList<Cliente> listaClientes){
        String resultado="patata";
        if(buscaCliente(dniCliente,listaClientes)){
             for (int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).getDni().equalsIgnoreCase(dniCliente)){
                
                listaClientes.get(i).asignaCuenta(numCuenta, numCuenta);
                resultado="furula";
                break;
            }
            
        }
        }
       
        return resultado;
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
                System.out.println("Dime el DNI");
                String DNI=sc.nextLine();
                if(!buscaClienteBD(DNI,con)){
                    System.out.println("Dime el nombre del cliente");
                    String nombre=sc.nextLine();
                    System.out.println("Dime el apellido");
                    String apellido=sc.nextLine();
                   String  sql = """
               insert into clientes(dni,nombre,apellidos)
               values(?,?,?);
               """;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, DNI);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
                    System.out.println("locura");
            ps.executeUpdate();
                    System.out.println("Cliente coocked");
                    System.out.println("Dime el numero de cuenta");
                    String numCuenta=sc.nextLine();
                    System.out.println("Dime el nombre del banco");
                    String nomBanco=sc.nextLine();
                    sql = """
               insert into cuentas(dniCliente,numCuenta,nombreBanco)
               values(?,?,?);
               """;
            ps = con.prepareStatement(sql);
            ps.setString(1, DNI);
            ps.setString(2, numCuenta);
            ps.setString(3, nomBanco);
            ps.executeUpdate();
                    
                    
                }
                else{
                    System.out.println("Ya lo tienes");
                    con.close();
                    return false;
                }
            } else if (opcion == 2) {
                System.out.println("Insertamos Cuenta");
                 String DNI=sc.nextLine();
                if(buscaClienteBD(DNI,con)){
                 System.out.println("Dime el numero de cuenta");
                    String numCuenta=sc.nextLine();
                    System.out.println("Dime el nombre del banco");
                    String nomBanco=sc.nextLine();
                   String sql = """
               insert into cuentas(dniCliente,numCuenta,nombreBanco)
               values(?,?,?);
               """;
           PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, DNI);
            ps.setString(2, numCuenta);
            ps.setString(3, nomBanco);
            ps.executeUpdate();
            }
            }
            //Conectamos a la BBDD

            
//            String sql = "Select Max(id) as id from productos";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            int id = 1;
//            while (rs.next()) {
//                id = rs.getInt("id") + 1;
//
//            }
//            System.out.println("Dime el titulo");
//            String titulo = sc.nextLine();
//            System.out.println("Dime la descripcion");
//            String descripcion = sc.nextLine();
//            System.out.println("Dime el precio");
//            double precio = obtenNumeroDouble(sc.nextLine());
//            sql = """
//               insert into productos(id,titulo,descripcion,precio)
//               values(?,?,?,?);
//               """;
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            ps.setString(2, titulo);
//            ps.setString(3, descripcion);
//            ps.setDouble(4, precio);
//
//            ps.executeUpdate();
//            System.out.println("Producto creado correctamente");
            try {
                con.close();
            } catch (SQLException sqle) {
                correcto = false;
            }
        } catch (SQLException sqle) {
            correcto = false;
            System.out.println("Manteca");
        }

        
        return correcto;
    }

    public static void listar() {
        try {
            String sql = "Select * from clientes";
            Connection con = DriverManager.getConnection(URL, usuario, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String DNI = rs.getString("dni"); //ese es el nombre del campo en la tabla de la BBDD
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellidos");
                

                System.out.println("Dni:" +DNI +  "\n Nombre" + nombre + "\n Apellidos" + apellido);
            }
            st.close();
            rs.close();
            sql="Select * from cuentas";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
             while (rs.next()) {
                String DNI = rs.getString("dniCliente"); //ese es el nombre del campo en la tabla de la BBDD
                String nombrebanco = rs.getString("nombreBanco");
                String NumCuenta = rs.getString("NumCuenta");
                

                System.out.println("Dni Ciente:" +DNI +  "\n Nombre Banco" + nombrebanco + "\n Numero de cuenta" + NumCuenta);
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

    public static void eliminar(Scanner sc, int opcion) {
         listar();
       try {
        Connection con = DriverManager.getConnection(URL, usuario, password);
        if (opcion == 3) {
            System.out.println("Elige el DNI del cliente que deseas eliminar:");
            String DNI = sc.nextLine();

            // Primero eliminar cuentas asociadas
            String sql1 = "DELETE FROM cuentas WHERE dniCliente = ?";
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setString(1, DNI);
            ps1.executeUpdate();
            ps1.close();

            // Luego eliminar el cliente
            String sql2 = "DELETE FROM clientes WHERE dni = ?";
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setString(1, DNI);
            ps2.executeUpdate();
            ps2.close();

            System.out.println("Cliente y cuentas eliminados correctamente.");
            con.close();
        }
        if(opcion==4){
            System.out.println("Elige que DNI del apartado Cuenta desea eliminar");
           String DNI=sc.nextLine();
            if(Utils.buscaClienteBD(DNI, con)){
                String sql="Delete from cuentas where dniCliente="+DNI;
                 Statement st = con.createStatement();
            int resultado = st.executeUpdate(sql);
                System.out.println("Cuentas"+resultado);
            }
        }
        
//            System.out.println("Elige cual id desea eliminar");
//            int idborrar = obtenNumeroEntero(sc.nextLine());
//           // String sql = "Delete from productos where id=" + idborrar;
//
//            //Connection con = DriverManager.getConnection(URL, usuario, password);
//
//            
//            Statement st = con.createStatement();
//            int resultado = st.executeUpdate(sql);
//            System.out.println("El resultado a sido:" + resultado);
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Error al cerrar la conexion con la BBDD");
            }
        } catch (SQLException sqle) {
            System.out.println("Error de conexion o consulta SQL");
        }
        
    }
    public static int modificar(Scanner sc,int opcion){
        listar();
        int resultado=0;
        try {
             Connection con = DriverManager.getConnection(URL, usuario, password);
            if(opcion==5){
                
            }
            if(opcion==6){
                System.out.println("Elige el DNI de Cliente, de la cuenta que desea eliminar");
                String DNI=sc.nextLine();
                if(Utils.buscaClienteBD(DNI, con)){
                    
                }else{
                    
                }
            }
//            System.out.println("Elige cual id desea eliminar");
//            int idborrar = obtenNumeroEntero(sc.nextLine());
//            System.out.println("Que precio seria");
//            double precionuevo=obtenNumeroDouble(sc.nextLine());
//            String sql = "UPDATE productos set precio="+precionuevo+ "Where id=" + idborrar;

           

            
//            Statement st = con.createStatement();
//             resultado = st.executeUpdate(sql);
//            System.out.println("El resultado a sido:" + resultado);
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
    public static boolean buscaClienteBD(String dni, Connection con){
        boolean encontrado=false;
        Statement st=null;
        ResultSet rs=null;
        String sql="Select dni from clientes where dni="+dni+"";
        try{
       st=con.createStatement();
        rs=st.executeQuery(sql);
        if(rs.wasNull()){
            encontrado=false;
        }
        else{
            encontrado=true;
        }
        }catch(SQLException sqe){
            
        }
        return encontrado;
    }
}
