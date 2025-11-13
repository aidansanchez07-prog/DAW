package primera.matriz;
import java.util.Random;
/**
 *
 * @author aidan
 */
public class PrimeraMatriz {

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
        int tam_matriz = 4;
        matrizAleatorios = new int[tam_matriz][tam_matriz];
        //relleno la matriz con aleatorios (10 a 100)
        for (int filas = 0; filas < tam_matriz; filas++) {
            for (int colum = 0; colum < tam_matriz; colum++) {
                //matrizAleatorios[filas][colum] = (int) ((Math.random() * (100 - 10 + 1)) + 10);
                matrizAleatorios[filas][colum]=numAleatorio.nextInt(90)+10;
                if(filas==0 && colum==0){
                    max=matrizAleatorios[filas][colum];
                    min=matrizAleatorios[filas][colum];
                }
                else{
                    if(matrizAleatorios[filas][colum]<min){
                        min=matrizAleatorios[filas][colum];
                    }
                    if(matrizAleatorios[filas][colum]>max){
                        max=matrizAleatorios[filas][colum];
                    }
                }
                media=media+matrizAleatorios[filas][colum];


           }
       }
        for (int filas = 0; filas < tam_matriz; filas++) {
            for (int colum = 0; colum < tam_matriz; colum++) {
                System.out.print(matrizAleatorios[filas][colum]+" ");
            }
            System.out.println("");
        }
        System.out.printf("El numero maximo es %d, el minimo es %d, y la media es %.2f\n",max,min,(media/(tam_matriz*tam_matriz)));
    }
    
}
