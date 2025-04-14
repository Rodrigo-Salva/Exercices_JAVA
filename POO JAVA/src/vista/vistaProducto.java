package vista;

import datos.Producto;

import javax.swing.*;

public class vistaProducto {
    public static void main(String[] args) {
        String product, codigo, tem;
        int cantidad;
        double precio, igv, subtotal, total;

        Producto producto = new Producto();
        codigo = JOptionPane.showInputDialog("El codigo del producto");
        product = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        tem = JOptionPane.showInputDialog("Ingrese la cantidad a llevar");
        cantidad = Integer.parseInt(tem);
        tem = JOptionPane.showInputDialog("Ingrese el precio del producto");
        precio = Double.parseDouble(tem);

        producto.codigo = codigo;
        producto.nombre = product;
        producto.cantidad = cantidad;
        producto.precio = precio;

        subtotal = producto.calcular();
        igv = producto.calcular(subtotal);
        total = producto.calcular(subtotal, igv);

        JOptionPane.showMessageDialog(null,
                "====Bienvendo al sistema de ventas de producto=====" +
                "\nCodigo: " + producto.codigo +
                "\nProducto: " + producto.nombre +
                "\nCantidad: " + producto.cantidad +
                "\nPrecio: " + producto.precio +
                "\nSubtotal: " + subtotal +
                "\nIGV: " + igv +
                "\nTotal: " + total);
    }
}
