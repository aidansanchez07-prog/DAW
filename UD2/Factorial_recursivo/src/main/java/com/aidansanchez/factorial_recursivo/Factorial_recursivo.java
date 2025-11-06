

package com.aidansanchez.factorial_recursivo;

/**
 *
 * @author aidan
 */
public class Factorial_recursivo {

    public static void main(String[] args) {
        System.out.println("Introduce el nnumero");
        int numero=Integer.parseInt(System.console().readLine());
        
        System.out.println("Serie de Fibonacci");
        if(numero<0){
            System.out.println("Introduce un numero positivo");
        }
        else if (numero<2){
            System.out.println(numero);
        }
        else{
            String resultado="";
           // int n1=0;
            //int n2=1;
            //int contador=1;
           // for(int i=0;i<=numero;i++){
             //   if(i==numero){
            //        resultado=resultado+n2;
              //  }
              //  else{
              //      resultado=resultado +n2+",";
             //   }
               // int numero_sig=n1+n2;
               //         n1=n2;
              //          n2=numero_sig;
          //  }
           // System.out.println(resultado);
        //   resultado=resultado+fibonacci(numero);
          //  System.out.println(resultado);
            for(int i=1; i<=numero;i++){
                if(i==numero){
                System.out.print(fibonacci(i));
                }
                else{
                    System.out.print(fibonacci(i)+",");
                }
            }
          int result=fibonacci(numero);
        }
    }
    public static int fibonacci(int num){
        if(num==0 || num==1){
           
            return num;
        }
        else{
            
            
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}
