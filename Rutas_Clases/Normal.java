package Rutas_Clases;
import java.util.Scanner;

public class Normal {
    String Empresa;
    Scanner scN = new Scanner(System.in);

    // Constructor
    public Normal(String empresa) {
        this.Empresa = empresa;
    }

    // Método para información normal
    public void infoNormal() {
        System.out.println("Selección de asientos: ventana, pasillo, al final, adelante.");
        System.out.println("Espacio para una maleta.");
        System.out.println("Opción a una maleta adicional por costo extra (Preguntar en caja)");
        System.out.println("\nElige (1 al 4) dependiendo del destino:");
        int seleccion = scN.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Precio: " + 20);
                break;
            case 2:
                System.out.println("Precio: " + 17.50);
                break;
            case 3:
                System.out.println("Precio: " + 15);
                break;
            case 4:
                System.out.println("Precio: " + 17.50);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
