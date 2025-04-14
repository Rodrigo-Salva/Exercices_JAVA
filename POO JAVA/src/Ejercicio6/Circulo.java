package Ejercicio6;

public class Circulo extends Figura {
    protected Double radio;

    public Circulo(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    double pi = 3.14;

    @Override
    public void calcularArea(double radio) {
        double area = Math.sqrt(radio * radio) * pi;
        System.out.println("El area del circulo es: " + area);
    }

}
