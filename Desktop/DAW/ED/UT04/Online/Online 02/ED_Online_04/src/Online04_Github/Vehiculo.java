package Online04_Github;

import java.util.Scanner;

/**
 * Esta clase describe los objetos #Vehiculo y se extendera para todas las 
 * clases que deriven de esta, por lo que recoge los datos básicos de cualquier
 * #Vehiculo, el resto de clases deberan de implementar los datos propios de la
 * misma en funcion del tipo de vehiculo a crear.
 * Los datos propios del objeto #Vehiculo son:
 * <ul>
 *  <li>Marca</li>
 * <li>Modelo</li>
 * <li>fechaDeFabricacion</li>
 * <li>cv</li>
 * <li>cilindrada</li>
 * </ul>
 * 
 * Además cuenta con los siguientes métodos que realizan diferentes funciones:
 * * <ul>
 *  <li>vender</li>
 * <li>leer</li>
 * <li>escribir</li>
 * <li>datosParaGuardar</li>
 * <li>leerFichero</li>
 * </ul>
 * @author Ripoll
 */
public abstract class Vehiculo {
    // Declaramos las variables que vamos a necesitar
    protected String marca, modelo, fechaDeFabricacion;
    protected double cv, cilindrada, km;
    
    // Generamos el constructor
    public Vehiculo() {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.cv = cv;
        this.cilindrada = cilindrada;
    }
    
    // Genereamos los metodos getter y setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(String fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    // Creamos el metodo abstracto vender
    /**
     * Este metodo describe la forma en que se vende un #Vehiculo y será
     * diferente para cada tipo de #Vehiculo
     */
   public abstract void vender();
    /**
     * Este metodo describe la forma en que se lee un #Vehiculo y será
     * diferente para cada tipo de #Vehiculo
     */
   public abstract void leer();
    /**
     * Este metodo describe la forma en en que se estructuran los datos para ser 
     * guardado en el fichero de texto es una forma de dar formato a los datos
     * para ser guardados.
     * @return retorna los datos para ser guardados.
     */
   public abstract String datosParaGuardar();
   /** 
    * Este metodo debe definir la forma en en que los datos para cada tipo 
    * de #Vehiculo han de ser escritos en el fichero de texto.
    */
   public abstract void escribir();
   /**
    * Este metodo debe de describir la forma en que los diferentes #Vehiculo han 
    * de seer leidos desde un fichero de texto para ser cargado de nuevo en un
    * arrayList y sus datos esten disponibles para que el programa pueda hacer 
    * uso de ellos.
    */
   public abstract void leerFichero();
 }
