package org.rsalva.ejemplos.set;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Atun", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if(!unicos.add(pez)){
                //System.out.println("Elemento duplicado: " + pez);
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
