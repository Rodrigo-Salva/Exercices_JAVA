package org.rsalva.pooclasesabstractas.form.validador;

public class NoNueloValidador extends Validador{
    protected String mensaje = "el campo %s no puede ser nulo";

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
        return (valor != null);//Si se cumple a a votar true y si no false
    }
}
