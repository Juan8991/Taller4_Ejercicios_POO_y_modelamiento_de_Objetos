
import java.util.Vector;

/**
 * Clase que hace uso de la clase Vector y que almacena y muestra los
 * números que el ususario va introduciendo
 * @author Juan Ramirez
 * @version 1.000.00
 */
public class Number {
    Vector vector=new Vector();
    /**
     * el contador me permite saber cuantas veces ha utilizado el metodo el menu
     */
    private int counter=0;
    public Number(){
    }

    /**
     * Metodo que permite ir guardando en el vector el numero ingresado por el usuario
     * @param number el numero ingresado por el usuario
     * @author Juan Ramirez
     * @version 1.000.00
     */
    public void setNumbersToVector(int number){
        vector.addElement(number);
    }

    /**
     * Metodo que hace uso del metodo agregar numero al vector y ademas compara
     * estos numeros agragados para saber si el usuario ingreso 2 numeros iguales
     * seguidos
     * @param number el numero ingresado por el usuario
     * @return false o true
     * @author Juan Ramirez
     * @version 1.000.00
     */
    public boolean compareNumbers(int number){
        setNumbersToVector(number);
        if(counter==0){
            counter++;
            return false;
        }else{
            if(vector.elementAt(counter)==vector.elementAt(counter-1)){
            System.out.println("Números ingresados "+vector);
                return true;
            }else{
                counter++;
                return false;
            }
        }
    }
}
