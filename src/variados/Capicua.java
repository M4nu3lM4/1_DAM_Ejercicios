package variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Capicua {
    public static void main(String[] args) {
        int numero;
        int reverso = 0;
        int posicionCifra = 0;
        do {
            System.out.print("Introduce un número mayor que cero: ");
            numero = Entrada.entero();

        } while (numero <= 0);
        while (numero / (int) Math.pow(10, posicionCifra) > 0) {
            reverso = reverso * 10 + numero / (int) Math.pow(10, posicionCifra) % 10;
            posicionCifra++;
        }
        if (reverso == numero){
            System.out.println("El número: "+numero+ " Es capicúa");
        }else {
            System.out.println("El número: "+numero+ "NO es capicúa");
        }
    }
}
