package Datos;

import java.util.ArrayList;
import java.util.Collections;

public class numeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(15);
        numeros.add(20);

        Collections.sort(numeros);

        System.out.println("Números ordenados:");
        for (int numero:  numeros){
            System.out.println(numero);
        }
        int buscarNumero = 15;
        int pociion = numeros.indexOf(buscarNumero);

        if (pociion != -1) {
            System.out.println("\nEl número " + buscarNumero + " está en la posición: " + pociion);
        } else {
            System.out.println("\nEl número " + buscarNumero + " no está en la lista.");
        }

    }
}
