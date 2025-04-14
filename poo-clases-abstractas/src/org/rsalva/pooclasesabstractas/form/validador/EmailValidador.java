package org.rsalva.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{
    protected String mensaje = "el campo %s tiene un formato del email es invalido";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";//patrones para poder validar el correo
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }


    @Override
    public boolean esValido(String valor) {
           return valor.matches(EMAIL_REGEX);//Esta parte es para el validador de correo con matches
    }
}
