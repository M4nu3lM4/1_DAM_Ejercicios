package condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class OrdenarDosNumeros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        System.out.print("Introduce el primer número: ");
        numero1 = Entrada.entero();
        System.out.print("Introduce el segundo número: ");
        numero2 = Entrada.entero();

        if (numero1 > numero2) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero1 + " , " + numero2);
        } else {
            System.out.println("Los números ordenados de mayor a menor son: " + numero2 + " , " + numero1);
        }
    }
}
