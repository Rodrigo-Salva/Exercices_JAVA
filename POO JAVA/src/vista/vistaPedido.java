package vista;
import datos.Pedido;
import javax.swing.*;

public class vistaPedido {
    public static void main(String[] args) {
        String codigo, producto, tempo;
        int cantidad;
        double precio, igv, total, subtotal;

        //Importando La clase pedidos al metodo para vistarlo
        Pedido pedido  = new Pedido();
        codigo = JOptionPane.showInputDialog("Ingrese el codigo");
        producto =  JOptionPane.showInputDialog("Ingrese producto");
        tempo = JOptionPane.showInputDialog("Ingrese la cantidad");
        cantidad = Integer.parseInt(tempo);
        tempo = JOptionPane.showInputDialog("Ingrese el precio");
        precio = Double.parseDouble(tempo);

        //remonbramos los atributos para ingresar en esta vista
        pedido.codigo = codigo;
        pedido.producto = producto;
        pedido.cantidad = cantidad;
        pedido.precio = precio;

        //llamamos a todos metodos hechos
        subtotal = pedido.calcular();
        igv = pedido.calcular(subtotal);
        total = pedido.calcular(subtotal, igv);


        //vistar cada uno de lo pedido
        JOptionPane.showMessageDialog(null,
                "----Este es la boleta----"+
                "\nCodigo: " + pedido.codigo +
                "\nProducto: " + pedido.producto +
                "\nCantidad: " + pedido.cantidad +
                "\nPrecio: " + pedido.precio +
                "\nSubtotal: " + subtotal +
                "\nIGV: " + igv +
                "\nTotal: " + total);
    }
}
