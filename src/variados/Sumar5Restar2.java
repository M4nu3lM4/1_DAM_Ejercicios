package variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Sumar5Restar2 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int aux;

        do {
            System.out.println("Introduce el primer número: ");
            numero1 = Entrada.entero();
        }while (numero1 < 0 || numero1 > 50);

        do {
            System.out.println("Introduce el segundo número: ");
            numero2 = Entrada.entero();
        }while (numero2 < 0 || numero2 > 50);
        if(numero1 > numero2){
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        while (numero1 < numero2){
            System.out.println("Número 1: "+numero1+ " , " + "Número 2: "+numero2);
            numero1 += 5;
            numero2 -= 2;
        }




    }
}
