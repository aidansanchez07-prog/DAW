package maininventarioit;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class MainInventarioIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion = "";
        boolean verificacion = true;
        PC pc1 = new PC(700, "ATX", "Tempest", "Pro", 16, "i8 10100", 199, true);
        Portatil pt1 = new Portatil(2, 15, "Asus", "ultra", 16, "i6 00101", 201,true);
        System.out.println(pc1);
        System.out.println(pt1);
        ArrayList<Ordenador> inventario = new ArrayList<>();
        
        boolean terminar = false;
        do {
            System.out.println("-- Menu --");
            System.out.println("Pulse 1 para dar de alta un ordenador");
            System.out.println("Pulse 2 para dar de baja");
            System.out.println("Pulse 3 para listar");
            System.out.println("Escribe salir para terminar");
            opcion = System.console().readLine();
            if (opcion.equalsIgnoreCase("salir")) {
                terminar = true;
            } else {
                int op = -1;
                try {
                    op = Integer.parseInt(opcion);
                    switch (op) {
                        case 1:
                          inventario.add(creaPC());
                            break;
                        case 2:
                            inventario.add(creaPortatil());
                            break;
                        case 3:
                            System.out.println("Indica si quieres todo listado pulsa 1");
                            System.out.println("Indica si quieres que se ordene por tipo pulse 2");
                            System.out.println("Pulsa 3 para ver solo PCs");
                            System.out.println("Pulsa 4 para ver solo portatiles");
                            int modo=obtenNumeroEntero("opcion");
                            if(modo!=-1){
                                listarInventario(modo,inventario);
                                
                            }
                            else{
                                System.out.println("Por favor introduce una de las opciones de menú");
                            }
                            
                            break;
                        default:
                            System.out.println("Por favor introduzca un valor valido");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Introduzca un valor valido");
                }
            }
        } while (!terminar);
//        while(verificacion==true){
//        System.out.println("Tu ordenador es un PC o un Portatil?");
//        opcion=System.console().readLine().toUpperCase();
//        if(opcion.equals("PC") || opcion.equals("PORTATIL")){
//            verificacion=false;
//        }
//        else{
//            System.out.println("Opcion incorrecta");
//        }
//        }
//        if (opcion.equals("PC")){
//            System.out.println("");
//        }
//        else if(opcion.equals("PORTATIL")){
//            
//        }
    }

    public static PC creaPC() {
        PC pcTemp = new PC();
          System.out.println("Dime la potencia de la fuente");
                            int potencia=obtenNumeroEntero("");
                            System.out.println("Dime el formato");
                            String formato=System.console().readLine();
                             System.out.println("Dime la marca");
                            String marca=System.console().readLine();
                            System.out.println("Dime el modelo");
                            String modelo=System.console().readLine();
                            System.out.println("Dime la RAM");
                            int ram=obtenNumeroEntero("");
                            System.out.println("Dime el procesador");
                            String procesador=System.console().readLine();
                             System.out.println("Dime el precio");
                            double precio=obtenNumeroDouble("");
                            boolean mon=false;
                            boolean prueba=false;
                            do{
                                System.out.println("Incluye monitor S/N");
                                String monitor=System.console().readLine();
                                if(monitor.equalsIgnoreCase("s")){
                                    mon=true;
                                    prueba=true;
                                }
                                else if(monitor.equalsIgnoreCase("n")){
                                    mon=false;
                                    prueba=true;
                                }
                                else{
                                    System.out.println("");
                                }
                            }while(prueba==false);
                           pcTemp= new PC(potencia, formato,marca,modelo,ram,procesador,precio,mon);
        return pcTemp;
    }

    public static Portatil creaPortatil() {
        Portatil ptTemp = new Portatil();
        System.out.println("Dime el peso");
        double peso=obtenNumeroDouble("");
         System.out.println("Dime la autonomia de la bateria");
          int bateria=obtenNumeroEntero("");
           System.out.println("Dime la marca");
                            String marca=System.console().readLine();
                            System.out.println("Dime el modelo");
                            String modelo=System.console().readLine();
                            System.out.println("Dime la RAM");
                            int ram=obtenNumeroEntero("");
                            System.out.println("Dime el procesador");
                            String procesador=System.console().readLine();
                             System.out.println("Dime el precio");
                            double precio=obtenNumeroDouble("");
                            boolean garan=false;
                            boolean prueba=false;
                            do{
                                System.out.println("Incluye garantia S/N");
                                String garantia=System.console().readLine();
                                if(garantia.equalsIgnoreCase("s")){
                                    garan=true;
                                    prueba=true;
                                }
                                else if(garantia.equalsIgnoreCase("n")){
                                    garan=false;
                                    prueba=true;
                                }
                                else{
                                    System.out.println("");
                                }
                            }while(prueba==false);
                           ptTemp= new Portatil(peso, bateria,marca,modelo,ram,procesador,precio,garan);
        return ptTemp;
    }

    public static double obtenNumeroDouble(String mensaje) {
        double numero = -1;
        do {

            System.out.println(mensaje);
            try {
                numero = Double.parseDouble(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Formato de número incorrecto.");
                numero = -1;
            }
        } while (numero == -1);
        return numero;
    }

    public static int obtenNumeroEntero(String mensaje) {
        int numero = 0;
        System.out.println(mensaje);
        try {
            numero = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            numero = -1;
        }
        return numero;
    }

    public static void listarInventario(int modo, ArrayList<Ordenador> inventario) {
        //modo=1 (listo todos los elementos que estan en el arraylist
        //modo=2 (listo 1ro los PCs y luego los Portatiles
        //modo=3 listo solo los PCs
        //modo=4 listo solo los portatiles
        //instanceof
        switch (modo) {

            case 1:
                //opcion1
                System.out.println("Listado de elementos en el inventario");
//                for (int i = 0; i < inventario.size(); i++) {
//                    System.out.println(inventario.get(i));
//                }
                //opcion2
                for (Ordenador ord : inventario) {
                    System.out.println(ord);
                }
                break;
            case 2:
                System.out.println("PCs:");
                for (Ordenador ord : inventario) {
                    if (ord instanceof PC) {
                        System.out.println(ord);
                    }
                }
                System.out.println("Portatiles:");
                for (Ordenador ord : inventario) {
                    if (ord instanceof Portatil) {
                        System.out.println(ord);
                    }
                }
                break;
            case 3:
                 System.out.println("PCs:");
                for (Ordenador ord : inventario) {
                    if (ord instanceof PC) {
                        System.out.println(ord);
                    }
                }
                break;
            case 4:
                 System.out.println("Portatiles:");
                for (Ordenador ord : inventario) {
                    if (ord instanceof Portatil) {
                        System.out.println(ord);
                    }
                }
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
