/**
 * Clase hija que hereda todos los metodos y atributos de la calse Padre Vehiculo
 * Ademas agrega atributos que diferencian la clase Motocicleta del resto de las clases
 * @version 1.00.00
 */
public class Motorbike extends Vehicle2 {
    private String seat,throttle,clutch;
    private double fuelTank;
    /**
     * Metodos Getter and Setters
     * @return
     */
    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getThrottle() {
        return throttle;
    }

    public void setThrottle(String throttle) {
        this.throttle = throttle;
    }

    public String getClutch() {
        return clutch;
    }

    public void setClutch(String clutch) {
        this.clutch = clutch;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

}
