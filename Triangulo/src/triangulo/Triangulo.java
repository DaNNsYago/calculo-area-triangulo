package triangulo;

public class Triangulo {
    private float base;
    private float altura;
    private float area;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea() {
        this.area = (this.base*this.altura)/2;
    }
    


    
}
