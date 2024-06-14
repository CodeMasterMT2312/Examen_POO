package Rutas_Clases;
import java.util.Scanner;
public class Servicio extends Rutas {

    public Servicio(String empresa) {
        super(empresa);
    }
    Normal nom = new Normal("El Búho");
    VIP vip = new VIP("El Búho");
    Scanner scS = new Scanner(System.in);

    int TipoServicio1=0;
    public void TipoServicio_M() {
        System.out.println("TipoServicio:");
        System.out.println("1. Normal");
        System.out.println("\nSelección de asientos: ventana, pasillo, al final, adelante.\nEspacio para una maleta.\nOpción a una maleta adicional por costo extra.");
        System.out.println("2. VIP");
        System.out.println("\ntiene un recargo del 30% del valor del pasaje normal\nTelevisión, internet y otros dos servicios adicionales a su consideración.\nEspacio para dos maletas.\nOpción a una maleta adicional por costo extra.");
        System.out.println("Elegir 1 o 2");
        int TipoServicio1 = scS.nextInt();
        if (TipoServicio1 == 1) {
            nom.infoNormal();
        } else if (TipoServicio1 == 2) {
            vip.Seleccionar();
        }
    }
    public int getTipoServicio1() {
        return TipoServicio1;
    }
}
