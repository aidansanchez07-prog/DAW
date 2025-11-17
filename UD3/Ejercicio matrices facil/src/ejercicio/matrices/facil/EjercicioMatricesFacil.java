package ejercicio.matrices.facil;

/**
 *
 * @author aidan
 */
public class EjercicioMatricesFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Ejercicio que solicita por pantalla el número de filas y el número de columnas de una matriz,
//        ... crea la matriz y la rellena con números aleatorios y a posteriori la pinta. 
//        Deben ser números que van de 0 a 99 y en el caso de que vayamos a pintar números del 0 al 9 le pone un 0 delante.
            int filas;
            int colum;
            System.out.println("Dime el numero de filas que quieras");
            filas=Integer.parseInt(System.console().readLine());
            System.out.println("Dime el numero de cloumnas");
            colum=Integer.parseInt(System.console().readLine());
           int [][]matriz= new int [filas][colum];
           for(int i=0; i<filas;i++){
               for(int j=0; j<colum;j++){
                   int num = (int) (Math.random() * (100)) ;
                   matriz[i][j]=num;
               }
           }
           for(int i=0;i<filas;i++){
               for(int j=0;j<colum;j++){
                   if(matriz[i][j]<10){
                       System.out.print("0"+matriz[i][j]+"  ");
                   }
                   else{
                       System.out.print(matriz[i][j]+"  ");
                   }
                   
               }
               System.out.println("");
           }
    }
    
}
