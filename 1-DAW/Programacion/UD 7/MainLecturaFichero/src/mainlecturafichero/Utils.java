package mainlecturafichero;

import java.io.*;

;

/**
 *
 * @author aidan
 */
public class Utils {

    public static int escribeFichero(String ruta, String linea) {
        int error = 0;
        try {
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(linea);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            error = -1;
        }
        return error;
    }

    public static int corrigeFichero(String ruta, String linea) {
        int error = 0;
        try {

            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(ruta, true));
            String[] texto;
            texto = linea.split(",");
            String resultado = "";

            for (int i = 0; i < texto.length; i++) {
                if (i == texto.length - 1) {
                    resultado = resultado + texto[i];
                } else {
                    resultado = resultado + texto[i] + ", ";
                }

            }

            bw.write(resultado);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            error = -1;
        }
        return error;
    }
}
