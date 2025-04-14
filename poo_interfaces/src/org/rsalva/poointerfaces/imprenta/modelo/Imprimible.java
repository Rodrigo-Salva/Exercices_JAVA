package org.rsalva.poointerfaces.imprenta.modelo;

public interface Imprimible {

    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

     default String imprimir(){
         return TEXTO_DEFECTO;
     } //Esta en default

     static void imprimi(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
