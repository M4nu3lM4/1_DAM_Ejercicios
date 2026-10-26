package secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MostrarDoble {
    public static void main(String[] args) {
        float dobleReal;
        float numero;
        System.out.print("Introduce un número: ");
        numero = Entrada.real();
        dobleReal = numero * 2;
        System.out.println("El doble del número real es: " + dobleReal);
    }
}
