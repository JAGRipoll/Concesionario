package juangutierrez.presencial04_ut04;

/**
 *
 * @author Ripoll
 */
public class Presencial04_UT04 {

    public static void main(String[] args) {
        Iguana iguana1 = new Iguana(4,1,0);
        Perro perro1 = new Perro(4,1,2);
       
        perro1.emitirSonido();
        iguana1.emitirSonido();
        
    }
}
