package Ejercicio6;

import java.util.Scanner;

public class Vista {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Bienvenido a este sistema");
        System.out.println("Ingrese su nombre");
        String nombre = consola.nextLine();
        Figura figura = new Figura(nombre);
        Figura figura1 = new Circulo("NOmbre", 2.2);
        Figura figura2 = new Rectangulo("Nuevo", 2.2, 3);

        int opcion;
        do {
            System.out.println("""
                    Ingrese lo que desea calcular
                    1. Area del circulo
                    2. Area del rectangulo
                    3. salir""");
            opcion = consola.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese para calcular el area del circulo: ");
                    double radio = consola.nextDouble();
                    figura1.calcularArea(radio);
                    break;

                case 2:
                    System.out.println("Ingrese la base: ");
                    double base = consola.nextDouble();
                    figura2.calcularArea(base);
                    System.out.println("Ingrese la altura: ");
                    double altura = consola.nextDouble();
                    figura2.calcularArea(altura);
                    break;

                case 3:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion incoreccta");
            }
        }
        while (opcion != 3);
    }
}
