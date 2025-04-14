package org.rsalva.poointerfaces.imprenta;
import org.rsalva.poointerfaces.imprenta.modelo.*;
import static org.rsalva.poointerfaces.imprenta.modelo.Genero.*;
import static org.rsalva.poointerfaces.imprenta.modelo.Imprimible.*;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe")
                , "Ingeniero de Sistemas", "Resumen laboral....");
        cv.addExperiencias("Java")
        .addExperiencias("Oracle DBA")
        .addExperiencias("Spring Framework")
        .addExperiencias("Desarrollador fullstack")
        .addExperiencias("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma")
                ,"Patrones de diseños: elem. Reusables POO"
                ,PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe (new Persona("Martin", "Fowler")
                ,new Persona("James", "Gosling"),
                "Estudio sobre microservicios");
        imprimi(cv);
        imprimi(informe);
        imprimi(libro);

        //Imprimible objImp
        imprimi(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto de una clase anonima!";//Renombrando la el
                // metodo de la interfas y no se
             }
        });

        System.out.println(TEXTO_DEFECTO);
    }
}
