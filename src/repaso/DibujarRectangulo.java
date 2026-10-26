package repaso;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DibujarRectangulo {
    public static void main(String[] args) {
        int filas;
        int columnas;

        System.out.print("Introduce el número de filas: ");
        filas = Entrada.entero();

        System.out.print("Introduce el número de columnas: ");
        columnas = Entrada.entero();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {

                if (i == 1 || i == filas || j == 1 || j == columnas) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
