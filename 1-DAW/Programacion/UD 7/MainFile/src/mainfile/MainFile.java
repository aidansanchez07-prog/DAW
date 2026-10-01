package mainfile;


import java.io.*;
import java.util.Scanner;

/**
 *
 * @author aidan
 */
public class MainFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        File fichero=new File("C:\\DAW\\Programacion\\UD 7");
        if(fichero.exists()){
            System.out.println("Nombre: "+fichero.getName());
            try {
                System.out.println("Ruta absoluta: "+fichero.getAbsolutePath()+" - "+fichero.getCanonicalPath());
            } catch (IOException ex) {
                System.out.println("Pichon error:"+ex.getMessage());
            }
            System.out.println("¿Es fichero? "+fichero.isFile());
            System.out.println("¿Es directorio? "+fichero.isDirectory());
            System.out.println("Tamanyo (bytes): "+fichero.length());
             System.out.println("Total space: "+fichero.getTotalSpace()+" Free Space: "+fichero.getFreeSpace()/1024/1024+" UsableSpace: "+fichero.getUsableSpace());
        }else{
            System.out.println("La ruta no existe");
        }
        if(fichero.isDirectory()){
            System.out.println("\nContenido de la ruta: "+fichero.getAbsolutePath());
            File[] archivos=fichero.listFiles();
            System.out.println("Longitud: "+archivos.length);
            if(archivos!=null){
//                for(File f:archivos){
//                    System.out.println((f.isDirectory()?"[Dir]":"[FICH]")+f.getName());
                 for (int i = 0; i < archivos.length; i++) {
                     System.out.println((archivos[i].isDirectory()?"[Dir]":"[FICH]")+archivos[i].getName());
                }
            }
            String[] archivos2 =fichero.list();
                 for(String a:archivos2){
                    System.out.println(((a.indexOf(".") > 0)? "[FICH] " : "[DIR] ")+a);
                }
            }
        String ficheroEsc="C:\\DAW\\Programacion\\UD 7\\NuevoFich.txt";
        Scanner sc=new Scanner(System.in);
        try{
            String frase="";
            BufferedWriter bw;
             bw= new BufferedWriter(new FileWriter(ficheroEsc));
            do{
             System.out.println("Introduce la siguiente frase");
           frase= sc.nextLine();
           if(frase.equalsIgnoreCase("fin")){
               break;
           }
           bw.write(frase);
           bw.newLine();
        }while(!frase.equalsIgnoreCase("fin"));
           bw.close();
        }catch(IOException ioe){
            System.out.println("Error al escribir en el fichero");
        }
        try{
            System.out.println("Dime la ruta del fichero: ");
            String ruta=sc.nextLine();
            PrintWriter pw=new PrintWriter(ruta);
            String frase="";
            while(true){
                  System.out.println("Introduce la siguiente frase");
           frase= sc.nextLine();
           if(frase.equalsIgnoreCase("fin")){
               break;
           }
           pw.println(frase);
            }
            pw.close();
        }catch(FileNotFoundException fnfe){
            System.out.println("Pichon revisa la rutilla no me seas payo payez");
        }
        
    }
    
}
