package Ejercicio6;

public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //metodo

    public void calcularArea(double areaCirculo){
        System.out.println("No hay area definida");
    }
}
