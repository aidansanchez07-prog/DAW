package maininventarioit;

/**
 *
 * @author aidan
 */
public abstract class Ordenador {
    protected String marca;
    protected String modelo;
    protected int ram;
    protected String procesador;
    protected double precio;

    public Ordenador() {
    }

    public Ordenador(String marca, String modelo, int ram, String procesador, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.procesador = procesador;
        this.precio = precio;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", procesador=" + procesador + ", precio=" + precio + '}';
    }
    public String arrancandoEquipoOpcion1(){
        return "Arrancando el ordenador";
    }
    public abstract String tipoOrdenador();
    public abstract String arrancandoEquipo();
    public abstract double precioFinal();
}
