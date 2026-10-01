package mainvehiculoherencia;

/**
 *
 * @author aidan
 */
public class Moto extends Vehiculo {
    private boolean tieneSidecar=false;
     private String tipoVehiculo="Motocicleta";
     private int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
     public Moto(int cilindrada, String marca, String modelo,boolean tieneSidecar, String tipoVehiculo) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoVehiculo=tipoVehiculo;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
@Override
    public void arrancar(){
        System.out.println("Estamos arrancando la moto");
    }
    @Override
    public void detener(){
        System.out.println("Se esta deteniendo la moto");
    }
    @Override
    public String toString() {
        return "-- Moto --" +super.toString()+ "\nTiene Sidecar?: " + (tieneSidecar? "Si":"No") + "\nTipo Vehiculo: " + tipoVehiculo + "\nCilindrada: " + cilindrada;
    }
     
}
