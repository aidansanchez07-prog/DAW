package mainlecturafichero;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author aidan
 */
public class MainLecturaFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar ruta de un fichero y vamos a escribir por pantalla todo lo que tiene el fichero
        String logError="";
        String ruta="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la ruta completa del fichero de entrada: ");
        BufferedReader br;
        try{
            ruta=sc.nextLine();
            br=new BufferedReader(new FileReader(ruta));
            //Si no tengo permisos genera un IOException 
            String linea;
            linea=br.readLine();
            
            while(linea!=null){
                System.out.println(linea);
                Utils.corrigeFichero(".\\CopiaFichero.txt",linea);
                linea=br.readLine();
                
            }
           // Utils.corrigeFichero(".\\CopiaFicherocorregido.txt",linea);
             br.close();
        }catch(FileNotFoundException fnfe){
            logError="Fichero no encontrado";
        }catch(IOException ioe){
            logError="Error de lectura";
        }catch(Exception e){
            logError="Illo esto no ha funcionado";
        }finally{
            sc.close();
           
        }
         
    }
    
}
