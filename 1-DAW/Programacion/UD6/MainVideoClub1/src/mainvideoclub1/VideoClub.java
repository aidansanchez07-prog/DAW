package mainvideoclub1;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class VideoClub {

    private ArrayList<Elemento> inventario;

    public VideoClub() {
        inventario = new ArrayList<>();
    }

    public void agregarElemento(Elemento e) {
        inventario.add(e);
    }

    public void mostrarInventario() {
        System.out.println("--Listado del inventario--");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(inventario.get(i));
        }
    }

    public ArrayList<Elemento> buscarPorNombre(String nombre) {
        ArrayList<Elemento> aTemp = new ArrayList<Elemento>();
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).nombre.equalsIgnoreCase(nombre)) {
                aTemp.add(inventario.get(i));
            }

        }
        return aTemp;
    }

}
