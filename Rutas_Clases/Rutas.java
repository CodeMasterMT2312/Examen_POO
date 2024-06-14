package Rutas_Clases;
import java.util.Scanner;

public class Rutas {
    // Atributos
    String Empresa;
    Scanner sc2 = new Scanner(System.in);

    // Constructor
    public Rutas(String empresa) {
        this.Empresa = empresa;
    }

    // Método para mostrar rutas
    public void Vi_rutas() {
        System.out.println("1. Quito-Guayaquil ");
        System.out.println("2. Quito-Tulcán ");
        System.out.println("3. Quito-Puyo ");
        System.out.println("4. Quito-Riobamba");
    }

    // Variables para precios
    double Quito_Guayaquil = 20.00;
    double Quito_Tulcán = 17.50;
    double Quito_Puyo = 15.00;
    double Quito_Riobamba = 17.50;

    // Método para reservar
    public void Reservar() {
        System.out.println("Elegir destino (1 al 4)");
        int seleccion = sc2.nextInt();
        Servicio sv = new Servicio(Empresa);
        switch (seleccion) {
            case 1:
                System.out.println("Quito-Guayaquil");
                System.out.println("Precio: " + Quito_Guayaquil);
                sv.TipoServicio_M();
                break;
            case 2:
                System.out.println("Quito-Tulcán");
                System.out.println("Precio: " + Quito_Tulcán);
                sv.TipoServicio_M();
                break;
            case 3:
                System.out.println("Quito-Puyo");
                System.out.println("Precio: " + Quito_Puyo);
                sv.TipoServicio_M();
                break;
            case 4:
                System.out.println("Quito-Riobamba");
                System.out.println("Precio: " + Quito_Riobamba);
                sv.TipoServicio_M();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
