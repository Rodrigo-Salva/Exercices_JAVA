package Presupuestos.gerencia.ejemplo;

import Presupuestos.gerencia.condif.*;

public class EjemploSistema {
    public static void main(String[] args) {

        System.out.println("-------Cliente-------");
        Cliente cliente = new Cliente("Rodrigo", "Salva", "13", "Mz lt23");
        System.out.println(cliente.getClienteId());

        System.out.println("------Empleado--------");
        Empleado empleado = new Empleado(3300, 23, "Daniel", "De la cruz", "30", "Mz c");
        empleado.aumentarRemuneracion(3);

        System.out.println("-------Gerente-------");
        Gerente gerente = new Gerente(30000, 200, 22);
        gerente.setPresupuesto(30000);

        System.out.println("========== - =========");

        impr(cliente);
        impr(empleado);
        impr(gerente);
    }

    public static void impr(Persona persona) {
        System.out.println("===========================================");
        if(persona != null){
            System.out.println(persona);
        }
    }
}
