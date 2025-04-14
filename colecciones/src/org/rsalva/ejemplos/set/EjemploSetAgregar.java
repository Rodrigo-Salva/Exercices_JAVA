package org.rsalva.ejemplos.set;

import java.util.Set;
import java.util.HashSet;

public class EjemploSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);


        //No va agregar los datos repetidos
        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados = "  + b);//Recordar que un set no permite elementos duplicados
        System.out.println(hs);

    }
}
