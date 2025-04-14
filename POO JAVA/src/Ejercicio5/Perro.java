package Ejercicio5;

public class Perro extends Animal {

    //  Constructor
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Guau, Guau");
    }
}
