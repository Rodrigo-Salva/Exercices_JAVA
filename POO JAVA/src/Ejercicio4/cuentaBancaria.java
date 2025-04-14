package Ejercicio4;

public class cuentaBancaria {
    private String titular;
    private double saldo;

    public cuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        if(cantidad >0){
            saldo+= cantidad;
            System.out.println("Se han depositado " + cantidad + " y el saldo actual es de: " + saldo);
        }
    }

    public void retirar(double cantidad){
        if (cantidad >0 && cantidad <=  saldo){
            saldo-=cantidad;
            System.out.println("Se han retirado " + cantidad + " y el saldo actual es de: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficuente");
        }else {
            System.out.println("La cantidad a retirar debe ser mayor a 0");
        }
    }
}
