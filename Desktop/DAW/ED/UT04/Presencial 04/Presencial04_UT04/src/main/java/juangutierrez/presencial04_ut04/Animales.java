package juangutierrez.presencial04_ut04;
/**
 *
 * @author Ripoll
 */
public abstract class Animales {
    
    private int patas;
    private int cola;
    private int orejas;

    public Animales(int patas, int cola, int orejas) {
        this.patas = patas;
        this.cola = cola;
        this.orejas = orejas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public int getOrejas() {
        return orejas;
    }

    public void setOrejas(int orejas) {
        this.orejas = orejas;
    }
    

    abstract public void emitirSonido();

    abstract public void alimentarse();

    abstract public void aparearse();
    
}
