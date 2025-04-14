package vista;

import datos.Vehiculo;

import javax.swing.*;

public class vistaTotal {
    public static void main(String[] args) {
        String numeroPlaca, marca, tem;
        int cantidad;
        double precio, subtotal, igv, total;
        Vehiculo vehiculo = new Vehiculo();

        numeroPlaca = JOptionPane.showInputDialog("Ingrese el numero de placa");
        marca = JOptionPane.showInputDialog("Ingrese la marca");
        tem = JOptionPane.showInputDialog("Ingrese la cantidad");
        cantidad = Integer.parseInt(tem);
        tem = JOptionPane.showInputDialog("Ingrese el precio");
        precio = Double.parseDouble(tem);

        vehiculo.setNumeroPlaca(numeroPlaca);
        vehiculo.setMarca(marca);
        vehiculo.setCantidad(cantidad);
        vehiculo.setPrecio(precio);

        subtotal = vehiculo.calcularSubtotal();
        igv = vehiculo.calcularIGV();
        total = vehiculo.calcularTotal();
        JOptionPane.showMessageDialog(null,"----Bienvenido----" +
                "\nNumero de placa: " + vehiculo.getNumeroPlaca() +
                "\nMarca: " + vehiculo.getMarca() +
                "\nCantidad: " + vehiculo.getCantidad() +
                "\nPrecio: " + vehiculo.getPrecio() +
                "\nSubtotal: " + subtotal +
                "\nIGV: " + igv +
                "\nTotal: " + total);
    }
}
