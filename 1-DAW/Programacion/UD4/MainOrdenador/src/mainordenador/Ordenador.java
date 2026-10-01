package mainordenador;

/**
 *
 * @author aidan
 */
public class Ordenador {
    private String marca;
    private String modelo;
    private String procesador;
    private int RAM;
    private double precio;
    private boolean portatil;
    private int IDinventario;
    public Ordenador(){
    }
    public Ordenador(String marca, String modelo, String procesador, int RAM, double precio, boolean portatil, int IDinventario){
        this.modelo=modelo;
        this.marca=marca;
        this.procesador=procesador;
        this.RAM=RAM;
        this.precio=precio;
        this.portatil=portatil;
        this.IDinventario=IDinventario;
    }
    
    public void setMarca (String marca){
        this.marca=marca;
        
    }
    public String getMarca (String marca){
        return this.marca;
    
    }
    public void setModelo (String modelo){
        this.modelo=modelo;
        
    }
    public String getModelo (String modelo){
        return this.modelo;
    
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
 public int getIDinventario() {
        return IDinventario;
    }

    public void setIDinventario(int IDinventario) {
        this.IDinventario = IDinventario;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }
    public boolean portatil(String opcionP){
        if(opcionP.equals("si")){
            return true;
        }
        else if(opcionP.equals("no")){
            return false;
        }
        else{
            return false;
        }
    }
   @Override
   public String toString(){
       if(this.portatil==true){
           return "Ordenador[Id="+IDinventario+"]"+" \nModelo: "+this.modelo+"\nMarca: "+this.marca+"\nRAM: "+this.RAM+"GB\n Procesador: "+this.procesador+"\nPrecio: "+this.precio+"€\nPortatil: Sí";
       }
       else{
           return "Este es mi ordenador: \nModelo: "+this.modelo+"\nMarca: "+this.marca+"\nRAM: "+this.RAM+"GB\n Procesador: "+this.procesador+"\nPrecio: "+this.precio+"€\nPortatil: Sí";
       }
       
   }
    

}
