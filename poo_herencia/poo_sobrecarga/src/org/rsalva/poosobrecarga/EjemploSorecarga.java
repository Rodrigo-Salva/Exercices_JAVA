package org.rsalva.poosobrecarga;
import static org.rsalva.poosobrecarga.Calculadora.*;
public class EjemploSorecarga {
    public static void main(String[] args) {

        System.out.println("Sumar enteros: " + sumar(10, 5));
        System.out.println("Sumar enteros: " + sumar(10.0f, 5f));
        System.out.println("Sumar float-int: " + sumar(10, 5.0 ));
        System.out.println("Sumar int-float: " + sumar(10, 5.0));
        System.out.println("Suma Double: "+ sumar(10D, 5D));//D por el punto de separacion de los decimales
        System.out.println("Sumar String: " + sumar("10", "5"));
        System.out.println("Sumar tres int: " + sumar(10, 5, 3));
        System.out.println("Sumar 6 int: " + sumar(10, 5, 3, 4, 10,6));
        System.out.println("Sumar float + n int: " + sumar(10.5f, 5,9,15));
        System.out.println("Sumar 3 double: " + sumar(10.0,2.0,5.3,5.3));

        System.out.println("Suma long: "+  sumar(10, 5));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("SUmar float-int " + sumar(10f, '@'));
    }
}
