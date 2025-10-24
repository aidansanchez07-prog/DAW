package com.aidansanchez.menor.mayor;

/**
 *
 * @author aidan
 */
public class MenorMayor {

    public static void main(String[] args) {
        int n1, n2, n3;
        System.out.println("Introduce tres numeros y te los ordeno de menor a mayor");
        boolean manteca=true;
        do {
            try {
                n1 = Integer.parseInt(System.console().readLine());
                n2 = Integer.parseInt(System.console().readLine());
                n3 = Integer.parseInt(System.console().readLine());

                if (n1 <= n2 && n2 <= n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else if (n2 <= n1 && n1 <= n3) {
                    System.out.println(n2 + " " + n1 + " " + n3);
                } else if (n2 <= n3 && n3 <= n1) {
                    System.out.println(n2 + " " + n3 + " " + n1);
                } else if (n1 <= n3 && n3 <= n2) {
                    System.out.println(n1 + " " + n3 + " " + n2);
                } else if (n3 <= n1 && n1 <= n2) {
                    System.out.println(n3 + " " + n1 + " " + n2);
                } else if (n3 <= n2 && n2 <= n1) {
                    System.out.println(n3 + " " + n2 + " " + n1);
                }
                manteca=false;
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Por favor introduce un formato numerico");
            }
        }  while(manteca==true);   
    }
}
