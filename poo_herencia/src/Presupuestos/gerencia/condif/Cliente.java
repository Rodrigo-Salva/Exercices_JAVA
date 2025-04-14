package Presupuestos.gerencia.condif;

public class Cliente extends Persona{
    private int clienteId;
    private static int incrento;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++incrento;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String
    toString() {
        return "id: "  + clienteId + super.toString();
    }
}
