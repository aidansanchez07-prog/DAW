package ej6_arrays;
import java.util.Random;
/**
 *
 * @author aidan
 */
public class Ej6_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros= new int[15];
       for(int i=0;i<numeros.length;i++){
           System.out.println("Introduce numero");
           numeros[i]=Integer.parseInt(System.console().readLine());
       }
       //Opcion desplazo una posición
//         int[] numDesordenado=new int[15];
//         numDesordenado[0]=numeros[15];
//         for(int i=0;i<15;i++){
//             numDesordenado[i+1]=numeros[i];
//         }
       int[] numDesordenado=new int[15];
       for(int i=0;i<15;i++){
           numDesordenado[i]=-1;
       }
       for(int i=0; i<numeros.length;i++){
           boolean numSinMover=true;
           int pos=0;
           Random numAleatorio=new Random();
           do{
               pos= numAleatorio.nextInt(15);
               //pos=(int)Math.random()*15;
               //pos=Random.nextInt(15);
               if(numDesordenado[pos]==-1){
                   numDesordenado[pos]=numeros[i];
                   numSinMover=false;
               }
           }while(numSinMover);
       }
       for(int i=0; i<numeros.length;i++){
           System.out.print(numDesordenado[i]+" ");
       }
    }
    
}
