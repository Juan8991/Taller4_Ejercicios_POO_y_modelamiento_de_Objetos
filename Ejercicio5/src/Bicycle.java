/**
 * Clase hija que hereda todos los metodos y atributos de la calse Padre Vehiculo
 * Ademas agrega atributos que diferencian la clase Bicicleta del resto de las clases
 * @version 1.00.00
 */
public class Bicycle extends Vehicle2 {
    private String brand,saddle,color,handlebar;
    private final int pedal=2;
    private int rimSize;
    /**
     * Metodos Getter and Setters
     */
    public String getHandlebar() {
        return handlebar;
    }

    public void setHandlebar(String handlebar) {
        this.handlebar = handlebar;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSaddle() {
        return saddle;
    }
    public void setSaddle(String saddle) {
        this.saddle = saddle;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPedal() {
        return pedal;
    }
    public int getRimSize() {
        return rimSize;
    }
    public void setRimSize(int rimSize) {
        this.rimSize = rimSize;
    }
}
