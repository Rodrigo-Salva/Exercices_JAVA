package org.rsalva.generics;
import org.rsalva.poointerfaces.modelo.*;

import java.util.*;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> cliente= new ArrayList<>();
        cliente.add(new Cliente("Andres", "Guzman"));
        Cliente andres = cliente.get(0);//Cast para poder trabajar con clientes
        Cliente andres1 = cliente.iterator().next();//Cast para poder trabajar con clientes

        Cliente[] clientesArreglo = {new Cliente("Rodrigo", "Salva"),
                                     new Cliente("Andres", "Guzman") };

        Integer[] enterosArreglo = {1,2,3};

        List <Cliente> clienteLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clienteLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe",
        "Luci", "Bea", "John"}, enterosArreglo);

        nombres.forEach(System.out::println);

        System.out.println("===== Clientes premiun ===== ");
        List<ClientePremiun> clientesPremiunList = fromArrayToList(
                new ClientePremiun[]{new ClientePremiun("Luis ", "Salva")});

        clientesPremiunList.forEach(System.out::println);

        System.out.println("===== Clientes listas ===== ");
        imprimirClientes(cliente);
        imprimirClientes(clienteLista);
        imprimirClientes(clientesPremiunList);

        System.out.println("Maximo de 1, 9 y 4 es: " + maxima(1,9,4));
        System.out.println("Maximo de 3.9, 11.6, 7.78 es: " + maxima(3.9, 11.6, 7.78));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: "
                + maxima("zanahoria", "arandanos", "manzana"));
    }


    public static <T> List<T> fromArrayToList(T[] c){//Se llama metodo generico para que tambien este sea reutilizable
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);//Este de aqui va a aceptar cualquier tipo que sea pero de cliente
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){//Se llama metodo generico para que tambien este sea reutilizable
        for (G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);//En este metodo se agrega ?extends para poder implementar
        // metodos heredados
    }

    public static <T extends Comparable<T>> T maxima(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
