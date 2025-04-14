package org.rsalva.poointerfaces;
import org.rsalva.poointerfaces.modelo.Producto;
import org.rsalva.poointerfaces.repositorio.*;
import org.rsalva.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.rsalva.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.rsalva.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        try {

            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
            repo.crear(new Producto("mesa", 50));
            repo.crear(new Producto("silla", 18));
            repo.crear(new Producto("lampara", 15.5));
            repo.crear(new Producto("notebook", 400.89));

            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);//Funcion lamba

            System.out.println("=============== paginable =============");
            List<Producto> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("==== ordenar ====");
            List<Producto> ProductoOrdenAsc = repo
                    .listar("apellido", Direccion.DES);
            ProductoOrdenAsc.forEach(System.out::println);

            System.out.println("==== editar ====");
            Producto ProductoActualizar = new Producto("silla", 19);
            ProductoActualizar.setId(2);
            repo.editar(ProductoActualizar);
            Producto Product = repo.porId(2);
            System.out.println(Product);
            System.out.println("=======");
            repo.listar("nombre", Direccion.ASC)
                    .forEach(System.out::println);

            System.out.println("===== borrar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("=====total=====");
            System.out.println("Total registros: " + repo.total());
        }catch (LecturaAccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (AccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
