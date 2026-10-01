package maingeometria;

/**
 *
 * @author aidan
 */
public class Rectangulo implements Geometria {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return this.base*this.altura;
    }
    @Override
    public double perimetro(){
        return (base*altura)*2;
    }
}
