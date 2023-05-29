package juangutierrez.presencial04_ut04;

/**
 *
 * @author Ripoll
 */
public class Perro extends Animales {

        /**
         * Este constructor indica los elmentos o atributos que componene un 
         * perro, que hereda los elementos de animal.
         * @param patas las patas del perro con muy fuertes
         * @param cola el perro menea la cola
         * @param orejas el perro escucha muy bien
         * En este caso no añade ningun elemento más
         */
    public Perro(int patas, int cola, int orejas) {
        super(patas, cola, orejas);
    }
       
    /**
     * Metod que descrive el sonido de un perro
     */
    @Override
      public void emitirSonido() {
        System.out.println("Ladrar!!");
    }
      /**
       * Metod que describe la alimentación del perro
       */
    @Override
    public void alimentarse() {
        System.out.println("Croquetas, salpicon, morcilla, kebab");
    }

    /**
     * Metodo que indica como se aparea un perro
     */
    @Override
    public void aparearse() {
        System.out.println("Bailar, olfatear y mover la cola");
    }
}
