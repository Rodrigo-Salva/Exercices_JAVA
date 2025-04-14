package org.rsalva.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{
    //Atributos privados de la clase informe
    private Persona autor;
    private Persona revisor;


    //Contructor de la clase padre
    public Informe(Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    //Metodo abstracto de la clase padre
    @Override
    public String imprimir() {
        return "Informa escrito por: " + autor
                + " Revisado por: " + revisor
                + "\n" + this.contenido;//Esta parte viene de la clase padre que es su atributo
                // conpartido por las clases hij@s
    }
}
