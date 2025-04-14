package org.rsalva.poointerfaces.modelo;

public class ClientePremiun extends Cliente implements Comparable{

    public ClientePremiun(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
