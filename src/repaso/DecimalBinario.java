package repaso;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DecimalBinario {
    public static void main(String[] args) {
        int numero;
        int cociente = 0;
        int i = 0;
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            numero = Entrada.entero();
        }while(numero < 0);

        do {
            cociente = (numero % 2) * (int) Math.pow(10,i) + cociente;
            numero = numero / 2;
            i++;
        }while (numero > 0);
        System.out.println("El número en binario es: " +cociente);
    }
}
