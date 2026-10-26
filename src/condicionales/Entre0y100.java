package condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Entre0y100 {
    public static void main(String[] args) {
        float numero;
        System.out.print("Introduce un número: ");
        numero = Entrada.real();
        if (numero >= 0 && numero <= 100) {
            System.out.println("El número: " + numero + " esta entre 0 y 100");
        } else {
            System.out.println("El número: " + numero + "  No esta entre 0 y 100");
        }
    }
}
