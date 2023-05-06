package Online04_Github;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta el la clase principal del program donde se encuentra el metodo main
 * en esta clase mediante la impresión de un menú se ofrece al usuario los 
 * distintos procesos que puede realizar con el programa:
 * <ol>
 * <li>Añadir coche al fichero</li>
 * <li>Leer datos de coche desde el fichero.</li>
 * <li>Añadir motos al fichero</li>
 * <li>Leer datos de motos desde el fichero</li>
 * <li>Vender Coches</li>
 * <li>Vemnder Motos</li>
 * <li>Salir</li>
 * </ol>
 * 
 * Mediante el uso de un switch se realiza el menú que hara llamadas a los
 * diferentes metodos de las diferentes clases en funcion de la opcion 
 * seleccionada.
 * 
 * En esta clase se crean los arrayList de @Coche y @Moto para la ejecución
 * del programa, estos arrayList contendran la información de los objetos creados
 * que será volcada y leidad desde los ficheros indicados por el usuario.
 * 
 * @author Ripoll
 */
public class Ejercicio_8 {
     public static void main(String args[]){
        //Cramos el objero sc para realizar la lectura de las variables
        Scanner sc = new Scanner(System.in);
        
         // Declaramos el arrayCoches de objetos Coche
        ArrayList<Coche> coches = new ArrayList<Coche>();
        Coche coche = new Coche();
        // Declaramos un arrrayMots de objetos moto
        ArrayList<Moto> motos = new ArrayList<Moto>();
        Moto moto = new Moto();
        // Declaramos e iniciamos 
        int op=9;

        do {
            // Mostramos las opcones del menu
            System.out.println("Seleccione una opción.");
            System.out.println("===================");
            System.out.println("1.- Añadir coche al fichero.");
            System.out.println("2.- Leer fichero de coches.");
            System.out.println("3.- Añadir motos al fichero.");
            System.out.println("4.- Leer fichero de motos");
            System.out.println("5.- Vender un coche.");
            System.out.println("6.- Vender una moto");
            System.out.println("7.- Salir.");
            op = sc.nextInt();

            switch (op) {
                case 1:        
                    coche.escribir();
                    break;
                case 2:
                    coche.leerFichero();
                    break;
                case 3:
                    moto.escribir();
                    break;
                case 4:
                    moto.leerFichero();
                    break;
                case 5:
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
                case 6:
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
                case 7:
                    System.out.println("¡Saliendo...!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (op != 7);
        sc.close();
    }   
}
