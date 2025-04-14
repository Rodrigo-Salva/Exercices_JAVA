package Ejercicio7;

public class empleadoOficina extends Empleados {

    public empleadoOficina(String nombre, double salarioBase, int horasExtras) {
        super(nombre, salarioBase, horasExtras);
    }
    //Metodo
    public void calcularSalario(){
         double total = salarioBase + (horasExtras * 20);
        System.out.println("EL salario base es de " + salarioBase + " y con todo por las horas extras es: " + total);
    }
}
