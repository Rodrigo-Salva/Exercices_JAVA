public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }


        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.BENCINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);
        Rueda[] ruedasMaz = new Rueda[5];
        for (int i = 0; i< ruedasMaz.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }


        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissa = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissa.setConductor(bea);
        nissa.setTipo(TipoAutomovil.PICKUP);

        nissa.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));


        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};
        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissa2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50), lalo, ruedasNissan2);
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
        System.out.println("-----------------------------");

        /*System.out.println("Conductor subaru: " + subaru.getConductor().toString());//Para poder invocar al conductor de subaru
        System.out.println("Ruedas subaru");
        for (Rueda R: subaru.getRuedas()){
            System.out.println("Fabricante: " + R.getFabricante() + ", Aro: " + R.getAro() + ", Ancho: " + R.getAncho());
        }*/
    }
}
