//Recordar que estamos haciendo con clases genericas y con los metodos genericos 
package org.rsalva.genericsclass;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T o: camion){
            if (o instanceof Animal) {
                System.out.println("Nombre: " +((Animal)o).getNombre() + "\nTipo: " + ((Animal)o).getTipo());
                System.out.println("----------------");
            }
            else if(o instanceof Maquinaria){
                    System.out.println("Tipo: " + ((Maquinaria)o).getTipo());
                    System.out.println("-----------------");
            }
            else if (o instanceof Automovil){
                System.out.println("Marca del automovil: " + ((Automovil)o).getMarca());
                System.out.println("----------------");
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("=====Caballos=====");

        Camion<Animal> transporteCaballos = new Camion<Animal>(5);
        transporteCaballos.add(new Animal("Peregrino", tipoCaballo.CABALLO));
        transporteCaballos.add(new Animal("Grillo", tipoCaballo.CABALLO));
        transporteCaballos.add(new Animal("Tunquen", tipoCaballo.CABALLO));
        transporteCaballos.add(new Animal("TocoCalma", tipoCaballo.CABALLO));
        transporteCaballos.add(new Animal("LongoToma", tipoCaballo.CABALLO));

        imprimirCamion(transporteCaballos);

        System.out.println("\n=====Maquinaria=====");

        Camion<Maquinaria> Maquinas = new Camion<Maquinaria>(3);
        Maquinas.add(new Maquinaria("Bulldozer"));
        Maquinas.add(new Maquinaria("Grua Horquilla"));
        Maquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(Maquinas);

        System.out.println("\n=====Automovil=====");

        Camion<Automovil> transAuror = new Camion<Automovil>(3);
        transAuror.add(new Automovil("Toyota"));
        transAuror.add(new Automovil("Mitsubishi"));
        transAuror.add(new Automovil("Chevrolet"));

        imprimirCamion(transAuror);

    }
}
