package repaso;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DibujarPiramide {
    public static void main(String[] args) {
        int altura;

        System.out.print("Introduce la altura de la pirámide: ");
        altura = Entrada.entero();


        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
