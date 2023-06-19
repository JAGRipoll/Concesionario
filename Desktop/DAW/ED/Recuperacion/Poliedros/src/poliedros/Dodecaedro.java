package poliedros;

/**
 *
 * @author Ripoll
 */
public class Dodecaedro {
    
    private double arista;

    Dodecaedro(double arista) {
        this.arista = arista;
    }

    public double area() {
        return (3 * Math.pow(arista, 2)) * Math.sqrt(25 + 10 * Math.sqrt(5));
    }

    public double volumen() {
        return (Math.pow(arista, 3) / 4) * (15 + 7 * Math.sqrt(5));
    }

    public String toStringDodecaedro() {
        return "El área del dodecaedro es: " + String.format("%.3f", this.area()) + " El volumen es: " + String.format("%.3f", this.volumen());
    }
    
}
