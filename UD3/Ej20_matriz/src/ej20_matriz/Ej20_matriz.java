package ej20_matriz;

/**
 *
 * @author aidan
 */
public class Ej20_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int filas=5;
            int colum=5;
            int sumatotal=0;
            int sumafilas=0;
            int[] sumacolum= new int [colum];
            int sumacolum1=0;
           int [][]matriz= new int [filas][colum];
           for(int i=0; i<filas;i++){
               for(int j=0; j<colum;j++){
                   int num = (int) (Math.random() * (100)) ;
                   matriz[i][j]=num;
               }
           }
           for(int i=0; i<filas;i++){
               for(int j=0;j<colum;j++){
                   sumafilas=sumafilas+matriz[i][j];
                   sumacolum1=sumacolum1+matriz[j][i];
                   sumatotal=sumatotal+matriz[i][j];
                   if(matriz[i][j]<10){
                       System.out.print("0"+matriz[i][j]+"          ");
                   }
                   else{
                       System.out.print(matriz[i][j]+"          ");
                   }
               }
               System.out.print("Total fila "+(i+1)+" : "+sumafilas);
               System.out.println("");
               sumafilas=0;
               sumacolum[i]=sumacolum1;
               sumacolum1=0;
           }
           for(int i=0; i<colum;i++){
               System.out.print(" Total= "+sumacolum[i]);
           }
           System.out.println("");
           System.out.println("La summa total es: "+sumatotal);
    }
    
}
