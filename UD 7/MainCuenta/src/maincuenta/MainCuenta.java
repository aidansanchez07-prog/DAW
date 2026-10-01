package maincuenta;

import java.io.*;
import java.util.*;

/**
 *
 * @author aidan
 */
public class MainCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce el directorio en el que están ubicados los ficheros origen:");
        String directorio = System.console().readLine();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        File ficheros = new File(directorio);

        if (!ficheros.exists()) {
            System.out.println("No podemos ejecutar el programa, no existe el directorio");
        } else {
            String fichCliente = directorio + "\\clientes.txt";

            try {
                BufferedReader br = new BufferedReader(new FileReader(fichCliente));
                String linea = br.readLine();
                while (linea != null) {
                    Utils.creaCliente(listaClientes, linea, directorio);
                    linea = br.readLine();
                }
            } catch (FileNotFoundException fnfe) {
                System.out.println(fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Utils.muestraClientes(listaClientes);
        }
    }

}
