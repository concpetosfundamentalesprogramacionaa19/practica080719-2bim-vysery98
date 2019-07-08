package clase07;

/**
 *
 * @author vysery98
 */
public class NuevaClase {

    public static void metodoUno() {

        System.out.println("Imprimiendo");
        metodoUno();

        // No se limita la recursividad, da error.
    }
}
