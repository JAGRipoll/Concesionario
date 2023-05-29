package juangutierrez.presencial04_ut04;

/**
 *
 * @author Ripoll
 */
public class Perro extends Animales {

    public Perro(int patas, int cola, int orejas) {
        super(patas, cola, orejas);
    }

    
    @Override
      public void emitirSonido() {
        System.out.println("Ladrar!!");
    }

    @Override
    public void alimentarse() {
        System.out.println("Croquetas, salpicon, morcilla, kebab");
    }

    @Override
    public void aparearse() {
        System.out.println("Bailar, olfatear y mover la cola");
    }
}
