package mainvideoclub1;

/**
 *
 * @author aidan
 */
public abstract class Elemento {
 protected  String codigo;
 protected String nombre;
 protected double precioBase;

    public Elemento(String codigo, String nombre, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
 public abstract double getPrecioFinal();
 public abstract int getGarantia();

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nNombre: " + nombre + "\nPrecio Base: " + precioBase;
    }
 
 
}
