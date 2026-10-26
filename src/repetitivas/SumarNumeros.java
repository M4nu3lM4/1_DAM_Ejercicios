package repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class SumarNumeros {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        do {
            System.out.print("Introduce un número: ");
            numero = Entrada.entero();
            suma += numero;
        } while (numero != 0);
        System.out.println("La suma de los números es: " + suma);
    }


}
