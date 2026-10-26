package repaso;

import org.iesalandalus.programacion.utilidades.Entrada;

public class PiramideIzquierdaInvertida {
    public static void main(String[] args) {
        int filas;

        do {
            System.out.println("Introduce un número de filas: ");
            filas = Entrada.entero();
        } while (filas < 0);

        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
