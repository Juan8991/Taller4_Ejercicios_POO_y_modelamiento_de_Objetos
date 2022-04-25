/**
 * Ejercicio 2
 * Se puede tener varios métodos main dentro de una misma clase"
 * pero el punto de entrada se marcara con el argumento String[] args
 */
public class Main {
    public static void main(){
        System.out.println("OTRO METODO MAIN");
    }
    public static void main(String[] args) {
        System.out.println("Metodo principal");
        main();
    }

}
