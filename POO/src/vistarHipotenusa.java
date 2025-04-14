import java.util.Scanner;

public class vistarHipotenusa {
    public static void main(String[] args) {
        Hipotenusa hipotenusa = new Hipotenusa();
        double catetoAdya, catetoOpu, hipo;


        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el zcateto adyacente: ");
        catetoAdya = consola.nextDouble();
        System.out.println("Ingrese el cateto opuesto: ");
        catetoOpu = consola.nextDouble();

        hipotenusa.catetoAdyacente = catetoAdya;
        hipotenusa.catetoOpuesto = catetoOpu;
        hipo = hipotenusa.obtenerHipotenusa();
        System.out.println("La hipotenusa es: " + hipo);

    }
}
