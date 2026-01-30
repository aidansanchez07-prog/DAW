package baloncestomain;

/**
 *
 * @author aidan
 */
public class Partido {
    private Equipos equipo1;
    private Equipos equipo2;
    private Arbitro arbitro;

    public Partido(Equipos equipo1, Equipos equipo2, Arbitro arbitro) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.arbitro = arbitro;
    }

    public Equipos getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipos equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipos getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipos equipo2) {
        this.equipo2 = equipo2;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    @Override
    public String toString() {
        return "\nPartido{" + "\nequipo1=" + equipo1 + "\nequipo2=" + equipo2 + "\narbitro=" + arbitro + '}';
    }
    
}
