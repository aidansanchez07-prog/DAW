package mainvideoclub1;

/**
 *
 * @author aidan
 */
public class Articulos extends Elemento {
    private Tipo tipo;

    public Articulos(Tipo tipo, String codigo, String nombre, double precioBase) {
        super(codigo, nombre, precioBase);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
     @Override
     public double getPrecioFinal(){
         //sumamos a precio base el margen de beneficio
         return (precioBase*1.3);
     }
     @Override
 public int getGarantia(){
     //Importe para contratar la garantia extendida del producto
     return (int)(getPrecioFinal()*0.15);
        
         }

    @Override
    public String toString() {
        return "Articulos\n"+super.toString() + "\nTipo: " + tipo ;
    }
 
}
