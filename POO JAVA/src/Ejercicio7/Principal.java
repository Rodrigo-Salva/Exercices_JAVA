package Ejercicio7;

public class Principal {
    public static void main(String[] args) {
        Empleados empleados[] = new Empleados[2];

        empleados[0] = new empleadoOficina("Roberto", 1500, 2);
        empleados[1] = new empleadoProduccion("Jessica", 1500, 2);

        for (int i = 0; i < empleados.length; i++) {
            empleados[i].calcularSalario();
        }
    }
}
