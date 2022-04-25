/**
 * Clase principal donde se crea el menu de usuario y se instancia un objeto de tipo Scanner
 * y otro de tipo BubbleSort y QuickSort, se usa el try y cath para el manejo de excepciones
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        GenerateArray bubbleSort=new BubbleSort();

        boolean exit=false;
        int arraySize,option,option2;
        do {

            System.out.println("Elija una de la siguientes opciones \n 1) Generar un arreglo de números reales \n 2) Salir");
            option=read.nextInt();
            try{
                switch (option){
                    case 1:
                        System.out.println("Ingrese el tamaño del arreglo");
                        arraySize=read.nextInt();
                        bubbleSort.setArraySize(arraySize);
                        bubbleSort.fillArray();
                        System.out.println(bubbleSort.toString());
                        System.out.println("Elija una de la siguientes opciones \n 1) Organizar el Array por medio del metodo Burbuja " +
                                "\n 2) Organizar el Array por medio del metodo Quick Sort"+
                                "\n 3) Salir");
                        option2=read.nextInt();
                        switch (option2){
                            case 1:
                                bubbleSort.sortRealNumberArray();
                                System.out.println(bubbleSort.toString());
                                break;
                            case 2:
                                QuickSort quickSort=new QuickSort(bubbleSort.getRealNumbers());
                                quickSort.sortRealNumberArray(0,arraySize-1);
                                System.out.println(quickSort.toString());
                                break;
                            default:
                                exit=true;
                        }
                        break;
                    case 2:
                        exit=true;
                        break;
                }
            }catch (InputMismatchException exception){
                System.out.println("Eligio incorrectamente. Debe elegir un número");
                read.next();
            }
        }while (!exit);



    }
}
