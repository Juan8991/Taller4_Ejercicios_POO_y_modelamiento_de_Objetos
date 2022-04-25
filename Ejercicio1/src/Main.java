/**
 * Clase principal donde se crea el menu de usuario y se instancia un objeto de tipo Scanner
 * y otro de tipo GravitationalOperation, se usa el try y cath para el manejo de excepciones
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {


    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        GravitationalOperation operation=new GravitationalOperation();

        boolean exit=false;
        int option,option2,option3,option4,option5;

        while(!exit){
            System.out.println("Elija una de la siguientes opciones \n 1) Mostrar sistema planetario \n 2) Salir");
            try{
                option=read.nextInt();
                switch (option){
                    case 1:
                        operation.showObjects();
                        System.out.println("Desea calcular la fuerza gravitacional entre 2 objetos planetarios?\n 1) Si \n 2) No");
                        option2=read.nextInt();
                        switch (option2){
                            case 1:
                                System.out.println("A continuación introduzca el número de identificación del primer planeta");
                                option3=read.nextInt();
                                System.out.println("Ahora introduzca el número de identificación del segundo planeta");
                                option4=read.nextInt();
                                System.out.println("La fuerza gravitacional entre "+ operation.getPlanetName(option3) + " y " + operation.getPlanetName(option4) + " es: "+
                                        operation.gravitationalForce(option3,option4)+ " Newtons \n");
                                do {
                                    System.out.println("¿Desea calcular otra fuerza gravitacional entre dos planetas?\n 1) Si \n 2) No");
                                    option5=read.nextInt();
                                    if (option5 == 1){
                                        System.out.println("A continuación introduzca el número de identificación del primer planeta");
                                        option3=read.nextInt();
                                        System.out.println("Ahora introduzca el numero de identificación del segundo planeta");
                                        option4=read.nextInt();
                                        System.out.println("La fuerza gravitacional entre "+ operation.getPlanetName(option3) + " y " + operation.getPlanetName(option4) + " es: "+
                                                operation.gravitationalForce(option3,option4)+ " Newtons \n");
                                    } else if (option5 == 2) {
                                        break;
                                    }else {
                                        System.out.println("Eligio mal vuelva a elegir");
                                    }
                                }while(option5 != 2);
                                break;
                            case 2:
                                exit=true;
                                break;
                        }
                    case 2:
                        exit=true;
                        break;
                    default:
                        System.out.println("Elijio incorrectamente, por favor vuelva a elegir");
                }
            }catch (InputMismatchException exception){
                System.out.println("Eligio incorrectamente. Debe elegir un número");
                read.next();
            }
        }

    }
    public static void returnPoint(){}
}
