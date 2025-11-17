package ej22_matriz;

/**
 *
 * @author aidan
 */
public class Ej22_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = 6;
        int colum = 10;
        int max=0;
        int min=0;
        int fa=0;
        int ca=0;
        int fi=0;
        int ci=0;
        String chorizo;
         int[][] matriz = new int[filas][colum];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                int num = (int) (Math.random() * (1001));
                matriz[i][j] = num;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colum; j++) {
                if (i == 0 & j == 0) {
                    max=matriz[i][j];
                    min=matriz[i][j];
                }
                else{
                    if(max<matriz[i][j]){
                        max=matriz[i][j];
                        fa=i;
                        ca=j;
                    }
                    if(min>matriz[i][j]){
                        min=matriz[i][j];
                        fi=i;
                        ci=j;
                    }
                }
            }
        }
        for(int i=0;i<filas;i++){
               for(int j=0;j<colum;j++){
                   if(matriz[i][j]<10){
                       System.out.print("00"+matriz[i][j]+"  ");
                   }
                   else if( matriz[i][j]<100){
                       System.out.print("0"+matriz[i][j]+"  ");
                   }
                   else{
                       System.out.print(matriz[i][j]+"  ");
                   }
                   
               }
               System.out.println("");
           }
        System.out.println("La posicion del maximo es fila: "+(fa+1)+" columna: "+(ca+1)+" \nY la posicion del minimo es fila: "+(fi+1)+" columna: "+(ci+1));
    }

}
