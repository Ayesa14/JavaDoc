import static java.lang.Math.PI;
import javax.swing.JOptionPane;
public class Figuras {
    /**
     * funciones utilizadas en la clase Main
     */
    public void seleccionarOpcion(){

        System.out.println("---Menú de selección---");
        System.out.println("\nPresiona '1' para elegir cuadrado");
        System.out.println("\nPresiona '2' para elegir triángulo");
        System.out.println("\nPresiona '3' para elegir círculo");
        short opcion = Short.parseShort(JOptionPane.showInputDialog("Ingrese la opción que desea"));
        /**
         * Menú de selección de opciones que sale impreso por pantalla
         * Ingresas la opción y depende del número que hayas elegido, te lleva a la figura
         */


        switch(opcion){
            case 1: float lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado del cuadrado: "));
                System.out.println("\nHa elegido el cuadrado \nLa superficie del cuadrado es: "+Math.pow(lado, 2));
                break;
            /**
             * pide ingresar lado del cuadrado
             * si la opción elegida es 1, calcula la superficie del cuadrado y luego rompe el programa
             */

            case 2: float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del triángulo: "));
                float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del triángulo: "));
                System.out.println("\nHa elegido el triángulo \nLa superficie del triángulo es: "+((base*altura)/2));
                break;
            /**
             * pide ingresar base y altura del triángulo
             * si la opción elegida es 2, calcula la superficie del triángulo y luego rompe el programa
             */

            case 3: float radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio del círculo: "));
                System.out.println("\nHa elegido el círculo \nLa superficie del círculo es: "+(PI*Math.pow(radio, 2)));
                break;
            /**
             * pide ingresar radio del círculo
             * si la opción elegida es 3, calcula la superficie del círculo y luego rompe el programa
             */

            default: System.out.println("Opción incorrecta");
                /**
                 * Si se presiona una opción incorrecta
                 */
        }
    }
}
