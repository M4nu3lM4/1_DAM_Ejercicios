package variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumeroCifras {
    public static void main(String[] args) {
        int numero;
        do {
            System.out.println("Introduce un número mayor que 0: ");
            numero = Entrada.entero();
        } while (numero <= 0);

        int numeroCifras = (int) Math.log10(numero) + 1;
        System.out.println("Las cifras del número: " + numero + " son: " + numeroCifras);
    }
}
