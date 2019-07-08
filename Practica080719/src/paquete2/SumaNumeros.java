package paquete2;

/**
 *
 * @author vysery98
 */
public class SumaNumeros {

    public static int obtenerSumaDos(int valor) {
        // resultado mediante recursividad
        if (valor <= 0) {
            return 0;
        } else {
            return valor + obtenerSumaDos(valor - 1);
        }

    }

    public static int obtenerSumaUno(int valor) {
        // resultado mediante ciclo repetitivo
        int suma = 0;

        for (int i = 1; i <= valor; i++) {
            suma = suma + i;
        }
        return suma;

    }

}
