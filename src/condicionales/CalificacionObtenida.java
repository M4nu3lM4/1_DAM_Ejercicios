package condicionales;

import org.iesalandalus.programacion.utilidades.Entrada;

public class CalificacionObtenida {
    public static void main(String[] args) {
        float calificacion;
        System.out.print("Introduce una calificación: ");
        calificacion = Entrada.real();

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("La calificación no es correcta");
        } else if (calificacion < 5) {
            System.out.println("Estas suspenso");
        } else {
            System.out.println("Estas aprobado");
        }
    }
}
