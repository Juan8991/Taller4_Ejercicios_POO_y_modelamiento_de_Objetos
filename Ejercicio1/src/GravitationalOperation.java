/**
 *Esta clase se encarga de crear los objetos de tipo PlanetaryObject con el fin de
 * utilizar los metodos y atributos necesarios para poder calcular la atracción
 * gravitacional  entre 2 objetos y mostrar su resusltado.
 *
 */

import java.util.ArrayList;

public class GravitationalOperation extends PlanetaryObject {
    /**
     * Instanciacion de pbjetos
     */
    PlanetaryObject sun=new PlanetaryObject();
    PlanetaryObject mercurio=new PlanetaryObject();
    PlanetaryObject venus=new PlanetaryObject();
    PlanetaryObject tierra=new PlanetaryObject();
    PlanetaryObject marte=new PlanetaryObject();
    PlanetaryObject jupiter=new PlanetaryObject();
    //---------------------------------------------------
    /**
     * Se instancia  la constante universal gravitacional para su posterior uso;
     * ademas se crea un array list para guardar cada objeto.
     */
    private final double universalGravitationalConstant=6.67E-11;
    public ArrayList<PlanetaryObject> planets=new ArrayList<>();
    //---------------------------------------------------

    /**
     * Se crea este metodo para guardar cada objeto con el objetivo de ser usado posteriormente
     * @return devuelve el array planets, con cada uno de sus atributos
     */
    public ArrayList planetaryArray(){
        sun.setName("Sol");
        sun.setDensity(1.41);
        sun.setMass(1.989E30);
        sun.setDiameter(1392680);
        sun.setId(0);
        sun.setDistanceToTheCentralStart(0);
        //---------------------------------------------------
        mercurio.setName("Mercurio");
        mercurio.setDensity(5.43);
        mercurio.setMass(3.285E23);
        mercurio.setDiameter(4879.4);
        mercurio.setId(1);
        mercurio.setDistanceToTheCentralStart(57.91E9);
        //---------------------------------------------------
        venus.setName("Venus");
        venus.setDensity(5.24);
        venus.setMass(4.867E24);
        venus.setDiameter(12103.6);
        venus.setId(2);
        venus.setDistanceToTheCentralStart(108.2E9);
        //---------------------------------------------------
        tierra.setName("Tierra");
        tierra.setDensity(5.51);
        tierra.setMass(5.972E24);
        tierra.setDiameter(12742);
        tierra.setId(3);
        tierra.setDistanceToTheCentralStart(149.6E9);
        //---------------------------------------------------
        marte.setName("Marte");
        marte.setDensity(9.93);
        marte.setMass(6.39E24);
        marte.setDiameter(6779);
        marte.setId(4);
        marte.setDistanceToTheCentralStart(227.9E9);
        //---------------------------------------------------
        jupiter.setName("Jupiter");
        jupiter.setDensity(1.326);
        jupiter.setMass(1898E27);
        jupiter.setDiameter(139822);
        jupiter.setId(5);
        jupiter.setDistanceToTheCentralStart(778.5E9);
        //---------------------------------------------------
        planets.add(sun);
        planets.add(mercurio);
        planets.add(venus);
        planets.add(tierra);
        planets.add(marte);
        planets.add(jupiter);
        return planets;
    }

    /**
     * Este metodo calcula la atraccion gravitacional para esto hace el uso
     * de los atributos de los objetos guardados en el Array planets. Primero
     * hace el calculo de la distacia entre los 2 planetas debido a que solo
     * tenemos la distacia de cada planeta hasta el sol. Por lo que debemos hacer
     * la resta de cada distancia al sol y asi obtendremos la distancia que existe
     * entre los 2 objetos.
     *
     * @param id1 identificador del planeta 1
     * @param id2 identificador del planeta 2
     * @return el calculo del la atracción gravitacional
     */
    public double gravitationalForce(int id1,int id2){
        double distance;
        planetaryArray();
        distance=planets.get(id1).getDistanceToTheCentralStart()-planets.get(id2).getDistanceToTheCentralStart();
        return (universalGravitationalConstant)*(planets.get(id1).getMass()*planets.get(id2).getMass()/Math.pow(distance,2));
    }

    /**
     * Metodo para obtener el nombre del planeta segun su número de identificación
     * @param id
     * @return Nombre del planeta
     */
    public String getPlanetName(int id){
        String planet1;
        return planet1=planets.get(id).getName();
    }

    /**
     * Muestra los objetos guardados en el array planets
     */
    public void showObjects(){
        planetaryArray();
        System.out.println(planets.size());
        for (PlanetaryObject p:planets) {
            System.out.println(p.toString()+"\n");
        }

    }

    /**
     * Metodo para obtener el tamaño del array planetas
     * @return el tamanño del array
     */
    public int getArraySize(){
        return planets.size();
    }

}
