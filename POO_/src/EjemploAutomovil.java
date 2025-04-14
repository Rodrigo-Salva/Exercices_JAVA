import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissa = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));

        Automovil nissa2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();

        System.out.println("Son iguales? " + (nissa == nissa2));
        System.out.println("Son iguales con equals? " + (nissa .equals(nissa2)));
        System.out.println(nissa);
        System.out.println(nissa.toString());
        System.out.println("----------------------------");
        System.out.println(subaru.verDetalle());
        System.out.println("---------------------------");
        System.out.println(mazda.verDetalle());
        System.out.println("---------------------------");
        System.out.println(nissa.verDetalle());
        System.out.println("============================");
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println("============================");
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("------------------------------");
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilometros por litro " + nissa.calcularConsumo(300, 60));

        System.out.println(auto.equals(fecha));
    }
}
