package mainanimales;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op=-1;
        String nombre;
        int edad;
        String raza;
        ArrayList<Animales> animales = new ArrayList<>();
     
        do{
               System.out.println("Pulsa 1 para crear un perro, pulsa 2 para crear un gato, pulsa 3 para crear un caballo, pulsa 4 para mostrarlo todo o pulsa 0 para cerrar ");
           op= obtenNumeroEntero("");
           switch(op){
               case 1:
                   Perros pTemp=new Perros();
                   System.out.println("Dime el nombre");
                    nombre=System.console().readLine();
                   edad=obtenNumeroEntero("Dime la edad");
                   System.out.println("Dime la raza");
                    raza=System.console().readLine();
                     pTemp= new Perros(raza,nombre,edad);
                     animales.add(pTemp);
                   break;
               case 2:
                   Gatos gTemp=new Gatos();
                   System.out.println("Dime el nombre");
                    nombre=System.console().readLine();
                   edad=obtenNumeroEntero("Dime la edad");
                   System.out.println("Dime la raza");
                    raza=System.console().readLine();
                    gTemp= new Gatos(raza,nombre,edad);
                    animales.add(gTemp);
                   break;
               case 3:
                   Caballos cTemp=new Caballos();
                   System.out.println("Dime el nombre");
                    nombre=System.console().readLine();
                  edad= obtenNumeroEntero("Dime la edad");
                   System.out.println("Dime la raza");
                    raza=System.console().readLine();
                    cTemp= new Caballos(raza,nombre,edad);
                    animales.add(cTemp);
                   break;
               case 4:
                   for (int i = 0; i < animales.size(); i++) {
                       System.out.println(animales.get(i));
                   }
                   break;
               case 0:
                   System.out.println("Hasta mañana");
                   break;
               default:
                   System.out.println("Error");
           }
            
        }while(op!=0);
    }
    public static int obtenNumeroEntero(String mensaje) {
        int numero = 0;
        System.out.println(mensaje);
        do{
        try {
            numero = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            numero = -1;
            System.out.println("Valor incorrecto, introduzcalo otra vez");
        }}while(numero==-1);
        return numero;
    }
}
