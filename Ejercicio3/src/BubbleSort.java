/**
 * Clse hija que extiende de la clase padre GenerateArray e implementa
 * el metodo sortRealNumberArray con el metodo burbuja
 * @version 1.00.00
 */

public class BubbleSort extends GenerateArray{
    private double currentlyNumber;

    /**
     * Metodo de ordena el array de numeros reales mediante
     * la tecnica de burbuja, recorriendo el array
     * y evaluando si el dato actual en el indice alcual es mayor al dato
     * siguiente y los va cambiando hasta tenerlos todos en orden de menor
     * a mayor
     * @version 1.00.00
     */
    @Override
    public void sortRealNumberArray() {
        getArraySize();
        for(int i=0; i<(getArraySize()-1);i++){
            for(int j=0; j<(getArraySize()-1);j++){
                if(getRealNumbers()[j]>getRealNumbers()[j+1]){
                    currentlyNumber=getRealNumbers()[j];
                    getRealNumbers()[j]=getRealNumbers()[j+1];
                    getRealNumbers()[j+1]=currentlyNumber;
                }
            }
        }
    }



}
