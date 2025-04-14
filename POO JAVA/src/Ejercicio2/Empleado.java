package Ejercicio2;

public class Empleado extends Persona {
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarSalario(){
        super.saludar();
        System.out.println("Mi salario es: " + getSalario());
    }
}
