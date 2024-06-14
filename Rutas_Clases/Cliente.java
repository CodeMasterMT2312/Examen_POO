package Rutas_Clases;

public class Cliente {

    //Atributos
    String Nombre;
    String Apellido;
    String Direccion;
    String Telefono;
    String Correo;
    String Cedula;

    //Constructor
    public Cliente(String nombre, String apellido, String direccion, String correo, String telefono, String cedula) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Direccion = direccion;
        this.Correo = correo;
        this.Telefono = telefono;
        this.Cedula = cedula;
    }

    //Metodos
    public void IngresoDatos(){
        System.out.println("Ingrese su nombre:" + Nombre);
        System.out.println("Ingrese su Apellido:" + Apellido);
        System.out.println("Ingrese su Direccion:" + Direccion);
        System.out.println("Ingrese su Telefono:"+ Telefono);
        System.out.println("Ingrese su Correo:" + Correo);
        System.out.println("Ingrese su Cedula:"+ Cedula);
    }

}
