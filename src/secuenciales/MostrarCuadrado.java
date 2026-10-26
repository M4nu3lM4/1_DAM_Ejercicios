package secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MostrarCuadrado {
    public static void main(String[] args) {
        double numero;
        double cuadradoNumero;
        System.out.print("Introduce un número: ");
        numero = Entrada.realDoble();
        cuadradoNumero = numero * numero;
        System.out.println("El cuadrado del número es: " + cuadradoNumero);
    }
}
