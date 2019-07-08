package paquete4;

/**
 *
 * @author vysery98
 */
public class Principal {

    public static void main(String[] args) {

        // arreglo a enviar como parámetro a método en Arreglo
        int[] A = {10, 20, 30, 1, 2, 3, 40, 4};

        int arreglo = Arreglo.obtenerTamanioArreglo(A, A.length);
        System.out.printf("Tamaño(Recursividad) = %d\n", arreglo);

        int arreglo2 = Arreglo.obtenerTamanioArregloDos(A, A.length);
        System.out.printf("Tamaño(Ciclo Repetitivo) = %d\n", arreglo2);

    }

}
