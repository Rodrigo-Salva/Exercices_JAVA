package Ejercicio5;

public class Gato extends Animal {

    //Constructor
    public Gato(String nombre) {
        super(nombre);
    }

    //Metodo
    @Override
    public void hacerSonido(){
        System.out.println("Miau");
    }
}
