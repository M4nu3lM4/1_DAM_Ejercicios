package secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class PerimetroRectangulo {
    public static void main(String[] args) {
        float base;
        float altura;
        float perimetro;
        System.out.print("Introduce la base del rectángulo: ");
        base = Entrada.real();
        System.out.print("Introduce la altura del rectángulo: ");
        altura = Entrada.real();
        perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}
