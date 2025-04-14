package org.rsalva.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        //Los set siempre son unicos, no aceptan elementos duplicados
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("Uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println("ts = " + ts);
        Set<Integer> number = new TreeSet<>(Comparator.reverseOrder());
        //Se ordenan aunque esten desordenados
        number.add(1);
        number.add(5);
        number.add(4);
        number.add(3);
        number.add(2);
        number.add(10);

        System.out.println("number = " + number);

    }
}
