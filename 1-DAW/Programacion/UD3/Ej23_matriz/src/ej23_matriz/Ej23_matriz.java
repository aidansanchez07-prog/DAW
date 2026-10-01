package ej23_matriz;

/**
 *
 * @author aidan
 */
public class Ej23_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int filas;
            int colum;
           System.out.println("Dime el numero de filas que quieras");
            filas=Integer.parseInt(System.console().readLine());
            System.out.println("Dime el numero de cloumnas");
            colum=Integer.parseInt(System.console().readLine());
           int [][]matriz= new int [filas][colum];
           int num;
           for(int i=0; i<filas;i++){
               for(int j=0; j<colum;j++){
                   do{
                       
                        num = (int) (Math.random() * (100)) ;
                       
                   }while(numNoRepetido(matriz, num));
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
    public static boolean numNoRepetido (int[][] matriz, int num){
            
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if(matriz[i][j]==num){
                    return true;
                }
                
            }
        }
            return false;
    }
    
}
