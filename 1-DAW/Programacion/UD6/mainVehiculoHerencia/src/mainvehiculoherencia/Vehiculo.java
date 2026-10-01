package mainvehiculoherencia;

/**
 *
 * @author aidan
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String tipoVehiculo="Terrestre";
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void imprimir(){
        System.out.println("Tipo vehiculo: "+tipoVehiculo);
    }
    public void arrancar(){
        System.out.println("Estamos arrancando el vehiculo");
    }
    public void detener(){
        System.out.println("Se esta deteniendo el vehiculo");
    }
    // clonar
    public Vehiculo ClonarVehiculo(String marca, String modelo){
        return new Vehiculo(marca, modelo);
        // equivalente a: return new Vehiculo(marca, modelo);
    }
    
    @Override
    public String toString() {
        return "\nVehiculo: " +tipoVehiculo+ "\nMarca: " + marca + "\nModelo: " + modelo  ;
    }
    
}
