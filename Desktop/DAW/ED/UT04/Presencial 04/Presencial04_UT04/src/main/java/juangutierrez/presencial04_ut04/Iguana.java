package juangutierrez.presencial04_ut04;
/**
 *
 * @author Ripoll
 */
public class Iguana extends Animales {
    
    int patas; 

    public Iguana(int patas, int cola, int orejas) {
        super(patas, cola, orejas);
    }
    
    @Override
    public void emitirSonido() {
        System.out.println("waaaaaaaa");
    }


    @Override
    public void alimentarse() {
        System.out.println("Langostinos, insecos, fuet");
    }

    @Override
    public void aparearse() {
        System.out.println("Pavonearse y mover la cola");
    }
}
