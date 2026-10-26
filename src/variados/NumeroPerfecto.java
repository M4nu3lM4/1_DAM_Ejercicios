package variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumeroPerfecto {
    public static void main(String[] args) {
        int numero;
        int sumaDivisores = 0;
        do {
            System.out.print("Por favor introduce un número mayor que 0: ");
            numero = Entrada.entero();
        } while (numero <= 0);
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        if (sumaDivisores == numero) {
            System.out.println("El número es perfecto");
        } else {
            System.out.println("El número NO es perfecto");
        }


    }
}
