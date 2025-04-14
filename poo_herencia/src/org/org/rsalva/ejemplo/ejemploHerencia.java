package org.org.rsalva.ejemplo;
import org.rsalva.pooherencia.*;

public class ejemploHerencia {
    public static void main(String[] args) {

        System.out.println("==========Creando la instancia de la clase Alumno==========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Rodrigo");
        alumno.setApellido("Salva");
        alumno.setInstitucion("Intituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("==========Creando la instancia de la clase Alumno Internacional==========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Instituto nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        System.out.println("==========Creando la instancia de la clase Profesor==========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");


        System.out.println("========== - =========");
        System.out.println(alumnoInternacional.getNombre() + " " +
                alumnoInternacional.getApellido() + " " +
                alumnoInternacional.getInstitucion() + " " +
                alumnoInternacional.getPais());

        System.out.println("Alumno: "+ alumno.getNombre() + " " + alumno.getApellido()
        + "\nLa institucion es: " + alumno.getInstitucion());

        System.out.println("Profesor: " + profesor.getNombre()
                + " " + profesor.getApellido()
                + "\nAsignatura: "  + profesor.getAsignatura());


        //Sirve para poder identificar la clase padre como la clase hija
        Class clase = alumnoInternacional.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();

            System.out.println(hija + " es un clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
