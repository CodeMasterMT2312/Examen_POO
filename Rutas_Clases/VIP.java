package Rutas_Clases;

import java.util.Scanner;

public class VIP extends Servicio{

    Scanner scV = new Scanner(System.in);
    public VIP(String empresa) {
        super(empresa);
    }

    public void Seleccionar() {
        System.out.println("Tipo de Servicio: VIP");
        System.out.println("tiene un recargo del 30% del valor del pasaje normal");
        System.out.println("Televisión, internet y otros dos servicios adicionales a su consideración.");
        System.out.println("Espacio para dos maletas.");
        int seleccion = scV.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Precio:"+(20 + (20*0.30)));

                break;
            case 2:
                System.out.println("Precio: "+(17.50 + (17.50*0.30)));
                break;
            case 3:
                System.out.println("Precio: "+(15 + (15*0.30)));
                break;
            case 4:
                System.out.println("Precio: "+(17.50 + (17.50*0.30)));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
