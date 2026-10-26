package condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class ValorAbsoluto {
    public static void main(String[] args) {

        int numero;
        int valorAbsoluto;

        System.out.print("Introduce un número: ");
        numero = Entrada.entero();

        if (numero < 0) {
            valorAbsoluto = numero * (-1);
        } else {
            valorAbsoluto = numero;
        }
        System.out.println("El valor absoluto del número: " + numero + " es: " + valorAbsoluto);
    }
}
