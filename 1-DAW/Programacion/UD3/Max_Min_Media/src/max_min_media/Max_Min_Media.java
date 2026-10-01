package max_min_media;

/**
 *
 * @author aidan
 */
public class Max_Min_Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int max=0;
         int min=0;
         double media=0;
              
         int[] numeros= new int[10];
         for(int i=0;i<numeros.length;i++){
               int nota =(int)(Math.random()*(50))+1;
             if(i==0){
                 min=nota;
                 max=nota;
             }
             else{
                 if(min>nota){
                     min=nota;
                 }
                 if(max<nota){
                     max=nota;
                 }
                 
             }
             numeros[i]=nota;
             media=media+numeros[i];
         }
         System.out.printf("El maximo es: %d , el minimo es: %d y la media es: %.2f\n",max,min,(media/numeros.length));
    }
    
}
