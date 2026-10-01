package mainempleados;

import java.time.LocalDate;
import java.util.ArrayList;
import static mainempleados.Utils.borraLog;

/**
 *
 * @author aidan
 */
public class MainEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        Formato del fichero (empleados.txt)
//        1;Ana;López;1200.50
//        2;Carlos;Pérez;1450.00
//        3;Laura;Gómez;1320.75
 borraLog("C:\\DAW\\Programacion\\UD 7\\MainEmpleados\\log.txt");
        ArrayList<Empleados> listaEmpleados=new ArrayList<>();
        Utils.cargaEmpleados(listaEmpleados,"C:\\DAW\\Programacion\\UD 7\\MainEmpleados\\empleados.txt.txt");
        
        Utils.listarEmpleados(listaEmpleados);
     
        String ruta=".\\nominas"+LocalDate.now().getMonthValue()+"-"+LocalDate.now().getYear()+".csv";
        Utils.generaNominasMes(listaEmpleados, ruta);
        
    }
    
}
