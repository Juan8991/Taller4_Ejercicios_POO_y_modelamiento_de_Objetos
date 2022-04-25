/**
 * Clase hija que hereda todos los metodos y atributos de la calse Padre Vehiculo
 * Ademas agrega atributos que diferencian la clase Camion del resto de las clases
 * @version 1.00.00
 */

public class Truck extends Vehicle2 {
    private int numberOfDoor;
    private String bumper,boot,bonnet,steeringWheel;
    private int cylinderCapacity;
    private double height;


    /**
     * Metodos Getter and Setters
     * @return
     */
    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public String getBumper() {
        return bumper;
    }

    public void setBumper(String bumper) {
        this.bumper = bumper;
    }

    public String getBoot() {
        return boot;
    }

    public void setBoot(String boot) {
        this.boot = boot;
    }

    public String getBonnet() {
        return bonnet;
    }

    public void setBonnet(String bonnet) {
        this.bonnet = bonnet;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
