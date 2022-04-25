import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal en la cual se crea el menu de usuario y se utiliza la clase GetInformation
 * @version 1.00.00
 */
public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        GetInformation info=new GetInformation();
        boolean exit=false;
        int option,option2;
        do{
            System.out.println("Elija una de la siguientes opciones \n 1) Crear 10 vehiculos de tipo ferry \n 2) Salir");
            option=read.nextInt();
            try{
                switch (option){
                    case 1:
                        info.getData();
                        System.out.println(info.toString());
                        break;
                    case 2:
                        exit=true;
                        break;
                }
            }catch (InputMismatchException exception){
                System.out.println("Eligio incorrectamente. Debe elegir un número");
                read.next();
            }
        }while(!exit);
    }
}
