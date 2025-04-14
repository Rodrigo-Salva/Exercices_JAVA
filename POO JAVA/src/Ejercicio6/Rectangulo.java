package Ejercicio6;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
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
    public void calcularArea(double areaCirculo){
      double area = Math.sqrt(this.base * altura);
        System.out.println("El area del rectangulo es: " + area);
    }
}
