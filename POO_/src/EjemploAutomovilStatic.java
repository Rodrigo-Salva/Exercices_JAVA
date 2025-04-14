public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.BENCINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        //mazda.setEstanque(new Estanque(50));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissa = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissa.setTipo(TipoAutomovil.PICKUP);

        Automovil nissa2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissa2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);
        nissa2.setTipo(TipoAutomovil.PICKUP);

        Automovil auto = new Automovil();//(Vacia por ahora):)

        System.out.println(subaru.verDetalle());
        System.out.println("---------------------------");
        System.out.println(mazda.verDetalle());
        System.out.println("---------------------------");
        System.out.println(nissa.verDetalle());
        System.out.println("----------------------------");
        System.out.println(nissa2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));//Recuerda si deseas
        // llamar a un metodo estatico, siempre con el nombre de la clase

        System.out.println("-------------------------------------");
        System.out.println("Velocidad maxima en una carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima en la ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo desc. subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));

    }
}
