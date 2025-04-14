package Ejercicio4;
import java.util.Scanner;

public class Mostrar {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Bienvenido ");
        System.out.println("Ingrese el nombre del titular de la cuenta");
        String titular = consola.nextLine();
        cuentaBancaria cuentaBancaria = new cuentaBancaria(titular);

        int opcion;

        do {
            System.out.println("""
                    ---Menu---
                    1. Consultar salgo
                    2. Depositar dinero
                    3. Retirar dinero
                    4. Salir""");
            System.out.println("Seleccione una opcion: ");
            opcion = consola.nextInt();

            switch (opcion){
                case 1 :
                    System.out.println("Titular: " + cuentaBancaria.getTitular());
                    System.out.println("Saldo actual: " + cuentaBancaria.getSaldo());
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    double depositar = consola.nextDouble();
                    cuentaBancaria.depositar(depositar);
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double retiro = consola.nextDouble();
                    cuentaBancaria.retirar(retiro);
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema bancario");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente");
            }
        }
        while (opcion != 4);
    }
}
