package com.aidansanchez.mainaccesobd;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author aidan
 */
public class MainAccesoBD {
    //Como conecto con una BBDD MySQL

    private static final String URL = "jdbc:mysql://localhost:3307/1rodaw";
    private static final String usuario = "root";
    private static final String password = "KXQQJF";

    public static void main(String[] args) {
     Utils.primerAccesoABBDD(URL,usuario,password);
   
        System.out.println("Dime el precio maximo de los productos que quieres que te muestre");
        double precioMAX=Utils.obtenNumeroDouble(System.console().readLine());
        
        Utils.ConsultaABBDDConParametros(URL,usuario,password,precioMAX);
    }
}
