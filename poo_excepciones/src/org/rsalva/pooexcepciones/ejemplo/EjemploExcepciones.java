package org.rsalva.pooexcepciones.ejemplo;

import javax.swing.*;


public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        try {
            double division2  = cal.dividi(numerador, denominador);
            System.out.println("division2 = " + division2);
        } /*catch (NumberFormatException nfe){
            System.out.println("Se detecto una excepcion: ingrese un valor numerico: " + nfe.getMessage());
            main(args);
        }*/catch (FomatoNumeroException e){
            System.out.println("Se detecto una excepcion: ingrese un numero valido: " + e.getMessage());
            e.printStackTrace(System.out);
        }
        catch (DivisionPorZeroException e){
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepcion o sin!");
        }
        System.out.println("Continumos con el flujoo de nuestra aplicacion!");
    }
}
