package maincoche;

/**
 *
 * @author aidan
 */
public class Maincoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1=new Coche("Ferrari-Testarosa","Rojo",180,"R20");
        System.out.println("Estado del coche: "+c1.toString());
        c1.arrancar();
        c1.girarRuedas();
        //opcion 2
        Motor motor= new Motor(150);
        Rueda[] ruedas={new Rueda("R19"),new Rueda("R19"),new Rueda("R19"),new Rueda("R19")};
         Coche c2=new Coche("Ferrari-F20","Rojo",motor,ruedas);
         System.out.println("Estado del coche: "+c2.toString());
        c2.arrancar();
        c2.girarRuedas();
    }
    
}
