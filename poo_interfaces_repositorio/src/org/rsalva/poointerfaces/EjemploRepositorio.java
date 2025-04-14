package org.rsalva.poointerfaces;
import org.rsalva.poointerfaces.modelo.Cliente;
import org.rsalva.poointerfaces.repositorio.*;
import org.rsalva.poointerfaces.repositorio.excepciones.*;
import org.rsalva.poointerfaces.repositorio.lista.ClienteListRepositorio;
import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzales"));
            repo.crear(new Cliente("Luci", "Martinez"));
            Cliente andres = new Cliente("Andres", "Guzman");
            repo.crear(andres);
            repo.crear(andres);

            //repo.crear(null);
            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);//Funcion lamba

            System.out.println("=============== paginable =============");
            List<Cliente> paginable = repo.listar(0, 3);
            paginable.forEach(System.out::println);

            System.out.println("==== ordenar ====");
            List<Cliente> clientesOrdenAsc = repo
                    .listar("apellido", Direccion.DES);
            clientesOrdenAsc.forEach(System.out::println);

            System.out.println("==== editar ====");
            Cliente beaActualizar = new Cliente("Bea", "Salva");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(2);
            System.out.println(bea);
            System.out.println("=======");
            repo.listar("nombre", Direccion.ASC)
                    .forEach(System.out::println);

            System.out.println("===== borrar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("=====total=====");
            System.out.println("Total registros: " + repo.total());

        }catch (RegistroDuplicadoAccesoDatoException e){
            System.out.println("Registro D uplicado: " + e.getMessage());
            e.printStackTrace();
        }
        catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e){
            System.out.println("Generica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
