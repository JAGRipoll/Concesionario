package Online04_Github;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Esta clase nos sirve para implementar objetos #Coche que se extiende de 
 * la clase @Vehiculo ademas de las variables propias de la clase para guardar
 * la información inclye metodos propios y heredados para leer por pantalla los
 * datos de objeto #Moto, imprimir así como metodos para escribir los datos en 
 * un archivo o realizar ventas del obejto.
 * 
 * El objeto @Coche además de los propios del @Vehiculo incorpora datos propios 
 * de su claso en concreto:
 * <ul>
 * <li>numeroPuerta</li>
 * <li>numeroPlazas</li>
 * </ul>
 * 
 * Además de implementar los metodos heredadod de @Vehiculo tambien implementa
 * dos metodos propios de la clase que son:
 *  <ul>
 *  <li>#compruebaEscritura</li>
 *  <li>#pathLectura</li>
 * </ul>
 * 
 * @author Ripoll
 */
public class Coche extends Vehiculo {
    //Cramos el objero sc para realizar la lectura de las variables
    private static Scanner sc = new Scanner (System.in);
    
     // Declaramos el arrayCoches de objetos Coche
        ArrayList<Coche> coches = new ArrayList<Coche>();
    
    int numeroDePuertas, numeroDePlazas;
 
    
    public Coche(){
        super();
    
    }
    /**
     * Este metodo es el constructos del objeto #Coche
     * @param numeroDePuertas, describe el numero de puertas de #Coche,
     * @param numeroDePlazas, describe el número de plazas del #Vehiculo
     * @param combustible, describe el tipo de combustible que usa #Coche.
     */
    public Coche(int numeroDePuertas, int numeroDePlazas, String combustible) {
        this.numeroDePuertas = numeroDePuertas;
        this.numeroDePlazas = numeroDePlazas;
        
    }
    
    public int numeroDePuertas(){
        return numeroDePuertas;
    }
    /**
     * Este metodo sirve para definir el número de puertas del objeto #Coche
     * @param numeroDePuertas 
     */
    public void setNumeroDePuertas(int numeroDePuertas){
        this.numeroDePuertas = numeroDePuertas;
    }
    
    public int numeroDePlazas(){
        return numeroDePlazas;
    }
    /**
     * Este metodo sirve para aplicar el número de plaza al obejto #Coche
     * @param numeroDePlazas 
     */
    public void setNumeroDePlazas(int numeroDePlazas){
        this.numeroDePlazas = numeroDePlazas;
    }
    /**
     * Este metodo describe el proceso de venta de un #Coche
     */
    @Override
    public void vender(){
        System.out.println("Hemos vendidio el coche.");
    }
    /**
     * Con este metodo lo que hacemos es pedir los datos que van a componer 
     * nuestro objeto coche, de este modo llamaremos a este metodo para 
     * cada vez que necesitemos crear un objeto #Coche
     */
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
    /**
     * Utilizamos este metodo para imprimir es obejto Coche#Coche
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
        datos+= this.numeroDePuertas + ";";
        datos+= this.numeroDePlazas;
	
	return datos;
    }
    // Metodo para escribir los datos del coche en un fichero
     /**
     * Este metodo escribte los datos del arrayList en un fichero de texto,
     * usando una linea para cada objeto #Coche del arrayList
     */
     @Override
       public void escribir() {
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
            
            Coche coche = new Coche();
            coche.leer();
            coches.add(coche);
            
            for (Coche cocheAux : coches) {
                pw.append(
                        cocheAux.datosParaGuardar() +
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
      /**
     * Este metodo se implementa para hacer la lectura del fichero pasando los 
     * datos a un arrayList de manera que sean cargado en el programa para su 
     * uso de un objeto @see Coche#Coche(String, String, String, String, String, String)
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
    /**
     * Este metodo solicita un path donde almacenar la infomracion de #Coche
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
