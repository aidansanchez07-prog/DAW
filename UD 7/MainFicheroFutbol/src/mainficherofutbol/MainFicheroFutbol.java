package mainficherofutbol;

import java.util.LinkedList;

/**
 *
 * @author aidan
 */
public class MainFicheroFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<SeleccionFutbol> listaSeleccion = new LinkedList<>();
        Utils.borraLog("C:\\DAW\\Programacion\\UD 7\\MainFicheroFutbol\\log.txt");
          Utils.cargaEmpleados(listaSeleccion,"C:\\DAW\\Programacion\\UD 7\\MainFicheroFutbol\\seleccion.txt.txt");
        
        Utils.listarEmpleados(listaSeleccion);
        
    }
    
}
