package juangutierrez.presencial04_ut04;

/**
 *Un objeteo animal se define por tener tres elementos:
 * <ul>
 * <li>patas<li>
 * <li>cola<li>
 * <li>orejas<li>
 * </ul>
 * @author Ripoll
 */
public abstract class Animales {

    private int patas;
    private int cola;
    private int orejas;
    /**
     * El constructor de la clase.
     * Crea un objeto Animal a partir de los tre elementos mencionados.
     * @param patas los animales tienen patas
     * @param cola los animales mueven la cola
     * @param orejas no todos los animales tiene orejas
     * Estos parametros se aplican para todos los animales del tipo que sean
     */
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

    /** 
     * Este metodo indica el sonido que emite el animal
     */
    abstract public void emitirSonido();
    
     /** 
     * Este metodo indica la alimentación que tiene el animal
     */
    abstract public void alimentarse();
    
     /** 
     * Este metodo indica el mode en que se aparea el animal
     */
    abstract public void aparearse();

}
