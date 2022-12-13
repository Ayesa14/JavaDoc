
/**
 * Clase Circulo
 */
public class Circulo {
    /**
     * coordenadas centro X, centro Y y radio
     */
    private double centroX;
    private double centroY;
    private double radio;

    /**
     *Contructor
     *
     * @param centroX centro eje x
     * @param centroY centro eje y
     * @param radio tamaño del radio
     */
    public Circulo(double centroX, double centroY, double radio) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.radio = radio;

    }

    /**
     * Contrsuctor por defecto
     */
    public Circulo(){

    }

    /**
     *Getter centro
     * @return centroX centro eje x
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     *Getter Circunfrencia
     * @return circunferencia
     */
    public double getCircunferencia() {
        return 2* Math.PI*radio;
    }

    /**
     * Desplaza el centro
     * @param X sumamos al centro de la circunferencia la pos X
     * @param Y sumamos al centro de la circunferencia la pos Y
     */
    public void desplaza(double X,double Y){
        centroX += X;
        centroY += Y;
    }

    /**
     * aumenta el tamaño
     * @param escala multipplica el radio de la circunferencia
     *
     */
    public void escala(double escala){
        radio *= escala;
    }

}