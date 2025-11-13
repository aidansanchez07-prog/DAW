package ej9_array;

/**
 *
 * @author aidan
 */
public class Ej9_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//          int[] num = new int[8];
          
//        System.out.println("Introduce 8 numeros");
//        for (int i = 0; i < num.length; i++) {
//            num[i] = Integer.parseInt(System.console().readLine());
//          
//        }
//        for (int i=0;i<num.length;i++){
//              if (num[i] % 2 == 0) {
//                System.out.println("El numero " + num[i] + " es par");
//            } else {
//                System.out.println("El numero " + num[i] + " es impar");
//            }
//        }
        String []texto;
        String chorizo;
        chorizo=System.console().readLine();
        texto=chorizo.split(";");
        int a;
       for(int i=0;i<texto.length;i++){
       a=  Integer.parseInt(texto[i]);
         if(a%2==0){
             System.out.println("El numero "+a+" es par");
         }
         else{
             System.out.println("El numero "+a+" es impar");
         }
         
       }
    }

}
