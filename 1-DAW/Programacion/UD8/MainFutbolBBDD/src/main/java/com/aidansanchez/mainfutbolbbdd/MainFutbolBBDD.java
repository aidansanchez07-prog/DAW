

package com.aidansanchez.mainfutbolbbdd;

import java.util.*;

/**
 *
 * @author aidan
 */
public class MainFutbolBBDD {

    public static void main(String[] args) {
         Utils.borraLog("log.txt");

    // 2. Leer fichero → cargar en memoria (LinkedList)
    LinkedList<SeleccionFutbol> listaSeleccion = new LinkedList<>();
    Utils.cargaEmpleados(listaSeleccion,"seleccion.txt");

    // 3. Insertar en BBDD
    UtilsBBDD.insertarTodos(listaSeleccion);

    // 4. Menú
    Scanner sc = new Scanner(System.in);
    int opcion;
    do {
        System.out.println("\n=== MENÚ ===");
        System.out.println("1. Listar empleados (desde BBDD)");
        System.out.println("2. Eliminar empleado");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> UtilsBBDD.listarDesdeDB();
            case 2 -> {
                System.out.print("ID a eliminar: ");
                int id = sc.nextInt();
                UtilsBBDD.eliminarEmpleado(id);
            }
            case 0 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida.");
        }
    } while (opcion != 0);
    }
}
