package maininventarioit;

/**
 *
 * @author aidan
 */
public class PC extends Ordenador {
    private int potenciaFuente;
    private String tipoFormato;
    private boolean incluyeMonitor;
    public PC() {
    }

    public PC(int potenciaFuente, String tipoFormato, String marca, String modelo, int ram, String procesador, double precio, boolean incluyeMonitor) {
        super(marca, modelo, ram, procesador, precio);
        this.potenciaFuente = potenciaFuente;
        this.tipoFormato = tipoFormato;
        this.incluyeMonitor= incluyeMonitor;
    }

    public int getPotenciaFuente() {
        return potenciaFuente;
    }

    public void setPotenciaFuente(int potenciaFuente) {
        this.potenciaFuente = potenciaFuente;
    }

    public String getTipoFormato() {
        return tipoFormato;
    }

    public void setTipoFormato(String tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    public boolean isIncluyeMonitor() {
        return incluyeMonitor;
    }

    public void setIncluyeMonitor(boolean incluyeMonitor) {
        this.incluyeMonitor = incluyeMonitor;
    }
    @Override
  public String arrancandoEquipoOpcion1(){
        return "Arrancando el PC";
    }
    @Override
    public  String tipoOrdenador(){
            return "Soy un ordenador. formato:"+this.tipoFormato;
}
    @Override
    public  String arrancandoEquipo(){
     return "Arrancando el PC";
}
    @Override
    public double precioFinal(){
        double precioFinal=0;
        if(incluyeMonitor==true){
            precioFinal=precio+100;
        }
        else{
            precioFinal=precio;
        }
        return precioFinal;
                }
    @Override
    public String toString() {
        return "PC{" + "Marca=" + marca + "\nModelo=" + modelo + "\nRam=" + ram
+ "\nProcesador=" + procesador + "\nPrecio=" + precio +"\npotenciaFuente=" + potenciaFuente + "\ntipoFormato=" + tipoFormato +"\nDispone de monitor="+(this.incluyeMonitor?"Si":"No");
    }
      
}
