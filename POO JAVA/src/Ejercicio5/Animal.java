package Ejercicio5;

public class Animal {
     private String nombre;

     //Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    //get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo hacer sonido

    public void hacerSonido(){
        System.out.println("Este animal hace un sonido");
    }
}
