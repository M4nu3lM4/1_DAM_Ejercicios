package repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class TablasMultiplicar {
    public static void main(String[] args) {
        int numero;
        System.out.print("Introduce un número: ");
        numero = Entrada.entero();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " * "+ i + " = " + numero * i);
        }
    }
}
