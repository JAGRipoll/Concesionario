package juangutierrez.presencial04_ut04;
/**
 *
 * @author Ripoll
 */
public class Iguana extends Animales {

    int escamas;
    /**
     * Este animal hereda de la superclase todos los elementos comunes a todos los animales.
     * @param patas la iguana tiene garras en sus patas
     * @param cola la cola es muy larga
     * @param orejas la iguana no tiene orejas
     * En este acaso además añade un elemento distintivo como son las escamas.
     * @param escamas la piel es escamosa y fria
     */
    public Iguana(int patas, int cola, int orejas, int escamas) {
        super(patas, cola, orejas);
    }

    /**
     * Indica el sonido que emite la iguana
     */
    @Override
    public void emitirSonido() {
        System.out.println("waaaaaaaa");
    }
     /** 
     * Este metodo indica la dieta que sigue la iguana
     */
    @Override
    public void alimentarse() {
        System.out.println("Langostinos, insecos, fuet");
    }
     /** 
     * Este metodo indica como se reproduce la iguana.
     */
    @Override
    public void aparearse() {
        System.out.println("Pavonearse y mover la cola");
    }
}
