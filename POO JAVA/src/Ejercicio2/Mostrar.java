package Ejercicio2;

public class Mostrar {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Rodrigo", 18, 1500);
        empleado.setSalario(1200);
        empleado.setEdad(19);
        empleado.setNombre("Daniel");
        empleado.mostrarSalario();

        System.out.println("------------------------------");
        Empleado empleado1 = new Empleado("Rodrigo", 18, 1500);
        empleado1.mostrarSalario();
    }
}
