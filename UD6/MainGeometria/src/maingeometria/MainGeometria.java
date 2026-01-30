package maingeometria;

/**
 *
 * @author aidan
 */
public class MainGeometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo c1=new Circulo(5);
        System.out.println("Area: "+c1.area());
        System.out.println("Perimetro"+ c1.perimetro());
       
        Rectangulo r1= new Rectangulo(5,5);
        System.out.println("Area: "+r1.area());
        System.out.println("Perimetro"+ r1.perimetro());
        
        Triangulo t1=new Triangulo(4,5);
        System.out.println("Area: "+t1.area());
        System.out.println("Perimetro"+ t1.perimetro());
    }
    
}
