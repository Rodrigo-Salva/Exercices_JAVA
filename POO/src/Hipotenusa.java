
//Crear una aplicación que imprima la hipotenusa

//CLASE
public class Hipotenusa {
    //Atributos
    double catetoAdyacente;
    double catetoOpuesto;

    double obtenerHipotenusa(){
        double hipo = Math.sqrt(catetoAdyacente * catetoAdyacente + catetoOpuesto * catetoOpuesto);
        return hipo;
    }
}
