package repetitivas;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MediaNumeros {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int cantidadNumeros = 0;
        float media;

        do {
            System.out.print("Introduce un número: ");
            numero = Entrada.entero();
            if (numero != 0) {
                cantidadNumeros++;
            }
            suma += numero;
        } while (numero != 0);

        if (cantidadNumeros == 0) {
            System.out.println("No puedo hacer la media, porque no hay números para hacerla.");
        } else {
            media = ((float) suma / cantidadNumeros);
            System.out.println("La media de los números es: " + media);
        }


    }
}
