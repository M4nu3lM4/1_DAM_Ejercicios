package variados;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Menu {
    public static void main(String[] args) {

        int opcion;
        System.out.println("<======== MENU =========>");
        System.out.println("1.Abrir");
        System.out.println("2.Cerrar");
        System.out.println("3.Salir");
        do {
            System.out.print("Elige una opción: ");
            opcion = Entrada.entero();
        }while (opcion <= 0 || opcion > 3);

        switch (opcion){
            case 1 -> System.out.println("Has elegido la opción abrir. Se va a iniciar la aplicación");

            case 2 -> System.out.println("Has elegido la opción cerrar. Se va a cerrar la aplicación");

            case 3 -> System.out.println("Has elegido la opción salir. Adios");

            default -> System.out.println("O");
        }
    }
}
