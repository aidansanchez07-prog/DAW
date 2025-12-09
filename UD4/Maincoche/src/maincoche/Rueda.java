package maincoche;

/**
 *
 * @author aidan
 */
public class Rueda {
    //private int numRuedas=0;
    private String diametro;
    public Rueda(String diametro){
        this.diametro=diametro;
    }
    public void girar(){
        System.out.println("Las ruedas "+this.diametro+" estan girando");
    }
    public String getDiametro(){
        return this.diametro;
    }
    public void setDiametro(){
        this.diametro=diametro;
    }
    @Override
    public String toString(){
        return "El diametro de las ruedas es: "+this.diametro;
    }
}
