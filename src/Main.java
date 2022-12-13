
/**
 * @author Ayesa
 * @version 13.12.2022
 */

public class Main {
    /**
     *;Metodo Main
     * @param args argumentos
     */
    public static void main(String[] args) {

        String str_circun = "la circunferencia es de : ";
        String str_centre = "El centro del circulo es: ";
        Circulo c1 = new Circulo(0.5,4,7);
        System.out.println( str_circun+ c1.getCircunferencia());
        System.out.println(str_centre + c1.getCentroX());
        c1.escala(7);
        System.out.println(str_circun + c1.getCircunferencia());




    }

}