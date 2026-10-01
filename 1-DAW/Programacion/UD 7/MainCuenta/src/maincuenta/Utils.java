package maincuenta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aidan
 */
public class Utils {

    public static boolean creaCliente(ArrayList<Cliente> lista, String linea, String directorio) {
        boolean correcto = true;
        //DNI;Nombre;Apellidos
        String[] parseoDatos = linea.split(";");
        if (parseoDatos.length == 3) {
            //opcion 1
//            Cuenta cu= buscaCuenta(parseoDatos[0],directorio);            
//            lista.add(new Cliente(parseoDatos[0],parseoDatos[1],parseoDatos[2],cu));

            // Opción 2. Recupero todos los datos de cliente y cuenta y se los envío al constructor de Cliente.           
            // public Cliente(String dni, String nombre, String apellidos, String numCuenta, String nombreBanco)
            String line="";
            String [] texta= new String [3];
             try {
            BufferedReader br = new BufferedReader(new FileReader(directorio + "\\cuentas.txt"));
             line = br.readLine();

            while (linea != null) {

                 texta = line.split(";");
                if (parseoDatos[0].equalsIgnoreCase(texta[0])) {
               
                    break;
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            
        } catch (IOException ioe) {
            
        } catch (Exception e) {
            
        }

            String numCuenta = texta[1];
            String nombreBanco = texta[2];

        

                String[] texta = line.split(";");

                lista.add(new Cliente(parseoDatos[0], parseoDatos[1], parseoDatos[2], numCuenta, nombreBanco));

            
        } else {
            correcto = false;
        }

        return correcto;
    }

    public static Cuenta buscaCuenta(String dni, String directorio) {
        boolean encontrado = true;
        Cuenta cu = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(directorio + "\\cuentas.txt"));
            String linea = br.readLine();

            while (linea != null) {

                String[] texto = linea.split(";");
                if (texto[0].equalsIgnoreCase(dni)) {
                    cu = new Cuenta(texto[1], texto[2]);
                    break;
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            encontrado = false;
        } catch (IOException ioe) {
            encontrado = false;
        } catch (Exception e) {
            encontrado = false;
        }
        return cu;
    }

    public static void muestraClientes(ArrayList<Cliente> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void muestraClientes2(ArrayList<Cliente> lista) {
        Iterator<Cliente> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void muestraClientes3(ArrayList<Cliente> lista) {
        for (Cliente c : lista) {
            System.out.println(c);
        }
    }
}
