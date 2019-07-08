package paquete3;

/**
 *
 * @author vysery98
 */
public class Potencia {

    public static int get_potencia(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {

            return base * get_potencia(base, exponente - 1);
        }
    }

// Ejecutar un ejemplo con base = 2; exponente = 4
}
