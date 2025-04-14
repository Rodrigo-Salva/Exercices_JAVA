package org.rsalva.pooexcepciones.ejemplo;

public class DivisionPorZeroException extends RuntimeException{
    public DivisionPorZeroException(String mensaje){
        super(mensaje);
    }
}
