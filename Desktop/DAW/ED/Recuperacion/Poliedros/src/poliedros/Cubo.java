/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliedros;

/**
 *
 * @author Ripoll
 */
public class Cubo {
    
   private double arista;

   Cubo(double arista){
       this.arista = arista;
   }
    
    public double area() {
        return Math.pow(arista, 2) * 6;        
    }

    public double volumen() {
        return Math.pow(arista, 3);
    }

    public String toStringCubo() {
        return "El área del cubo es: " + String.format("%.3f", this.area()) + " El volumen es: " + String.format("%.3f", this.volumen());
    }
    
}
