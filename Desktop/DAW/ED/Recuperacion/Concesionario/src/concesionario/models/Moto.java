package Concesionario.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ripoll
 */
public class Moto extends Vehiculo {
        //Cramos el objero sc para realizar la lectura de las variables
        Scanner sc = new Scanner(System.in);
  public Moto (){
      super();
  }
    @Override
    public void vender(){
        System.out.println("Hemos vendidio la moto.");
    }
    // Metodo que lee los elementos de una moto
    @Override
    public void leer() {
      System.out.print("Introduzca la marca de la moto: ");
      marca = sc.nextLine();
      System.out.print("Introduzca el modelo de la moto: ");
      modelo = sc.nextLine();
      System.out.print("Introduzca la fecha de fabricacion: ");
      fechaDeFabricacion = sc.nextLine();
      System.out.print ("Indique el numero de caballos de la moto: ");
      cv = sc.nextDouble();
      System.out.print("Indique la cilindrada de la moto: ");
      cilindrada = sc.nextDouble();
      System.out.print("Indique el kilometraje de la moto: ");
      km = sc.nextDouble();
    }
    
    public String datosParaGuardar(){
	String datos ="";
	
        datos+= this.marca + ";";
        datos+= this.modelo + ";";
        datos+= this.fechaDeFabricacion + ";";
        datos+= this.cv + ";";
        datos+= this.cilindrada + ";";
        datos+= this.km;
	
	return datos;
    }
 
 
}
