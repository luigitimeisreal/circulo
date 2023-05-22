/**
 * @version 1.0
 * @author Antonio
 * @since 1.0
 * Esta clase representa una figura geométrica de un círculo. 
 */
public class Circulo {

    private double radio;
    private String color;
    public static int numCirculos;
    
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getNumCirculos() {
        return numCirculos;
    }

    public static void setNumCirculos(int numCirculos) {
        Circulo.numCirculos = numCirculos;
    }
    
    /**
     * 
     * @return area del círculo
     * Este método calcula el área.
     */
    public double calculoArea(){
        if (this.radio<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(radio, 2)*Math.PI);
    }
    /**
     * 
     * @return perímetro
     * @throws Exception Radio negativo o muy grande
     * Este método calcula el perímetro
     */
    public double calculoPerimetro()throws Exception{
        if (this.radio<0)
            throw new Exception ("Radio negativo");
        else if(radio>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.radio);
    }
    
}
