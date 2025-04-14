package Presupuestos.gerencia.condif;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(){
    }

    public Gerente(double presupuesto,double remuneracion, int empleaadoOld) {
        super(remuneracion, empleaadoOld);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return " wpresupuesto: " + presupuesto;
    }
}
