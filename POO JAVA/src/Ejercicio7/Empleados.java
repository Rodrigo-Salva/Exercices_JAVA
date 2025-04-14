package Ejercicio7;

public class Empleados {
    protected String nombre;
    protected double salarioBase;
    protected int horasExtras;

    public Empleados(String nombre, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    //Metodo

    public void calcularSalario(){
        salarioBase = 2000;
    }
}
