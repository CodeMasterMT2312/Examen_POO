import Rutas_Clases.*;
public class Main {
    public static void main(String[] args) {
        Cliente cl = new Cliente("Felix","Ochoa","Centro","ochoa@gmail.com","123456789","1798654320");
        cl.IngresoDatos();
        Rutas rut = new Rutas("EL Buho");
        rut.Vi_rutas();
    }
}