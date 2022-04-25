/**
 * En esta clase se modela los diferentes atributos que debe tener cada objeto planetario.
 * Necesarios para calcular los atracción gravitacional
 *
 */
public class  PlanetaryObject {
    private String name;
    private double density, diameter, mass, distanceToTheCentralStart;
    protected int id;

    @Override
    public String toString() {
        return "-----------------------------------\n" +
                "Número de Identificacíon Planetaria =" + id +
                "\nNombre ='" + name + '\'' +
                "\nDensidad = " + density + "g/cm3"+
                "\nDiametro = " + diameter + "Km"+
                "\nMasa = " + mass + "Kg"+
                "\nDistancia al Sol = " + distanceToTheCentralStart +"Kilometros";
    }

    /**
     * Metodos Getters y Setters
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDistanceToTheCentralStart() {
        return distanceToTheCentralStart;
    }

    public void setDistanceToTheCentralStart(double distanceToTheCentralStart) {
        this.distanceToTheCentralStart = distanceToTheCentralStart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
