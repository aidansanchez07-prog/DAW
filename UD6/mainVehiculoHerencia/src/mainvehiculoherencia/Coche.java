package mainvehiculoherencia;

/**
 *
 * @author aidan
 */
public class Coche extends Vehiculo {
    private String tipoVehiculo="Turismo";
    private int numeroPuertas;

    public Coche() {
    }
    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
       
    }
    public Coche(String marca, String modelo, int numeroPuertas, String tipoVehiculo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.tipoVehiculo=tipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void imprimir(){
        System.out.println("Tipo vehiculo: "+tipoVehiculo);
    }
    @Override
    public void arrancar(){
        super.arrancar();
        System.out.println("Estamos arrancando el coche");
    }
    @Override
    public void detener(){
        super.detener();
        System.out.println("Se esta deteniendo el coche");
    }
    public String obtenerTipoVehiculo(){
        return"Vehiculo: "+super.tipoVehiculo+"\nTipo vehiculo: "+this.tipoVehiculo;
    }

    @Override
    public String toString() {
        return "-- Coche --" +super.toString()+"\nTipoVehiculo: " + tipoVehiculo + "\n NumeroPuertas: " + numeroPuertas;
    }
    
}
