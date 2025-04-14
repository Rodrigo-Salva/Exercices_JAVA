package Presupuestos.gerencia.condif;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleaadoOld;

    public Empleado(){
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion){
        super(nombre, apellido, numeroFiscal, direccion);
    }

    public Empleado(double remuneracion, int empleaadoOld, String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleaadoOld = empleaadoOld;
    }

    public Empleado(double remuneracion, int empleaadoOld){
        this.remuneracion = remuneracion;
        this.empleaadoOld = empleaadoOld;
    }


    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleaadoOld() {
        return empleaadoOld;
    }

    //Metodo para poder calcular el aumento de remuneracion
    public double aumentarRemuneracion(int porcentaje){
        porcentaje = (int)remuneracion + ((int)(this.remuneracion * porcentaje));
        System.out.println("La remuneracion es: " + porcentaje);
        return porcentaje;
    }

    @Override
    public String toString() {
        return super.toString() + "remuneracion: " + remuneracion +
                "empleaadoOld:  " + empleaadoOld;
    }
}
