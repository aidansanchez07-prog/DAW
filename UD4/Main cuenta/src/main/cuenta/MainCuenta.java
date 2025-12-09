package main.cuenta;

/**
 *
 * @author aidan
 */
public class MainCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1=new Cuenta("Aidan","1234567890",2.1,500.0);
       
        System.out.println(c1.toString());
    }
    
}
