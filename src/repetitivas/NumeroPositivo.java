package repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class NumeroPositivo {
    public static void main(String[] args) {
        int numero;
        do {
            System.out.print("Introduce un número mayor que 0: ");
            numero = Entrada.entero();
        } while (numero <= 0);
        System.out.println("El número: " + numero + " es positivo");
    }
}
