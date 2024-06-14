package Rutas_Clases;
import java.util.Scanner;

public class Servicio {
    String Empresa;
    Normal nom;
    VIP vip;
    Scanner scS = new Scanner(System.in);

    // Constructor
    public Servicio(String empresa) {
        this.Empresa = empresa;
        this.nom = new Normal(empresa);
        this.vip = new VIP(empresa);
    }

    // Atributo para TipoServicio
    int TipoServicio1 = 0;

    // Método para seleccionar tipo de servicio
    public void TipoServicio_M() {
        System.out.println("TipoServicio:");
        System.out.println("1. Normal");
        System.out.println("\nSelección de asientos: ventana, pasillo, al final, adelante.\nEspacio para una maleta.\nOpción a una maleta adicional por costo extra.");
        System.out.println("2. VIP");
        System.out.println("\ntiene un recargo del 30% del valor del pasaje normal\nTelevisión, internet y otros dos servicios adicionales a su consideración.\nEspacio para dos maletas.\nOpción a una maleta adicional por costo extra.");
        System.out.println("Elegir 1 o 2");
        TipoServicio1 = scS.nextInt();
        if (TipoServicio1 == 1) {
            nom.infoNormal();
        } else if (TipoServicio1 == 2) {
            vip.Seleccionar();
        }
    }

}
