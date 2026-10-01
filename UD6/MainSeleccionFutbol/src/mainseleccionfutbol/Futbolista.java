package mainseleccionfutbol;

import java.util.Date;
import java.time.*;
/**
 *
 * @author aidan
 */
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private Demarcacion demarcacion;
    private Estadisticas estadisticas;

    public class Estadisticas {

        private int goles;
        private int faltas;
        private int partidosJugados;
        private int tarjetasAmarillas;
        private int tarjetasRojas;

        // Constructor vacío
        public Estadisticas() {
        }

        // Constructor con parámetros
        public Estadisticas(int goles, int faltas, int partidosJugados,
                int tarjetasAmarillas, int tarjetasRojas) {
            this.goles = goles;
            this.faltas = faltas;
            this.partidosJugados = partidosJugados;
            this.tarjetasAmarillas = tarjetasAmarillas;
            this.tarjetasRojas = tarjetasRojas;
        }

        // Getters y setters
        public int getGoles() {
            return goles;
        }

        public void setGoles(int goles) {
            this.goles = goles;
        }

        public int getFaltas() {
            return faltas;
        }

        public void setFaltas(int faltas) {
            this.faltas = faltas;
        }

        public int getPartidosJugados() {
            return partidosJugados;
        }

        public void setPartidosJugados(int partidosJugados) {
            this.partidosJugados = partidosJugados;
        }

        public int getTarjetasAmarillas() {
            return tarjetasAmarillas;
        }

        public void setTarjetasAmarillas(int tarjetasAmarillas) {
            this.tarjetasAmarillas = tarjetasAmarillas;
        }

        public int getTarjetasRojas() {
            return tarjetasRojas;
        }

        public void setTarjetasRojas(int tarjetasRojas) {
            this.tarjetasRojas = tarjetasRojas;
        }

        @Override
        public String toString() {
            return  "\nGoles: " + goles + "\nFaltas: " + faltas + "\nPartidos Jugados: " + partidosJugados + "\nTarjetas Amarillas: " + tarjetasAmarillas + "\nTarjetas Rojas: " + tarjetasRojas ;
        }

        public void mostrarEstadisticas() {
            System.out.println("   Goles: " + goles);
            System.out.println("   Faltas: " + faltas);
            System.out.println("   Partidos jugados: " + partidosJugados);
            System.out.println("   Tarjetas amarillas: " + tarjetasAmarillas);
            System.out.println("   Tarjetas rojas: " + tarjetasRojas);
        }
    }

    public Futbolista(int dorsal, Demarcacion demarcacion, int id, String Nombre, String Apellidos, Date fechaNacimiento, int goles, int faltas, int partidosJugados,
            int tarjetasAmarillas, int tarjetasRojas) {
        super(id, Nombre, Apellidos, fechaNacimiento);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        Estadisticas estad = new Estadisticas(goles, faltas, partidosJugados, tarjetasAmarillas, tarjetasRojas);
        this.estadisticas = estad;
    }

    public Futbolista(int dorsal, Demarcacion demarcacion, int id, String Nombre, String Apellidos, Date fechaNacimiento) {
        super(id, Nombre, Apellidos, fechaNacimiento);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // metodo
    public void altaEstadisticas(int goles, int faltas, int partidosJugados, int tarjetasAmarillas, int tarjetasRojas) {
        Estadisticas estad = new Estadisticas(goles, faltas, partidosJugados, tarjetasAmarillas, tarjetasRojas);
        this.estadisticas = estad;
    }

    public void actualizaEstadisticas(int goles, int faltas, int partidosJugados, int tarjetasAmarillas, int tarjetasRojas, Estadisticas estad) {
        estadisticas.faltas += faltas;
        estadisticas.goles += goles;
        estadisticas.partidosJugados += partidosJugados;
        estadisticas.tarjetasAmarillas += tarjetasAmarillas;
        estadisticas.tarjetasRojas += tarjetasRojas;
    }

   

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarcacion getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarcacion demarcacion) {
        this.demarcacion = demarcacion;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String Concentrarse() {
        return Nombre+" ("+demarcacion+") entra en la concentración";
    }
    
    @Override
        public String Viajar(){
            return Nombre+" ("+demarcacion+") viaja para iniciar la concentracion";
}

    @Override
    public String toString() {
        return"\n"+ this.getClass().getSimpleName()+"\nId"+id +"\nNombre: " +Nombre+"\nEdad: "+this.calculaEdad()+"\nDorsal: " + dorsal + "\nDemarcacion: " + demarcacion + "\nEstadisticas: " + estadisticas;
    }
        
}
