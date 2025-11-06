package comparacion_de_arrays;

import java.util.Arrays;

/**
 *
 * @author aidan
 */
public class Comparacion_de_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1;
        int[] array2 = {5, 6, 7, 6, 7, 8};
        System.out.println("Longitud: " + array2.length);
        String[] array3 = {"BD", "LLMM", "Programación", "SI", "Entornos", "IPE1"};
        int[] array4 = {5, 6, 7, 6, 7, 8};
        array1 = array4;
        System.out.println(array1 == array4);
        System.out.println(array2 == array4);
        System.out.println(array1.equals(array4));
        System.out.println(Arrays.equals(array2, array4));
        System.out.println("Son iguales¿? " + comparaArrays(array2, array4));
    }

    public static boolean comparaArrays(int[] array1, int[] array2) {
        boolean a = true;
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j == i; j++) {
//                if (i == j) {
//                    if ((array1[i] / array2[j]) == 1) {
//
//                    } else {
//                        a = false;
//                    }
//                }
//
//            }
//        }
//            for(int i=0;i<array1.length;i++){
//                if(array1[i]==array2[i]){              }
//                else{  a=false; } }
            if(array1.length!=array2.length)return false;
            int contador=0;
            for(int nota :array1){
                if(nota!=array2[contador]){
                    return false;
                }
                else{
                    contador++;
                }
            }
        return a;
    }

}
