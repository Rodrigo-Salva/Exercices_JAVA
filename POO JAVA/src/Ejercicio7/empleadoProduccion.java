package Ejercicio7;

public class empleadoProduccion extends Empleados {

    public empleadoProduccion(String nombre, double salarioBase, int horasExtras) {
        super(nombre, salarioBase, horasExtras);
    }

    //Metodo
    public void calcularSalario(){
       double total = salarioBase + (horasExtras * 15);
        System.out.println("EL salario base es de " + salarioBase + " y con todo por las horas extras es: " + total);
    }
}
