package condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;

        System.out.print("Introduce el primer número: ");
        numero1 = Entrada.entero();

        System.out.print("Introduce el segundo número: ");
        numero2 = Entrada.entero();

        System.out.print("Introduce el tercer número: ");
        numero3 = Entrada.entero();

        if (numero1 > numero2 && numero2 > numero3) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero1 + " , " + numero2 + " , " + numero3);
        } else if (numero1 > numero3 && numero3 > numero2) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero1 + " , " + numero3 + " , " + numero2);
        } else if (numero2 > numero1 && numero1 > numero3) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero2 + " , " + numero1 + " , " + numero3);
        } else if (numero2 > numero3 && numero3 > numero1) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero2 + " , " + numero3 + " , " + numero1);
        } else if (numero3 > numero1 && numero1 > numero2) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero3 + " , " + numero1 + " , " + numero2);
        } else {
            System.out.println("Los números ordenados de mayor a menor son: " + numero3 + " , " + numero2 + " , " + numero1);
        }
    }
}
