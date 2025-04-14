package org.rsalva.genericsclass;

public class Animal {
    private String nombre;
    private tipoCaballo tipo;

    public Animal(String nombre, tipoCaballo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public tipoCaballo getTipo() {
        return tipo;
    }
}
