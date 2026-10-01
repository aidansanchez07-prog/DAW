package ej5_array;

/**
 *
 * @author aidan
 */
public class Ej5_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num= new int[10];
        int mayor=0;
        int menor=0;
        System.out.println("Introduce 10 numeros");
        for(int i=0; i<num.length; i++){
            System.out.println("Introduce el numero "+(i+1)+":");
            num[i]=Integer.parseInt(System.console().readLine());
            if(i==0){
                mayor=num[i];
                menor=num[i];
            }
            else{
                if(mayor<num[i]){
                    mayor=num[i];
                }
                if(menor>num[i]){
                    menor=num[i];
                }
            }
        }
        System.out.println("Los numeros que nos han salido son: ");
          for(int i=0; i<num.length; i++){
              if(num[i]==mayor){
                  System.out.println(num[i]+": maximo");
              }
               if(num[i]==menor){
                  System.out.println(num[i]+": minimo");
              }
               else{
                   System.out.println(num[i]);
               }
          }
       // System.out.println("El numero mayor es: "+mayor+" y el menor es: "+menor);
    }
    
}
