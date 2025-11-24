package ej10_array;

/**
 *
 * @author aidan
 */
public class Ej10_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array=new int[20];
        
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random( )*100);
            System.out.println(array[i]);
        }
    }
    
}
