package maincoche;

/**
 *
 * @author aidan
 */
public class Motor {
     private int potencia;
     private boolean encendido;
     
     public Motor(int potencia, boolean encendido){
         this.potencia=potencia;
         this.encendido=encendido;
     }
     public Motor(int potencia){
         this.potencia=potencia;
         this.encendido=false;
     }
     public int getPotencia(){
         return this.potencia;
     }
     public void setPotencia(){
         this.potencia=potencia;
     }
     public boolean getEncendido(){
         return this.encendido;
     }
     public void setEncendido(){
         this.encendido=encendido;
     }
     public void encenderMotor(){
         System.out.println("Arrancando motor");
         this.encendido=true;
     }
     public void apagarMotor(){
         System.out.println("Paramos motor");
          this.encendido=false;
     }
     @Override
    public String toString(){
         if(this.encendido==true){
             return "Potencia: "+this.potencia+"\n Esta encendido?: Sí";
         }
         else{
             return "Potencia: "+this.potencia+"\nEsta encendido?: No";
         }
    }

}
