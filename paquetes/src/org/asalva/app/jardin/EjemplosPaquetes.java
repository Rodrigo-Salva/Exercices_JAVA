package org.asalva.app.jardin;

import org.asalva.app.hogar.*;
import static org.asalva.app.hogar.Persona.saludar;//En este apartado estamos importanto un metodo estatico
import static org.asalva.app.hogar.Persona.*;
import static  org.asalva.app.hogar.ColorPelo.*;//Para poder utilizar el enum

public class EjemplosPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Andres");
        persona.setColorPelo(CAFE);
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";


        String juegando = perro.jugar(persona);//Aqui estamos haciendo que los objetos interactuan
        System.out.println(juegando);
        String saludo = saludar();//Aqui estamos llamando el metodo estatatico
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }
}
