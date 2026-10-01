package arraylistaleatorios;
 import java.util.ArrayList;
/**
 *
 * @author aidan
 */
public class ArrayListaleAtorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> numeros=new ArrayList<>();
       while(numeros.size()<10){
           int num = (int) (Math.random() * (101)) ;
            numeros.add(num);
       }
       double media=0;
        System.out.print("Los numeros que se han introducido son: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(" "+numeros.get(i));
            media=media+numeros.get(i);
        }
        System.out.printf("\nLa media de todos los numeros es: %.2f",media/numeros.size());
    }
    
}
