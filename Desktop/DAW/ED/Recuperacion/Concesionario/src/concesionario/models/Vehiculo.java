package Concesionario.models;

import java.util.Scanner;

/**
 *
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
   public abstract void vender();
   public abstract void leer();
   
 }
