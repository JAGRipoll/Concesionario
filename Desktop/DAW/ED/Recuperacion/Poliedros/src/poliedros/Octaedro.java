/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliedros;

/**
 *
 * @author Ripoll
 */
public class Octaedro {
    
    private double arista;

    Octaedro(double arista) {
        this.arista = arista;
    }

    public double area() {
        return (2 * Math.pow(arista, 2)) * Math.sqrt(3);
    }

    public double volumen() {
        return (Math.pow(arista, 3) * Math.sqrt(2)) / 3;
    }

    public String toStringOctaedro() {
        return "El área del octaedro es: " + String.format("%.3f", this.area()) + " El volumen es: " + String.format("%.3f", this.volumen());
    }
    
}
