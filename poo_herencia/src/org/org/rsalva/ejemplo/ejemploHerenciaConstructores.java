package org.org.rsalva.ejemplo;

import org.rsalva.pooherencia.*;

public class ejemploHerenciaConstructores {
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
        System.out.println("Inprimiendo datos en comun del tipo Persona: ");
        System.out.println("nombre: " + persona.getNombre() + ", apellido: " +
                persona.getApellido() + ", edad: " +
                persona.getEdad() + ", email: " +
                persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo alumno: ");
            System.out.println("Intitucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Notas Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Notas Casstellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo alumno Internacional: ");
                System.out.println("Nota Idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("==================Sobre escritura promedio===================");
            System.out.println("Promedio: " +  ((Alumno) persona).calcularPromedio());
        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo lso datos del tipo profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("====================Sobre escritura Saludar=======================");

        System.out.println(persona.saludar());

        System.out.println("===========================================");
    }
}
