package com.webcrudfutbol.config;

import java.sql.Connection;

/**
 *
 * @author aidan
 */
public class Test {
    public static void main(String[] args){
        Connection cn = null;
        
        cn=ConexionBD.getConnection();
        
        if (cn == null){
            System.out.println("No hay conexion con la BBDD");
        } else{
            System.out.println("Enhorabuena te has conectado correctamente. A por el CRUD!!!");
        }
    }
    
}
