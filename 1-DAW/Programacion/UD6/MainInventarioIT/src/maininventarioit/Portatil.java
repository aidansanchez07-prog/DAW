package maininventarioit;

/**
 *
 * @author aidan
 */
public class Portatil extends Ordenador {
    private double peso;
    private int autonomiaBateria;
    private  boolean garantia;
    public Portatil() {
    }

    public Portatil(double peso, int autonomiaBateria, String marca, String modelo, int ram, String procesador, double precio, boolean garantia) {
        super(marca, modelo, ram, procesador, precio);
        this.peso = peso;
        this.autonomiaBateria = autonomiaBateria;
        this.garantia=garantia;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
    // cómo modificamos un atributo que heredamos de la clase padre.
// opción 1. Usemos directamente el atributo heredado
public void ampliarRam(int ramQueAmplio){
    this.ram=this.ram+ramQueAmplio;
    
}
//opcion 2. Recomendada porque al usar setter o metodos de la clase padre estoy utilizando correctamente la encapsulacion
public void establecerRam(int ramQueInstalo){
    this.setRam(ramQueInstalo);
    
}
//opcion 3. Utilizamos la llamada super para acceder al padre.
public void establecerRam2(int ramQueInstalo){
    super.ram=ramQueInstalo;
    
}
@Override
  public String arrancandoEquipoOpcion1(){
        return "Arrancando el Portatil";
    }
    @Override
    public  String tipoOrdenador(){
            return "Soy un portatil. Marca:"+this.marca+", modelo: "+this.modelo;
}
    @Override
    public  String arrancandoEquipo(){
     return "Arrancando el Portatil";
}
    @Override
    public double precioFinal(){
        //Si tiene garantia +50
        double precioFinal=0;
//        if(garantia==true){
//            precioFinal=precio+50;
//        }else{
//            precioFinal=precio;
//        }
        precioFinal=(garantia? (precio+50):precio);
        return precioFinal;
    }
    @Override
    public String toString() {
      return "Portatil\n" +
"Marca=" + marca + "\nModelo=" + modelo + "\nRam=" + ram
+ "\nProcesador=" + procesador + "\nPrecio=" + precio +
"\nPeso=" + peso + "nAutonomia bateria=" + autonomiaBateria +"\nGarantia="+ (garantia? "Si":"No");
    }



}
