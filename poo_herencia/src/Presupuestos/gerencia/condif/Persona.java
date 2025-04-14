package Presupuestos.gerencia.condif;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", numeroFiscal: '" + numeroFiscal + '\'' +
                ", direccion: '" + direccion + '\'';
    }
}
