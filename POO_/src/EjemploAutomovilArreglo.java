import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.BENCINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);


        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissa = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissa.setConductor(bea);
        nissa.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil Susuki = new Automovil("Susuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        Susuki.setConductor(lalo);
        Susuki.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);
        Susuki.setTipo(TipoAutomovil.PICKUP);

        Automovil audi = new Automovil("AUDI", "A3");//(Vacia por ahora):)
        audi.setConductor(new Persona("Jano", "Pérez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissa;
        autos[3] = Susuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }
    }
}
