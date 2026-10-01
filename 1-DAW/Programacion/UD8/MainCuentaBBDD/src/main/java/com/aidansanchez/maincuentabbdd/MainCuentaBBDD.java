

package com.aidansanchez.maincuentabbdd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class MainCuentaBBDD {

    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes= new ArrayList<>();
       String resultado=Utils.cargaDatos(listaClientes);
        System.out.println(resultado);
       Utils.muestraDatos(listaClientes);
      
       // Menú para insertar nuevos clientes y nuevas cuentas (asociar esta nueva cuenta a un cliente de la lista - opcional) y modificar datos de un cliente.
       Scanner sc=new Scanner(System.in);
        int opcion=0;
        
        do{
            mostrarMenu();
            opcion=Utils.obtenNumeroEntero(System.console().readLine());
            
            switch(opcion){
                case 1,2:
                   Utils.insertar(sc,opcion);
                    break;
                
                case 3,4:
                    Utils.eliminar(sc,opcion);
                    break;
                
                case 5,6:
                    Utils.modificar(sc,opcion);
                    break;
                case 7:
                    Utils.listar();
                    break;
                case 0:
                    System.out.println("Chao pescao");
                    break;
                default:
                    System.out.println("Cateto");
            }
        }while(opcion!=0);
        sc.close();
    }
    public static void mostrarMenu(){
        
        System.out.println("1.Insertar Cliente");
        System.out.println("2.Insertar Cuenta ");
        System.out.println("3Eliminar Cliente");
        System.out.println("4.Eliminar Cuenta ");
        System.out.println("5.Modificar Cliente");
        System.out.println("6.Modificar Cuenta");
        System.out.println("7.Listar");
        System.out.println("0.Salir");
        
    }
}
