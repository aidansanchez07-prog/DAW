

package com.aidansanchez.maincrud;

import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class MainCRUD {

    public static void main(String[] args) {
        //Insert, select, update, delete
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        
        do{
            mostrarMenu();
            opcion=Utils.obtenNumeroEntero(System.console().readLine());
            
            switch(opcion){
                case 1:
                   Utils.insertar(sc);
                    break;
                case 2:
                   Utils.listar();
                    break;
                case 3:
                    Utils.modificar(sc);
                    break;
                case 4:
                    Utils.borrar(sc);
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
        System.out.println("Nuestro 1er CRUD de productos");
        System.out.println("1.Insertar");
        System.out.println("2.Listar ");
        System.out.println("3.Modificar");
        System.out.println("4.Eliminar");
        System.out.println("0.Salir");
        
    }
}
