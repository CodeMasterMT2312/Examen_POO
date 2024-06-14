package Rutas_Clases;

import java.util.Scanner;

public class Ticket extends Rutas {


    public Ticket(String empresa) {
        super(empresa);
    }
    Scanner sc4 = new Scanner(System.in);
    public void Visualizar_ticket(){
        System.out.println("Ruta seleccionada ");
        Scanner sc4 = new Scanner(System.in);
        int seleccion = sc4.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Nombre: Felix Ochoa");
                System.out.println("Destino: Quito_Guayaquil");
                for(int i=0;i <2;i++){
                    System.out.println("Precio Normal: $ 20");
                    System.out.println("Precio VIP:"+(20 + (20*0.30)));
                }

                break;
            case 2:
                System.out.println("Nombre: Felix Ochoa");
                System.out.println("Destino: Quito_Tulcán");
                for(int i=0;i <2;i++){
                    System.out.println("Precio Normal: $ 17.50");
                    System.out.println("Precio VIP:"+(17.50 + (17.50 * 0.30)));
                }
                break;
            case 3:
                System.out.println("Nombre: Felix Ochoa");
                System.out.println("Destino: Quito_Puyo");
                for(int i=0;i <2;i++){
                    System.out.println("Precio Normal: $ 15");
                    System.out.println("Precio VIP:"+(15 + (15 * 0.30)));
                }
                break;
            case 4:
                System.out.println("Nombre: Felix Ochoa");
                System.out.println("Destino: Quito-Riobamba");
                for(int i=0;i <2;i++){
                    System.out.println("Precio Normal: $ 17.50");
                    System.out.println("Precio VIP:"+(17.50 + (17.50 * 0.30)));
                }
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
