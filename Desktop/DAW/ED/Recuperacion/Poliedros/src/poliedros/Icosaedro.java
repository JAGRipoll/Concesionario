/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliedros;

/**
 *
 * @author Ripoll
 */
public class Icosaedro {
    
    private double arista;

    Icosaedro(double arista) {
        this.arista = arista;
    }

    public double area() {
        return (5 * Math.pow(arista, 2)) * Math.sqrt(3);
    }

    public double volumen() {
        return ((3 + Math.sqrt(5)) * 5 / 12) * Math.pow(arista, 3);
    }

    public String toStringIcosaedro() {
        return "El área del icosaedro es: " + String.format("%.3f", this.area()) + " El volumen es: " + String.format("%.3f", this.volumen());
    }
    
}
