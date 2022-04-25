/**
 * Clase hija que hereda todos los metodos y atributos de la calse Padre Vehiculo
 * Ademas agrega atributos que diferencian la clase Lancha del resto de las clases
 * @version 1.00.00
 */
public class Boat extends Vehicle2 {
    private String anchor,color,helm,sail;
    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }
    /**
     * Metodos Getter and Setters
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHelm() {
        return helm;
    }

    public void setHelm(String helm) {
        this.helm = helm;
    }

    public String getSail() {
        return sail;
    }

    public void setSail(String sail) {
        this.sail = sail;
    }
}
