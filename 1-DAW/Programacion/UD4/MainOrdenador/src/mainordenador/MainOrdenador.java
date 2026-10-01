package mainordenador;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class MainOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase Ordenador
        // Incluye atributos típicos: marca, modelo, RAM, procesador, precio y si es portátil o no.

      

//        boolean b = true;
//        boolean a = true;
//        while (a == true) {
//            System.out.println("Tu ordenador es un portatil?");
//            String opcionP = System.console().readLine().toLowerCase();
//            if (opcionP.equals("si")) {
//                b = true;
//                a = false;
//            } else if (opcionP.equals("no")) {
//                b = false;
//                a = false;
//            } else {
//                System.out.println("Opción incorrecta, si o no");
//            }
//        }
//
//        // Clase Ordenador
//        // Incluye atributos típicos: marca, modelo, RAM, procesador, precio y si es portátil o no.
//        System.out.print("Dime la marca: ");
//        String marca = System.console().readLine().toLowerCase();
//        System.out.print("Dime la modelo: ");
//        String modelo = System.console().readLine().toLowerCase();
//        System.out.print("Dime el procesador: ");
//        String procesador = System.console().readLine().toLowerCase();
//        System.out.print("Dime la RAM: ");
//        int ram = Integer.parseInt(System.console().readLine());
//
//        System.out.print("Dime el precio: ");
//        double precio = Double.parseDouble(System.console().readLine());
//        Ordenador o1 = new Ordenador(marca, modelo, procesador, ram, precio, b);
//        System.out.println("Este es mi ordenador:\n" + oTemp.toString());
        int opcion = 0;
        ArrayList<Ordenador> lista = new ArrayList<>();
        int numOrdenador;
        int IDinventario = 0;
        do {
            System.out.println("\n=== MENÚ ORDENADORES ===");
            System.out.println("1. Añadir ordenador");
            System.out.println("2. Mostrar todos.");
            System.out.println("3. Modificar RAM.");
            System.out.println("4. Modificar Precio.");
            System.out.println("5. Eliminar ordenador.");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    boolean b = true;
                    boolean a = true;
                    while (a == true) {
                        System.out.println("Tu ordenador es un portatil?");
                        String opcionP = System.console().readLine().toLowerCase();
                        if (opcionP.equals("si")) {
                            b = true;
                            a = false;
                        } else if (opcionP.equals("no")) {
                            b = false;
                            a = false;

                        } else {
                            System.out.println("Opción incorrecta, si o no");
                        }
                    }

                    // Clase Ordenador
                    // Incluye atributos típicos: marca, modelo, RAM, procesador, precio y si es portátil o no.
                    System.out.print("Dime la marca: ");
                    String marca = System.console().readLine().toLowerCase();
                    System.out.print("Dime la modelo: ");
                    String modelo = System.console().readLine().toLowerCase();
                    System.out.print("Dime el procesador: ");
                    String procesador = System.console().readLine().toLowerCase();
                    System.out.print("Dime la RAM: ");
                    int ram = Integer.parseInt(System.console().readLine());
                    
                    System.out.print("Dime el precio: ");
                    double precio = Double.parseDouble(System.console().readLine());
                    IDinventario++;

                    Ordenador oTemp = new Ordenador(marca, modelo, procesador, ram, precio, b, IDinventario);

                    lista.add(oTemp);
                    break;
                case 2: // mostrar todos
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("Qué número de ordenador quieres ampliar:");
                    numOrdenador = Integer.parseInt(System.console().readLine());
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getIDinventario() == numOrdenador) {
                            System.out.println("Dime la RAM que quieres poner:");
                            ram = Integer.parseInt(System.console().readLine());
                            lista.get(i).setRAM(ram);
                        } else if (i == lista.size()-1 && lista.get(i).getIDinventario() != numOrdenador) {
                            System.out.println("El número de ordenador seleccionado no existe.");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Que numero de ordenador quieres cambiar el precio:");
                    numOrdenador = Integer.parseInt(System.console().readLine());
                    for (int i = 0; i <lista.size(); i++) {
                       if (lista.get(i).getIDinventario() == numOrdenador) {
                        System.out.println("Dime el precio que quieres poner:");
                        precio = Double.parseDouble(System.console().readLine());
                        lista.get(i).setPrecio(precio);
                    } else if (i == lista.size()-1 && lista.get(i).getIDinventario() != numOrdenador) {
                        System.out.println("El número de ordenador seleccionado no existe.");
                    }
                    }
                    
                    break;
                case 5:
                    System.out.println("Que numero de ordenador quieres eliminar");
                    numOrdenador = Integer.parseInt(System.console().readLine());
                     for (int i = 0; i <lista.size(); i++) {
                         if (lista.get(i).getIDinventario() == numOrdenador) {
                        lista.remove(i);
                        System.out.println("Ordenador numero " + numOrdenador + " eliminado");
                    } else if (i == lista.size()-1 && lista.get(i).getIDinventario() != numOrdenador) {
                        System.out.println("El número de ordenador seleccionado no existe.");
                    }
                     }
                   
                    break;
                case 6:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 6);
    }
}
