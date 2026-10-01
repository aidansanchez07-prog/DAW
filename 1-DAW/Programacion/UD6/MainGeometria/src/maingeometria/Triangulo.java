package maingeometria;

/**
 *
 * @author aidan
 */
public class Triangulo implements Geometria{
    double base, altura;

    public Triangulo(double base, double altura) {
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
        return (base*altura)/2;
    }
    @Override
    public double perimetro(){
        return 1;
    }
}
