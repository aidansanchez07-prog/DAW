package main.carrera;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class MainCarrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Bicicleta> lista = new ArrayList<>();
        int max = 1;
        boolean a=true;
        int ganador=0;
        int contador = 0;
        int max_distancia = 400;
        System.out.println("Hola buenas bienvenido a los autoslocos");
        int opcion = 2;
        while (opcion != 0) {
            System.out.println("Si quiere añadir un participante pulse 1 si quieres empezar la carrera pulse 0");
            opcion = Integer.parseInt(System.console().readLine());
            if (opcion == 1) {
                System.out.println("Diga que nombre tiene el concursante");
                String nombre = System.console().readLine();
                while (max < 10 || max > 35) {
                    System.out.println("Diganos que velocidad es su maxima entre 10-35");
                    max = Integer.parseInt(System.console().readLine());
                    if (max < 10 || max > 35) {
                        System.out.println("Valor introducido fuera de rango");
                    }

                }
                Bicicleta bTemp = new Bicicleta(nombre, max, 0, 0);
                lista.add(bTemp);
                max = 1;
            } else if (opcion == 0) {

            } else {
                System.out.println("Opcion incorrecta");
            }
        }
        if (lista.size() < 2) {
            System.out.println("Lo siento pero con menos de dos concursantes no se puede competir");
        } else {
            System.out.println("Que comience la carrera");
            while (a==true) {

                if (contador < lista.size()) {
                    if ((lista.get(contador).getMax()-4) > lista.get(contador).getVelocidadActual()) {
                        lista.get(contador).acelerar();
                    } else {
                        lista.get(contador).frenar();
                    }
                    lista.get(contador).avanzar();

                    contador++;
                } else {
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getposicionX() >= max_distancia) {
                            a=false;
                        }
                    }
                    contador = 0;
                }
            }
        
        
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                a = true;

                if (i == j) {

                } else {
                    if (a == true) {
                        if (lista.get(i).getposicionX() >= lista.get(j).getposicionX()) {
                            a = true;
                        } else {
                            a = false;

                        }
                    }
                }
            }
            if (a == true) {
                
              
                ganador=i;
                break;
            }
        }
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i).getNombre()+":");
            for (int j = 0; j < lista.get(i).getposicionX(); j++) {
                System.out.print("*");
                Thread.sleep(500);
                
                //Para que dure mucho menos el proceso
                j=j+5;
            }
            System.out.println("");
        }
            System.out.println("El ganador es: "+lista.get(ganador).getNombre());
        }
    }

}
