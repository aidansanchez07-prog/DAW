package main_copia_fichero;

/**
 *
 * @author aidan
 */
public class Main_Copia_Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //args[0]--> nombre del fichero origen
        //args[1]--> nombre del fichero destino
//        args=new String[2];
        System.out.println(args[0]);
        System.out.println(args[1]);
       
        //control de errores
        if(args.length!=2){
            System.out.println("Uso del siguiente programa");
            System.out.println("java MainCopiaFichero ruta_fich_origen ruta_fich_destino");
        }else{
           boolean todoOk= Utils.copiaFichero(args[0],args[1]);
           if(todoOk){
            System.out.println("Fichero copiado correctamente");
        }
        }
        
    }
    
}
