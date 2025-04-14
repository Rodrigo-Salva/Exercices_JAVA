package org.org.rsalva.ejemplo;

import org.rsalva.pooherencia.Alumno;
import org.rsalva.pooherencia.AlumnoInternacional;
import org.rsalva.pooherencia.Persona;
import org.rsalva.pooherencia.Profesor;

public class ejemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("==========Creando la instancia de la clase Alumno==========");
        Alumno alumno = new Alumno("Rodrigo", "Salva", 13, "Intituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("rodrigo@correo.com");

        System.out.println("==========Creando la instancia de la clase Alumno Internacional==========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Instituto nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);
        alumnoInternacional.setEmail("peter@correo.com");

        System.out.println("==========Creando la instancia de la clase Profesor==========");
        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("profesot.luci@colegio.com");


        System.out.println("========== - =========");
        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("===========================================");
        System.out.println(persona);
    }
}
