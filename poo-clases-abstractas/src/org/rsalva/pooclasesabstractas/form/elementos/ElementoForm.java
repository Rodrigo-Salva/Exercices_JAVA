package org.rsalva.pooclasesabstractas.form.elementos;
import org.rsalva.pooclasesabstractas.form.validador.*;
import org.rsalva.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;


    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();//para poder llamar al constructor vacio
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;//Se retorna this por que es el mismo de la clase ElementoForm
    }

    //Para poder visualizar los errores desde la clase principal en el metodo main
    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for (Validador validar: validadores){
            if (!validar.esValido(this.valor)){
                if (validar instanceof IMensajeFormateable){
                    this.errores.add(((IMensajeFormateable) validar).getMensajeFormateado(nombre));
                }else {
                    this.errores.add(String.format(validar.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();//En esta parte indicamos que si tiene errores va a retornal true y si no tiene va a ser false
    }

    abstract public String dibujarHtml();//Recordar que generalmente los metodos abstractos van al final
}
