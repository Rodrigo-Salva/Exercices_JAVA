package Ejercicio5;

public class Vista {
    public static void main(String[] args) {
        Animal animal[] = new Animal[3];
        animal[0] = new Animal("");
        animal[1] = new Gato("");
        animal[2] = new Perro("");

        for (int i = 0; i < animal.length; i++) {
            animal[i].hacerSonido();
        }
    }
}
