package org.rsalva.poointerfaces.repositorio.lista;
import org.rsalva.poointerfaces.modelo.Producto;
import org.rsalva.poointerfaces.repositorio.*;
import org.rsalva.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.*;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {
    @Override
    public void editar(Producto producto) throws LecturaAccesoDatoException {
        Producto p =  porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }


    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
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

    public static int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
