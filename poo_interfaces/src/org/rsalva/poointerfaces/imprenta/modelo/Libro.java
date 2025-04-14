package org.rsalva.poointerfaces.imprenta.modelo;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();//Muchas veces si no importamos el arrayList no va a votar un error
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    //Metodo imprimir
    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo");
        sb.append("\n" + this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");

        for (Imprimible pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
