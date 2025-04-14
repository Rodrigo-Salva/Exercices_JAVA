package org.rsalva.poointerfaces.repositorio.lista;
import org.rsalva.poointerfaces.modelo.Cliente;
import org.rsalva.poointerfaces.repositorio.*;
import org.rsalva.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.*;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente c =  this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }


    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {//Funcion lamba
                int resultado = 0;
                if (dir == Direccion.ASC){
                    resultado = ordenar(campo, a, b);
                } else if (dir == Direccion.DES) {
                    resultado =  ordenar(campo, b, a);
                }
                return resultado;

        });
        return listaOrdenada;
    }

    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}
