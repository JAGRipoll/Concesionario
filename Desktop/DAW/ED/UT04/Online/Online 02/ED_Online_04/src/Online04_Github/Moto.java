package Online04_Github;

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
    
    @Override
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
 
    // Metod para escribir los datos de motos en el fichero
    @Override
    public void escribir() {
        Scanner sc = new Scanner(System.in);
        //PIDO PATH POR TECLADO
        System.out.println("Introduce fichero de escritura: ");
        String path = sc.nextLine();
        //DIRECTORIO DONDE ME POSICIONO
        File f = new File(path);
        FileWriter fichero = null;
        PrintWriter pw = null;

        ArrayList<Moto> motos = new ArrayList<Moto>();
        
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
            
            Moto moto = new Moto();
            moto.leer();
            motos.add(moto);
            
            for (Moto motoAux : motos) {
                pw.append(
                        motoAux.datosParaGuardar() +
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
    
    // Metodo para leer los datos del fichero
    @Override
    public void leerFichero() {
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
            ArrayList<Moto> motos = new ArrayList<Moto>();
            Moto moto;

            while((linea=br.readLine())!=null) {    
                moto = new Moto();
                datos = linea.split(";");
                
                moto.setMarca((datos[0]));
                moto.setModelo(datos[1]);
                moto.setFechaDeFabricacion(datos[2]);
                moto.setCv(Double.parseDouble(datos[3]));
                moto.setCilindrada(Double.parseDouble(datos[4]));
                moto.setKm(Double.parseDouble(datos[5]));
                
                motos.add(moto);
            }
            
            // Comprobamos la lectura del fichero imprimiento el arrayList por pantalla
             for (Moto motoAux : motos) {
                System.out.println(
                        motoAux.datosParaGuardar() +
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
    
    //Metodo para comprobar el path
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
