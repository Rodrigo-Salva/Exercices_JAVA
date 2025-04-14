package Ejercicio3;

public class Muestra {
    public static void main(String[] args) {
        Vehiculo vehiculo[] = new Vehiculo[3];
        vehiculo[0] = new Cochee();
        vehiculo[1] = new Bicicleta();
        vehiculo[2] = new Vehiculo();

        for (int i = 0; i < vehiculo.length; i++) {
            vehiculo[i].describir();
        }
    }
}
