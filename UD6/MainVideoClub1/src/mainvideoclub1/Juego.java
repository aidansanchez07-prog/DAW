package mainvideoclub1;

/**
 *
 * @author aidan
 */
public class Juego extends Elemento {
    private boolean esFisico;

    public Juego(boolean esFisico, String codigo, String nombre, double precioBase) {
        super(codigo, nombre, precioBase);
        this.esFisico = esFisico;
    }

    public boolean isEsFisico() {
        return esFisico;
    }

    public void setEsFisico(boolean esFisico) {
        this.esFisico = esFisico;
    }
    
    
    
    @Override
     public double getPrecioFinal(){
         //sumamos a precio base el margen de beneficio
         return (precioBase*1.4);
     }
     @Override
 public int getGarantia(){
     //Importe para contratar la garantia extendida del producto
     return (int)(getPrecioFinal()*0.2);
        
         }

    @Override
    public String toString() {
        return "Juego\n" +super.toString()+ "\nEs Fisico?: " + (esFisico?"Sí":"No");
    }
 
}
