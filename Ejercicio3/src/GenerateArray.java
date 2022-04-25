/**
 * Clase abstracta que permite generar un array de tipo double
 * de numeros reales en un rango de -75 y 100. Con un metodo abstracto
 * para ordenar este array
 * @version 1.00.00
 */
import java.util.Arrays;
public abstract class GenerateArray {
    private double realNumbers[];
    /**
     * En los atributos de abajo se crea el rango en el cual se van
     * a generar los numeros reales
     */
    private int max=100, min=-75,arraySize;
    private double range=(max-min-1);

    /**
     * Metodo abstracto
     */
    public abstract void sortRealNumberArray();

    /**
     * getter y setters
     * @return
     * * @version 1.00.00
     */
    public int getArraySize() {
        return arraySize;
    }
    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    /**
     * Se utiliza el metodo TOstring para mostrar cada elemento del array
     * @return ARRAY DE NUMERO REALES
     * @version 1.00.00
     */
    @Override
    public String toString() {
        return "Array de números Reales=" + Arrays.toString(realNumbers) ;
    }

    public void fillArray(){
        realNumbers=new double[getArraySize()];
        for(int i=0; i<getArraySize();i++){
            realNumbers[i]=(Math.random()*range)+min;
        }
    }
    public double[] getRealNumbers() {
        return realNumbers;
    }


}
