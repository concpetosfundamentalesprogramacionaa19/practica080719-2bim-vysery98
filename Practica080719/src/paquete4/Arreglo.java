package paquete4;

/**
 *
 * @author vysery98
 */
public class Arreglo {

    /*
    Realizar una prueba del método obtenerTamanioArreglo con los valores
    {10, 20, 30, 1, 2, 3, 40, 4}; además crear un método con un ciclo repetitivo que
    permita obtener el mismo resultado del método recursivo
     */
    public static int obtenerTamanioArreglo(int arreglo[], int tamanio) {
        // resultado con recursividad
        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + obtenerTamanioArreglo(arreglo,
                    tamanio - 1);
        }

    }

    public static int obtenerTamanioArregloDos(int arreglo2[], int tamanio) {
        // resultado con ciclo repetitivo
        int tamanioarr = 0;

        for (int i = 0; i < tamanio; i++) {
            tamanioarr = tamanioarr + arreglo2[i];
        }

        return tamanioarr;

    }

}
