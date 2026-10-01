package main_copia_fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author aidan
 */
public class Utils {
    public static boolean copiaFichero(String origen,String destino){
        boolean todoOk=false;
        BufferedReader br;
          try {
            br = new BufferedReader(new FileReader(origen));
             String linea = br.readLine();
            while (linea != null) {
                if(escribeFichero(destino,linea)==true){
                    todoOk=true;
                }else{
                    todoOk=false;
                    return todoOk;
                }
                linea=br.readLine();
                
            }
            br.close();
          }catch (FileNotFoundException fnfe) {
              System.out.println("No se encontro el fichero");

        } catch (IOException ioe) {
              System.out.println("A ocurrido un error IOException");

        } catch (Exception e){
              System.out.println("A ocurrido algun error");
        }
        
        
        return todoOk;
    }
     public static boolean escribeFichero(String ruta, String linea) {
        boolean error = false;
        try {
            PrintWriter bw;
            bw = new PrintWriter(new FileWriter(ruta, true));
            bw.println(linea);
            bw.close();
            error =true;
        }catch (IOException e) {
            error = false;
        }
        return error;
    }
}
