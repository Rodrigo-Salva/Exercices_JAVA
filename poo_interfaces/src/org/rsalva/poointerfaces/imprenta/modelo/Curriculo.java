package org.rsalva.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{
    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();//Inicializando la lista de experiencias
    }

    public Curriculo addExperiencias(String ex){
        this.experiencias.add(ex);//Aqui agregamos con el metodo add las experiencias en la varible ex
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for (String exp: this.experiencias){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
