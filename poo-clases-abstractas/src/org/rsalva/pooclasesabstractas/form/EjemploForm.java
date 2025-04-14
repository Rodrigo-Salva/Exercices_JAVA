package org.rsalva.pooclasesabstractas.form;
import org.rsalva.pooclasesabstractas.form.elementos.*;
import org.rsalva.pooclasesabstractas.form.elementos.select.Opcion;
import org.rsalva.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;


public class EjemploForm {
    public static void main(String[] args) {

        //para el username
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        //para el password
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));//Rango maximo de caracteres para poner la contraseña

        //para el email
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        //para el lenguaje dando validaciones
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNueloValidador());

        lenguaje.addOpcion(new Opcion("1", "Java"))
                .addOpcion(new Opcion("2", "Python").setSelected())
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name= '" + this.nombre + "' value= \"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal este campo esta desabilitado");
        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com ");
        edad.setValor("28");
        experiencia.setValor("....mas de 10 años de experiencia ....");

        List<ElementoForm> elementos = Arrays.asList(
                username,
                password,
                email,
                experiencia,
                lenguaje,
                saludar);

        /*for (ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }*/

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if (!e.esValido()) {
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
