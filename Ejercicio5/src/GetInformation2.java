import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Clase que permite ingresar mediante teclado, los atributos de
 * vehiculos de distintos tipos Bike, MotorBike, Car, Truck,Boat
 * @version 1.00.00
 */
public class GetInformation2 extends Vehicle2 {
    private ArrayList<Vehicle2> vehicle2s;
    Scanner read=new Scanner(System.in);
    public GetInformation2(){
        this.vehicle2s =new ArrayList<>();
    }

    public ArrayList<Vehicle2> getVehicles() {
        return this.vehicle2s;
    }


    /**
     * Este metodo permite obetener mediante teclado cada atributo de cada vehiculo, ademas permite
     * diferenciar los distintos tipos de vehiculos.
     * @version 1.00.00
     */
    public void data(){
        int option;
        boolean exit=false;
        do{
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("Elija una de la siguientes opciones \n 1) Crear vehiculo de tipo Bicicleta \n 2) Crear vehiculo de tipo moto " +
                    "\n 3) Crear vehiculo de tipo carro \n 4) Crear vehiculo de tipo camion \n 5) Crear vehiculo de tipo lancha \n 6) Mostrar vehiculos creados \n 7) Salir");
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            option=read.nextInt();
            try{
                switch (option){
                    case 1:
                        Bicycle bici=new Bicycle();
                        bici.setNumberOfWheels(2);
                        System.out.print("Ingrese la marca:");
                        bici.setBrand(read.nextLine());
                        bici.setBrand(read.nextLine());
                        System.out.print("Ingrese el color:");
                        bici.setColor(read.nextLine());
                        System.out.print("Ingrese el tamaño del rim:");
                        bici.setRimSize(read.nextInt());
                        System.out.print("Ingrese el trayecto:");
                        bici.setJourney(read.nextLine());
                        bici.setJourney(read.nextLine());
                        System.out.print("Ingrese el tipo de sillin:");
                        bici.setSaddle(read.nextLine());
                        System.out.print("Ingrese el tipo de maniubro:");
                        bici.setHandlebar(read.nextLine());
                        this.vehicle2s.add(bici);
                        break;
                    case 2:
                        Motorbike moto=new Motorbike();
                        moto.setNumberOfWheels(2);
                        System.out.print("Ingrese la marca:");
                        moto.setBrand(read.nextLine());
                        moto.setBrand(read.nextLine());
                        System.out.print("Ingrese el color:");
                        moto.setColor(read.nextLine());
                        System.out.print("Ingrese el tipo de aciento:");
                        moto.setSeat(read.nextLine());
                        System.out.print("Ingrese el tipo de motor:");
                        moto.setMotorType(read.nextLine());
                        System.out.print("Ingrese la capacidad del tanque de gasolina:");
                        moto.setFuelTank(read.nextDouble());
                        System.out.print("Ingrese la fecha de matriculación:");
                        moto.setRegistrationDate(read.nextLine());
                        moto.setRegistrationDate(read.nextLine());
                        System.out.print("Ingrese la Matricula del vehiculo:");
                        moto.setId(read.nextLine());
                        System.out.print("Ingrese el trayecto");
                        moto.setJourney(read.nextLine());
                        this.vehicle2s.add(moto);
                        break;
                    case 3:
                        Car car=new Car();
                        System.out.print("Ingrese la marca:");
                        car.setBrand(read.nextLine());
                        car.setBrand(read.nextLine());
                        System.out.print("Ingrese el color:");
                        car.setColor(read.nextLine());
                        System.out.print("Ingrese el numero de puertas:");
                        car.setNumberOfDoor(read.nextInt());
                        System.out.print("El carro cuenta con tripulación? \n 1) Si \n 2) No");
                        option=read.nextInt();
                        if (option==1){
                            car.setTripulation(true);
                            System.out.print("Ingrese el número de pasajeros:");
                            car.setNumberOfPassenger(read.nextInt());
                        }
                        else{
                            car.setTripulation(false);
                            car.setNumberOfPassenger(0);
                        }
                        System.out.print("Ingrese el tipo de motor:");
                        car.setMotorType(read.nextLine());
                        car.setMotorType(read.nextLine());
                        System.out.print("Ingrese el cilindraje del motor:");
                        car.setCylinderCapacity(read.nextInt());
                        System.out.print("Ingrese la fecha de matriculación:");
                        car.setRegistrationDate(read.nextLine());
                        car.setRegistrationDate(read.nextLine());
                        System.out.println("Ingrese la Matricula del vehiculo:");
                        car.setId(read.nextLine());
                        System.out.print("Ingrese el trayecto:");
                        car.setJourney(read.nextLine());
                        System.out.print("Ingrese la altura:");
                        car.setHeight(read.nextDouble());
                        this.vehicle2s.add(car);
                        break;
                    case 4:
                        Truck truck=new Truck();
                        System.out.print("Ingrese la marca:");
                        truck.setBrand(read.nextLine());
                        truck.setBrand(read.nextLine());
                        System.out.print("Ingrese el color:");
                        truck.setColor(read.nextLine());
                        System.out.print("Ingrese el numero de puertas:");
                        truck.setNumberOfDoor(read.nextInt());
                        System.out.println("El camion cuenta con tripulación? \n 1) Si \n 2) No");
                        option=read.nextInt();
                        if (option==1){
                            truck.setTripulation(true);
                            System.out.print("Ingrese el número de pasajeros:");
                            truck.setNumberOfPassenger(read.nextInt());
                        }
                        else{
                            truck.setTripulation(false);
                            truck.setNumberOfPassenger(0);
                        }
                        System.out.print("Ingrese el tipo de motor:");
                        truck.setMotorType(read.nextLine());
                        truck.setMotorType(read.nextLine());
                        System.out.print("Ingrese el cilindraje del motor:");
                        truck.setCylinderCapacity(read.nextInt());
                        System.out.print("Ingrese la fecha de matriculación:");
                        truck.setRegistrationDate(read.nextLine());
                        truck.setRegistrationDate(read.nextLine());
                        System.out.print("Ingrese la Matricula del vehiculo:");
                        truck.setId(read.nextLine());
                        System.out.print("Ingrese el trayecto");
                        truck.setJourney(read.nextLine());
                        System.out.print("Ingrese la altura");
                        truck.setHeight(read.nextDouble());
                        this.vehicle2s.add(truck);
                        break;
                    case 5:
                        Boat boat=new Boat();
                        System.out.print("Ingrese la marca:");
                        boat.setBrand(read.nextLine());
                        boat.setBrand(read.nextLine());
                        System.out.print("Ingrese el color:");
                        boat.setColor(read.nextLine());
                        System.out.println("La lancha cuenta con tripulación? \n 1) Si \n 2) No");
                        option=read.nextInt();
                        if (option==1){
                            boat.setTripulation(true);
                            System.out.println("Ingrese el número de pasajeros");
                            boat.setNumberOfPassenger(read.nextInt());
                        }
                        else{
                            boat.setTripulation(false);
                            boat.setNumberOfPassenger(0);
                        }
                        System.out.print("Ingrese el tipo de motor:");
                        boat.setMotorType(read.nextLine());
                        boat.setMotorType(read.nextLine());
                        System.out.print("Ingrese la fecha de matriculación:");
                        boat.setRegistrationDate(read.nextLine());
                        System.out.print("Ingrese la Matricula del vehiculo:");
                        boat.setId(read.nextLine());
                        System.out.print("Ingrese el trayecto:");
                        boat.setJourney(read.nextLine());
                        this.vehicle2s.add(boat);
                        break;
                    case 6:
                        System.out.println(getVehicles());
                        break;
                    case 7:
                        exit=true;
                        break;
                    default:
                        System.out.println("Eligio mal, por favor vuelva a elegir");
                }
            }catch(InputMismatchException exception){
                System.out.println("Eligio incorrectamente. Debe elegir un número");
                read.next();
            }
        }while(!exit);

    }
    /**
     * Meotodo que muestra los atributos de los vehiculos guardados en el arrayList
     * @return String
     * @version 1.00.00
     */
    @Override
    public String toString() {
        return vehicle2s.toString()+"{" +
                "vehicle2s=" + getVehicles().toString() +
                '}';
    }
}
