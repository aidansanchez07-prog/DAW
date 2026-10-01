package pkg15.numeros.orden.random;

/**
 *
 * @author aidan
 */
public class NumerosOrdenRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros=new int[15];
        int contador=0;
       
        System.out.println("Introduzca 15 Numeros y te los desordenare");
        for(int i=0; i<numeros.length;i++){
            numeros[i]=Integer.parseInt(System.console().readLine());
        }
       
             
             
             while(contador<numeros.length){
                 int num = (int) ((Math.random() * (15 - 1 + 1)) + 1);
             int [] array=new int[15];
                 for(int i=0;i<numeros.length;i++){
                     if(contador==0){
                         System.out.println(numeros[num]);
                         contador++;
                         array[i]=numeros[num];
                         break;
                     }
                     if(num!=array[i]){
                         System.out.println(numeros[num]);
                         contador++;
                         array[i]=numeros[num];
                         break;
                     }
                     else{
                         
                     }
                     
                 }
             
        }
    }
    
}
