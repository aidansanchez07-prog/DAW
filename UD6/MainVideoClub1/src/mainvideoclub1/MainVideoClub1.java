package mainvideoclub1;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class MainVideoClub1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VideoClub videoC = new VideoClub();
//Crear un objeto VideoClub.
//Añadir al inventario varios elementos de distintos tipos (Juego y Articulo).
//Mostrar el inventario completo.
//Realizar una búsqueda de elementos por nombre y mostrar los resultados obtenidos.
        Juego j1 = new Juego(false, "MINE123", "Minecraft", 20.50);
        Juego j2 = new Juego(false, "GTA_6", "Grand Theft Auto", 30);
        Articulos a1 = new Articulos(Tipo.MANDO, "Mando1", "mando PS1", 20);
        Articulos a2 = new Articulos(Tipo.MANDO, "Mando2", "mando XS2", 30);
        Articulos a3 = new Articulos(Tipo.MANDO, "Mando3", "mando XS3", 50);
        videoC.agregarElemento(j1);
        videoC.agregarElemento(j2);
        videoC.agregarElemento(a1);
        videoC.agregarElemento(a2);
        videoC.agregarElemento(a3);
        videoC.mostrarInventario();
        ArrayList<Elemento> resultBusqueda = videoC.buscarPorNombre("Mando");
        if (resultBusqueda.isEmpty()) {
            System.out.println("El elemento buscado no se encuentra");
        } else {
            for (int i = 0; i < resultBusqueda.size(); i++) {
                System.out.println(resultBusqueda.get(i));
            }
        }
        if (resultBusqueda.isEmpty()) {
            System.out.println("El elemento buscado no se encuentra.");
        } else {
            for (int i = 0; i < resultBusqueda.size(); i++) {
                System.out.println(resultBusqueda.get(i));
            }
            
        }
        int num=1;
        
    }
    }