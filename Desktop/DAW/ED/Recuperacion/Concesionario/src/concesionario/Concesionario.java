package concesionario;

import Concesionario.models.Moto;
import Concesionario.models.Coche;
import concesionario.frames.DatosCoche;
import concesionario.frames.DatosMoto;
import concesionario.frames.LeerDatosMoto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import Concesionario.models.mCoches;
import Concesionario.models.mMotos;








/**
 *
 * @author Ripoll
 */
public class Concesionario {
         public static ArrayList<Moto> motos = new ArrayList<Moto>();
         
         public ArrayList<Moto> getMotos(){
             return motos;
         }
         
         public void setMotos(ArrayList<Moto> motos){
             this.motos=motos;
         }
         
         public static ArrayList<Coche> coches = new ArrayList<Coche>();
         
         public ArrayList<Coche> getCoches(){
             return coches;
         }
         
         public void setCoches (ArrayList<Coche> coches) {
             this.coches=coches;
         }
         
     public static void main(String args[]){
        //Cramos el objero sc para realizar la lectura de las variables
        Scanner sc = new Scanner(System.in);
        
        //Coche coche = new Coche();       
        //Moto moto = new Moto();
        Coche coche;
        Moto moto;
    
        // Declaramos e iniciamos 
        int op=9;

        do {
            // Mostramos las opcones del menu
            System.out.println("Seleccione una opción.");
            System.out.println("===================");
            System.out.println("1.- Añadir coche.");
            System.out.println("2.- Escribir fichero de coches.");
            System.out.println("3.- Leer fichero de coches.");
            System.out.println("4.- Añadir motos.");
            System.out.println("5.- Escribir fichero de motos");
            System.out.println("6.- Leer fichero de motos");
            System.out.println("7.- Vender un coche.");
            System.out.println("8.- Vender una moto");
            System.out.println("9.- Salir.");
            op = sc.nextInt();

            switch (op) {
                case 1:       
                    leerCoche();
                    break;
                case 2:
                    mCoches.escribir(coches);
                    break;
                case 3:
                    //moto.escribir();
                    //leerMoto();
                    mCoches.leerFichero();
                    break;
                case 4:
                    leerMoto();
                    break;
                case 5:
                    mMotos.escribir(motos);
                    break;
                case 6:
                    mMotos.leerFichero();
                    //moto.leerFichero();
                    break;
                case 7:
                     System.out.println("Ingrese el ID del cohe a vender: ");
                    int idCoche = sc.nextInt();
                    sc.nextLine();
                    if (idCoche >= 0 && idCoche < coches.size()) {
                        Coche cocheVendido = coches.get(idCoche);
                        cocheVendido.vender();
                        coches.remove(idCoche);
                        System.out.println("Coche vendido y eliminada de la lista de coches.");
                    } else {
                        System.out.println("ID de coche no válido. Intente de nuevo.");
                    }
                    break;
                case 8:
                     System.out.println("Ingrese el ID  de la moto a vender: ");
                    int idMoto = sc.nextInt();
                    sc.nextLine();
                    if (idMoto >= 0 && idMoto < motos.size()) {
                        Moto motoVendida = motos.get(idMoto);
                        motoVendida.vender();
                        motos.remove(idMoto);
                        System.out.println("Moto vendida y eliminada de la lista de motos.");
                    } else {
                        System.out.println("ID de moto no válido. Intente de nuevo.");
                    }
                    break;
                case 9:
                    System.out.println("¡Saliendo...!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (op != 9);
        sc.close();
    }   
     private static void leerMoto(){
        Moto moto = new Moto();
        DatosMoto datosMoto = new DatosMoto(moto);
        datosMoto.setVisible(true);
       
        motos.add(moto);
     }
     
      public static void leerCoche(){
         Coche coche = new Coche();
         DatosCoche datosCoche = new DatosCoche(coche);
         datosCoche.setVisible(true);
         
         coches.add(coche);
     }
      
}
