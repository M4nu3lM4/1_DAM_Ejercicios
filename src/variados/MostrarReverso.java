package variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MostrarReverso {
    public static void main(String[] args) {
        int numero;
        int reverso = 0;
        do {
            System.out.print("Introduce un número mayor que cero: ");
            numero = Entrada.entero();
        } while (numero <= 0);
        while (numero > 0) {
            reverso = reverso * 10 + numero % 10;
            numero /= 10;
        }
        System.out.println("El reverso es: " + reverso);
    }
}
