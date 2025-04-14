package Polimorfismo;

public class Vehiculo {
    protected String Matricula;
    protected String Marca;
    protected String Modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        Matricula = matricula;
        Marca = marca;
        Modelo = modelo;
    }

    //Getter and setter


    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void mostrarDatos(){
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+ getModelo());
    }
}
