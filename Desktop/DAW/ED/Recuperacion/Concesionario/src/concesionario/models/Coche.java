package Concesionario.models;

import java.util.Scanner;
/**
 *
 * @author Ripoll
 */
public class Coche extends Vehiculo {
    //Cramos el objero sc para realizar la lectura de las variables
    private static Scanner sc = new Scanner (System.in);
    
        // Declaramos el arrayCoches de objetos Coche
        //  ArrayList<Coche> coches = new ArrayList<Coche>();
    
    int numeroDePuertas, numeroDePlazas;
 
    
    public Coche(){
        super();
    
    }

    public Coche(int numeroDePuertas, int numeroDePlazas, String combustible) {
        this.numeroDePuertas = numeroDePuertas;
        this.numeroDePlazas = numeroDePlazas;
        
    }
    
    public int numeroDePuertas(){
        return numeroDePuertas;
    }
    public void setNumeroDePuertas(int numeroDePuertas){
        this.numeroDePuertas = numeroDePuertas;
    }
    
    public int numeroDePlazas(){
        return numeroDePlazas;
    }
    public void setNumeroDePlazas(int numeroDePlazas){
        this.numeroDePlazas = numeroDePlazas;
    }
    
    @Override
    public void vender(){
        System.out.println("Hemos vendidio el coche.");
    }
    @Override
    public void leer() {
        System.out.println("Ingrese los datos del coche:");
        System.out.print("Marca: ");
        this.setMarca(sc.nextLine());
        System.out.print("Modelo: ");
        this.setModelo(sc.nextLine());
        System.out.print("Fecha de fabricación: ");
        this.setFechaDeFabricacion(sc.nextLine());
        System.out.print("CV: ");
        this.setCv(sc.nextDouble());
        System.out.print("Cilindrada: ");
        this.setCilindrada(sc.nextDouble());
        System.out.print("Número de puertas: ");
        this.setNumeroDePuertas(sc.nextInt());
        System.out.print("Número de plazas: ");
        this.setNumeroDePlazas(sc.nextInt());
    }
    
    // Modificar para ajustar a proyecto
    public String datosParaGuardar(){
	String datos ="";
	
        datos+= this.marca + ";";
        datos+= this.modelo + ";";
        datos+= this.fechaDeFabricacion + ";";
        datos+= this.cv + ";";
        datos+= this.cilindrada + ";";
        datos+= this.numeroDePuertas + ";";
        datos+= this.numeroDePlazas;
	
	return datos;
    }
 
     
}
