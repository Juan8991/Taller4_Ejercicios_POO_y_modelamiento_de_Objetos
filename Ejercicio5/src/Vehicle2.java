/**
 * Clase Vehiculo que modela de manera general los atributos y metodos que contiene un Vehiculo.
 * @version 1.00.00
 */
public class Vehicle2 {
    /**
     * Declaración de atributos
     */
    private int numberOfPassenger,numberOfWheels;
    private boolean tripulation;
    private String brand,motorType,color;
    private enum meansOfTravel{Terrestre, areo, maritimo};
    private String registrationDate,id, journey,VehiculeType;

    /**
     * Metodo arrancar
     * @version 1.00.00
     */
    public void speedUp(){
        System.out.println("El vehiculo esta acelerando...");
    }
    /**
     * Metodo Frenar
     * @version 1.00.00
     */
    public void stop(){
        System.out.println("El vehiculo esta frenando...");
    }

    /**
     * Metodos Getters and Setters
     * @return
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getJourney() {
        return journey;
    }

    public void setJourney(String journey) {
        this.journey = journey;
    }

    public String getVehiculeType() {
        return VehiculeType;
    }

    public void setVehiculeType(String vehiculeType) {
        VehiculeType = vehiculeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isTripulation() {
        return tripulation;
    }

    public void setTripulation(boolean tripulation) {
        this.tripulation = tripulation;
    }
    /**
     * Metodo toString que muestra todos los atributos de la clase Vehiculo
     * @return String
     * @version 1.00.00
     */
    @Override
    public String toString() {
        return "{" +
                "numberOfPassenger=" + numberOfPassenger +
                ", numberOfWheels=" + numberOfWheels +
                ", tripulation=" + tripulation +
                ", brand='" + brand + '\'' +
                ", motorType='" + motorType + '\'' +
                ", color='" + color + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", id='" + id + '\'' +
                ", journey='" + journey + '\'' +
                ", VehiculeType='" + VehiculeType + '\'' +
                '}';
    }
}
