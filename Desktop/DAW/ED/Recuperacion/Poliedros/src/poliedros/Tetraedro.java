package poliedros;

/**
 *
 * @author Ripoll
 */
public class Tetraedro {
    
    private double arista;

    Tetraedro(double arista) {
        this.arista = arista;
    }

    public double area() {
        return Math.pow(arista, 2) * Math.sqrt(3);
    }

    public double volumen() {
        return (Math.pow(arista, 3) * Math.sqrt(2)) / 12;
    }

    public String toStringTetraedro() {
        return "El área del tetraedro es: " + String.format("%.3f", this.area()) + " El volumen es: " + String.format("%.3f", this.volumen());
    }
    
}
