package ejarraylist;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author aidan
 */
public class EjArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crece y decrece de forma dinamica
        //Creacion de un elemento de tipo arraylist
        ArrayList<Integer> numeros=new ArrayList<>();
        
        //Menu que indique 1 para añadir y 0 para salir
        int opcion=2;
        do{
         System.out.println("Pulse 1 para añadir un numero y pulse 0 para salir");
        opcion=Integer.parseInt(System.console().readLine());
        if(opcion==1){
            System.out.println("Introduce un nuevo numero");
            int num=Integer.parseInt(System.console().readLine());
            numeros.add(num);
        }
        else if (opcion!=0 &&opcion!=1){
            System.out.println("Opcion incorrecta");
        }
        }while(opcion!=0);
        if(numeros.isEmpty()){
            System.out.println("La estructura esta vacia");
        }
        else{
            System.out.println("Disponemos de "+numeros.size()+" elementos");
            int max=numeros.get(0);
            int min=numeros.get(0);
            System.out.print("Los elementos introducidos son: ");
           //Opcion 1
//            for (int numero:numeros){
//                System.out.print(numero+" ");
//                if (numero>max){
//                    max=numero;
//                }
//                if(numero<min){
//                    min=numero;
//                }
//            
//          Opcion2
//             for(int i=0;i<numeros .size();i++)
//             {
//                 System.out.print(numeros.get(i)+" ");
//                if (numeros.get(i)>max){
//                    max=numeros.get(i);
//                }
//                if(numeros.get(i)<min){
//                    min=numeros.get(i);
//                }
//             }
//           Opcion3
               Iterator<Integer> it=numeros.iterator();
               while(it.hasNext()){
                   int numero=it.next();
                   System.out.print(numero+" ");
                if (numero>max){
                    max=numero;
                }
                if(numero<min){
                    min=numero;
                }
               }
            System.out.println("\n El maximo es "+max+" y el minimo es "+min);
        }
        
    }
    
}
