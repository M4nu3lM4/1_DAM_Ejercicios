package secuenciales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class AreaCirculo {
    public static void main(String[] args) {
        float radio;
        float area;
        System.out.print("Introduce el radio del círculo: ");
        radio = Entrada.real();
        area = (float) (Math.PI * (radio * radio));
        System.out.println("El área del circulo es: " + area);
    }
}
