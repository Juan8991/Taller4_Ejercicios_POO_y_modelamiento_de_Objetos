import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase que permite ingresar mediante teclado, los atributos de
 * 10 vehiculos
 * @version 1.00.00
 */
public class GetInformation {
    /**
     * En este arrayList se guardaran los 10 vehiculos creados por el usuario
     */
    private ArrayList<Vehicle> vehicles;
    Scanner read=new Scanner(System.in);

    /**
     * Metodo que instacia el array list
     * @version 1.00.00
     */
    public GetInformation(){
        this.vehicles=new ArrayList<>();
    }

    /**
     * Devulve el arrayList con los 10 vehiculos
     * @return Arraylist
     * @version 1.00.00
     */
    public ArrayList<Vehicle> getVehicles() {
        return this.vehicles;
    }

    /**
     * Meotodo que muestra los atributos de los vehiculos guardados en el arrayList
     * @return String
     * @version 1.00.00
     */
    @Override
    public String toString() {
        return "GetInformation{" +
                "Ferry=" + this.vehicles +
                '}'+"\n";
    }

    /**
     * Este metodo permite obetener mediante teclado cada atributo de cada vehiculo mediante
     * un ciclo de tipo for.
     * @version 1.00.00
     */
    public void getData(){
        int option;
        for (int i=0;i< 10;i++){
            Vehicle vehicle=new Vehicle();
            System.out.println("Ingrese el nombre del Ferry");
            vehicle.setVehicleName(read.nextLine());
            System.out.println("Ingrese el tipo de Ferry");
            vehicle.setVehiculeType(read.nextLine());
            System.out.println("El ferry cuenta con tripulación? \n 1) Si \n 2) No");
            option=read.nextInt();
            if (option==1){
                vehicle.setTripulation(true);
                System.out.println("Ingrese el número de pasajeros");
                vehicle.setNumberOfPassenger(read.nextInt());
            }
            else{
                vehicle.setTripulation(false);
                vehicle.setNumberOfPassenger(0);
            }
            System.out.println("Ingrese el tipo de motor");
            vehicle.setMotorType(read.nextLine());
            vehicle.setMotorType(read.nextLine());
            System.out.println("Ingrese la fecha de matriculación");
            vehicle.setRegistrationDate(read.nextLine());
            System.out.println("Ingrese la Matricula del vehiculo");
            vehicle.setId(read.nextLine());
            System.out.println("Ingrese el trayecto");
            vehicle.setJourney(read.nextLine());
            this.vehicles.add(vehicle);
        }

    }

}
