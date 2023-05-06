package Online04_Github;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Esta clase nos sirve para implementar objetos #Moto que se extiende de 
 * la clase @Vehiculo ademas de las variables propias de la clase para guardar
 * la información inclye metodos propios y heredados para leer por pantalla los
 * datos de objeto #Moto, imprimir así como metodos para escribir los datos en 
 * un archivo o realizar ventas del obejto.
 * 
 * En esta caso #Moto solo esta compuesta de componentes definidos en la clase
 * @Vehiculo, por lo que no incorpora datos propios, además aplica los métodos 
 * heredados de la clase padre.
 * Si añade dos metodos propios que se utilizan para comprobar el destino del 
 * fichero de texto y la lectura del mismo estos metos son:
 * <ul>
 *  <li>#compruebaEscritura</li>
 *  <li>#pathLectura</li>
 * </ul>
 * 
 * En esta clase tambien de declara el arrayList @see que contendra los objetos coche
 * durante la ejecución del programa, estos datos se pueden guradar y leer desde
 * un archivo definido por el usuario para la ejecucion del programa.
 * @author Ripoll
 */
public class Moto extends Vehiculo {
        //Cramos el objero sc para realizar la lectura de las variables
        Scanner sc = new Scanner(System.in);
  public Moto (){
      super();
  }
  /**
   * Este metodo es un metodo que incluye vender una #Moto
   */
    @Override
    public void vender(){
        System.out.println("Hemos vendidio la moto.");
    }
    // Metodo que lee los elementos de una moto
    /**
     * Con este metodo lo que hacemos es pedir los datos que van a componer 
     * nuestro objeto coche, de este modo llamaremos a este metodo para 
     * cada vez que necesitemos crear un objeto #Moto
     */
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
    /**
     * Utilizamos este metodo para imprimir es obejto Moto#Moto()
     * @return , retorna todo los elementos del obejeto para ser escritos en el 
     * archivo.
     */
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
    /**
     * Este metodo escribte los datos del arrayList en un fichero de texto,
     * usando una linea para cada objeto #Moto del arrayList
     */
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
    /**
     * Este metodo se implementa para hacer la lectura del fichero pasando los 
     * datos a un arrayList de manera que sean cargado en el programa para su 
     * uso de un objeto @see Moto#Moto(String, String, String, String, String, String)
     */
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
    /**
     * Este metodo solicita un path donde almacenar la infomracion de #Moto
     * @param f es el parametro solicitado y se corresponde con el archivo de destino,
     * el metodo comprueba si existe el destino, si es una carpeta o un archivo, en caso 
     * de existir comprueba que el archivo se puede leer, si no existe crea el archivo
     * una vez realizadas las comprobaciones mediante
     * @return , devuelve un valor true indicando que el archivo existe y se puede leer.
     */
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
    
    /**
     * Al igual que el anteriro este metodo realiza la comprobación del parametro
     * @param f introducido comprueba si el path es una carpeta, o un archvo y
     * si es posible leer de el tra lo cual devuelve
     * @return , con valor true indicando que el archivo existe y se puede leer,
     * si no existe devuelve un mensaje y @return con valor false.
     */
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
