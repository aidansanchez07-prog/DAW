package baloncestomain;

import java.util.ArrayList;

/**
 *
 * @author aidan
 */
public class Equipos {
   private String nombreEquipo;
    private String nombreEstadio;
    private Double espectadores;
    private String direccion;
    private String ciudad;
        private ArrayList<Jugador> listaJugadores;

    public Equipos(String nombreEquipo, String nombreEstadio, Double espectadores, String direccion, String ciudad) {
        this.nombreEquipo = nombreEquipo;
        this.nombreEstadio = nombreEstadio;
        this.espectadores = espectadores;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.listaJugadores= new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public Double getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Double espectadores) {
        this.espectadores = espectadores;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
         public void altaJugador(Jugador jugador){
        this.listaJugadores.add(jugador);
    }
    
    // ArrayList<Jugador> listaJugadores;
    public boolean buscaJugador(String jugador){
        boolean encontrado = false;
        // equivalente a: for (int i=0; i<listaJugadores.size() ;i++){
        for (int i=0; i<this.listaJugadores.size() ;i++){
            if (listaJugadores.get(i).getNombreJugador().equalsIgnoreCase(jugador)){
                encontrado = true;
            }
            // este else if sería redundante puesto que la variable encontrado se inicia a false y solo cambia a true si encuentra el jugador.
            else if ((i == this.listaJugadores.size()-1) && (!listaJugadores.get(i).getNombreJugador().equalsIgnoreCase(jugador))){
                encontrado = false;
            }
        }
        return encontrado;
    }
    
    public boolean bajaJugador(String jugador){
        boolean encontrado = false;
        for (int i=0; i<this.listaJugadores.size() ;i++){
            if (listaJugadores.get(i).getNombreJugador().equalsIgnoreCase(jugador)){
                encontrado = true;
                listaJugadores.remove(i);
            }
        }
        return encontrado;
    }
     @Override
    public String toString() {
        return "---Equipo---\n"
                + "\n Nombre Equipo=" + nombreEquipo
                + "\n Nombre Estadio=" + nombreEstadio
                + "\n Espectadores=" + espectadores
                + "\n Direccion=" + direccion
                + "\n Ciudad=" + ciudad
                +"\nLista de jugadores:"
                +"\n Número de jugadores: "+listaJugadores.size()
                +listaJugadores.toString();
    }
    public void mostrarDatos(){
        System.out.println("---Equipo---\n"
                + "\n Nombre Equipo=" + nombreEquipo
                + "\n Nombre Estadio=" + nombreEstadio
                + "\n Espectadores=" + espectadores
                + "\n Direccion=" + direccion
                + "\n Ciudad=" + ciudad
                +"\nLista de jugadores:"
                +"\n Número de jugadores: "+listaJugadores.size()); 
        for (int i = 0; i < listaJugadores.size(); i++) {
            System.out.println("Nombre Jugador: "+listaJugadores.get(i).getNombreJugador());
        }
    }
}
