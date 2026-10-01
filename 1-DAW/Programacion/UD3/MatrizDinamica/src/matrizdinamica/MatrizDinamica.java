package matrizdinamica;

import java.util.Random;

/**
 *
 * @author aidan
 */
public class MatrizDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matrizAleatorios;
        int max=0;
        int min=0;
        double media=0;
        Random numAleatorio= new Random();
        //inicializo matriz
        System.out.println("Ingrese el numero de las filas de la matriz que desees");
        int tam_filas = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero de las columnas de la matriz que desees");
        int tam_colum=Integer.parseInt(System.console().readLine());
        matrizAleatorios = new int[tam_filas][tam_colum];
        //relleno la matriz con aleatorios (10 a 100)
        for (int i = 0; i < tam_filas; i++) {
            for (int j = 0; j < tam_colum; j++) {
                //matrizAleatorios[filas][colum] = (int) ((Math.random() * (100 - 10 + 1)) + 10);
                matrizAleatorios[i][j]=numAleatorio.nextInt(90)+10;
                if(i==0 && j==0){
                    max=matrizAleatorios[i][j];
                    min=matrizAleatorios[i][j];
                }
                else{
                    if(matrizAleatorios[i][j]<min){
                        min=matrizAleatorios[i][j];
                    }
                    if(matrizAleatorios[i][j]>max){
                        max=matrizAleatorios[i][j];
                    }
                }
                media=media+matrizAleatorios[i][j];


           }
       }
        for (int i = 0; i < tam_filas; i++) {
            for (int j = 0; j < tam_colum; j++) {
                System.out.print(matrizAleatorios[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.printf("El numero maximo es %d, el minimo es %d, y la media es %.2f\n",max,min,(media/(tam_filas*tam_colum)));
    }
    
}
