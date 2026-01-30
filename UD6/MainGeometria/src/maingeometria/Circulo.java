package maingeometria;

/**
 *
 * @author aidan
 */
public class Circulo implements Geometria {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double area(){
        return pi*radio*radio;
    }
    @Override
    public double perimetro(){
        return 2*pi*radio;
    }
}
