package org.rsalva.pooexcepciones.ejemplo;

public class Calculadora {
     public double dividir(int numerador, int divisor) {
         if (divisor == 0) {
             throw new DivisionPorZeroException("No se puede dividir por cero!");
         }
         return numerador/(double)divisor;
     }

     public double dividi(String numerador, String divisor)
             throws DivisionPorZeroException, FomatoNumeroException{
         try{
             int num = Integer.parseInt(numerador);
             int div = Integer.parseInt(divisor);
             return this.dividir(num, div);

         }catch (NumberFormatException e){
             throw new FomatoNumeroException("debe de ingresarun numero en el numerador y divisor");
         }
     }
}
