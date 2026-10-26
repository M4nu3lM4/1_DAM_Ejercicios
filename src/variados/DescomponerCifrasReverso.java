package variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DescomponerCifrasReverso {
    public static void main(String[] args) {
        int numero;
        
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            numero = Entrada.entero();
        }while(numero <= 0);

        int numeroCifras = (int) Math.log10(numero) + 1;

        for (int i = 0; i < numeroCifras ; i++) {
            int cifra = numero / (int) Math.pow(10, i) % 10;
            System.out.println("La cifra que ocupa la posición: " + i + " es: " + cifra);
        }
    }
}
