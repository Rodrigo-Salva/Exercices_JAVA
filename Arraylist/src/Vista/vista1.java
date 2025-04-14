package Vista;
import java.util.ArrayList;
import Datos.nombres;
public class vista1 {
    public static void main(String[] args) {
        ArrayList<nombres> nombre = new ArrayList<nombres>();

        nombre.add("Rodrigo");
        nombre.add(new nombres("Luis"));
        nombre.add(new nombres("Mack"));
        nombre.add(new nombres("Marcelo"));
        nombre.add(new nombres("Daniel"));
        nombre.add(new nombres("Elbert"));
        System.out.println(nombre.size());

        for (nombres nom: nombre){
            System.out.println(nom);
        }
    }
}
