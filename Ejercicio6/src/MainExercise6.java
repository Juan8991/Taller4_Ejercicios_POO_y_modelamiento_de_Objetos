import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal donde se crea el menu de usuario el cual se
 * encuentra dentro de un bucle que permite ingresar números de
 * manera infinita hasta que el usuario ingrese 2 números iugales
 * seguidos.
 * @author Juan Ramirez
 * @version 1.000.00
 */
public class MainExercise6 {
    public static void main(String[] args) {
        /**
         * Llamo a la clase statica que contiene el menú
         */
        menu();
    }
    public static void menu(){
        Scanner read=new Scanner(System.in);
        boolean exit=false;
        Number vectorNumber=new Number();
        /**
         * Manejo de excepciones con try- catch
         */
        try{
            System.out.println("Bienvenido, a continuación debe ingresar números y el programa terminara cuando ingrese 2 números iguales segidos");

            do{
                exit=vectorNumber.compareNumbers(read.nextInt());
            }while(!exit);
        }catch(InputMismatchException exception){
            System.out.println("Ingreso un dato incorrecto, por favor ingrese un número");
            menu();
        }
    }
}
