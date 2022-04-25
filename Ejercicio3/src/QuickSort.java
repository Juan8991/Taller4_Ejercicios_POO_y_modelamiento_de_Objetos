/**
 * Clase que aplica la tecnica quicSort
 * @version 1.00.00
 */
import java.util.Arrays;
public class QuickSort  {
    private double realNumbers[];

    /**
     * Clase constructor
     * @param A que es el array de numeros reales generado aleatoriamente
     */
    public QuickSort(double A[]){
        this.realNumbers=A;
    }

    /**
     * Este metodo se encarga de  ir subdividiendo el array en arrays más pequeños, y ordenar éstos
     * hasta que qued todo el array ordenado de menor a mayor
     * @param izq pivote izquiero
     * @param der pivote derecho
     */
    public void sortRealNumberArray(int izq, int der) {
        double pivote=realNumbers[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        double aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(realNumbers[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(realNumbers[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= realNumbers[i];                      // los intercambia
                realNumbers[i]=realNumbers[j];
                realNumbers[j]=aux;
            }
        }

        realNumbers[izq]=realNumbers[j];      // se coloca el pivote en su lugar de forma que tendremos
        realNumbers[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            sortRealNumberArray(izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            sortRealNumberArray(j+1,der);          // ordenamos subarray derecho
        // ordenamos subarray derecho
    }

    public double[] getRealNumbers() {
        return realNumbers;
    }
    /**
     * Se utiliza el metodo TOstring para mostrar cada elemento del array
     * @return ARRAY DE NUMERO REALES
     * @version 1.00.00
     */
    @Override
    public String toString() {
        return "Array de números Reales=" + Arrays.toString(realNumbers);
    }
}
