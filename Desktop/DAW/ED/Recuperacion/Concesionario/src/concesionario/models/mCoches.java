package Concesionario.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import static concesionario.Concesionario.coches;

/**
 *
 * @author Ripoll
 */
public class mCoches {
       
    // Metodo para escribir los datos del coche en un fichero
       public static void escribir(ArrayList<Coche> coches) {
        Scanner sc = new Scanner(System.in);
        //PIDO PATH POR TECLADO
        System.out.println("Introduce fichero destino datos: ");
        String path = sc.nextLine();
        //DIRECTORIO DONDE ME POSICIONO
        File f = new File(path);
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        //MIENTRAS NO INTRODUZCA UN PATH VALIDO, LO SEGUIRÉ PIDIENDO
        while(!compruebaEscritura(f)) {
                System.out.println("NO ES UN PATH VÁLIDO, INTRODUCE UNO CORRECTO");
                path = sc.nextLine();
                f = new File(path);
        }

        try {
            //Con el parámetro true indicamos que queremos escribir sin borrar el fichero
            fichero = new FileWriter(f, true);
            pw = new PrintWriter(fichero);
            
            //Coche coche = new Coche();
            //coche.leer();
            //leerCoche();
            //coches.add(coche);
            
            for (Coche coche : coches) {
                pw.append(
                        coche.datosParaGuardar() +
                        "\n");
            }
            fichero.close();
            System.out.println("Se terminó de escribir en el fichero");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    // Metodo que carga los datos del fichero en arrayList de coches
    public static void leerFichero() {
        Scanner sc = new Scanner(System.in);
        //PIDO PATH POR TECLADO
        System.out.println("INTRODUCE UN PATH A LEER");
        String path = sc.nextLine();
        //DIRECTORIO DONDE ME POSICIONO
        File f = new File(path);
        FileReader fr = null;
        BufferedReader br = null;

        //MIENTRAS NO INTRODUZCA UN PATH VALIDO, LO SEGUIRÉ PIDIENDO
        while(!pathLectura(f)) {
                System.out.println("NO ES UN PATH VÁLIDO, INTRODUCE UNO CORRECTO");
                path = sc.nextLine();
                f = new File(path);
        }

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea;
            String datos [];
            Coche coche;

            while((linea=br.readLine())!=null) {    
                coche = new Coche();
                datos = linea.split(";");
                
                coche.setMarca((datos[0]));
                coche.setModelo(datos[1]);
                coche.setFechaDeFabricacion(datos[2]);
                coche.setCv(Double.parseDouble(datos[3]));
                coche.setCilindrada(Double.parseDouble(datos[4]));
                coche.setNumeroDePuertas(Integer.parseInt(datos[5]));
                coche.setNumeroDePlazas(Integer.parseInt(datos[6]));
                
                coches.add(coche);
            }
            
            // Comprobamos la lectura del fichero imprimiento el arrayList por pantalla
             for (Coche cocheAux : coches) {
                System.out.println(
                        cocheAux.datosParaGuardar() +
                        "\n");
            }

            fr.close();
            System.out.println("El fichero no contiene mas cosas");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
     
    // Metodo que compruevba el Path 
    public static boolean compruebaEscritura(File f) {
        boolean result = false;

        if(f.exists()) {
            System.out.print("EL path EXISTE ");

            if(f.isDirectory()) {
                //ES UN DIRECTORIO, PINTO SU NOMBRE
                System.out.println(f.getName()+" es una carpeta");
            } else {
                //SI NO ES DIRECTORIO, ES FICHERO, LO PINTO
                System.out.println(f.getName()+" es un fichero");

                if(f.canRead()) {
                    System.out.println(" y se puede LEER.");
                    result = true;
                } else {
                    System.out.println(" PERO NO SE PUEDE LEER!!!");
                }
            }
        } else {
            try {
                f.createNewFile();
                System.out.println("FICHERO CREADO CORRECTAMENTE");
                result = true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return result;
    }
    
     public static boolean pathLectura(File f) {
        boolean result = false;

        if(f.exists()) {
            System.out.print("EL path EXISTE ");

            if(f.isDirectory()) {
                //ES UN DIRECTORIO, PINTO SU NOMBRE
                System.out.println(f.getName()+" es una carpeta");
            } else {
                //SI NO ES DIRECTORIO, ES FICHERO, LO PINTO
                System.out.println(f.getName()+" es un fichero");

                if(f.canRead()) {
                    System.out.println(" Y SE PUEDE LEER");
                    result = true;
                } else {
                    System.out.println(" PERO NO SE PUEDE LEER!!");
                }
            }
        } else {
            System.out.print("El path NO EXISTE!!");
        }

        return result;
    }
       
   
}
