public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());


        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipo.getNombre());
        System.out.println("Tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE ->
                    System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                    System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON ->
                    System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                    System.out.println("Es un automovil medino compacto, aspecto deportivo");
            case PICKUP ->
                    System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                    System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                    System.out.println("Es un automovil mas grande, con maleta grande....");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil TA: tipos){
            System.out.println(TA + " => " + TA.name() + ", " +
                    TA.getNombre() + ", " +
                    TA.getDescripcion() + ", " +
                    TA.getNumeroPuertas());
            System.out.println();
        }

    }
}
