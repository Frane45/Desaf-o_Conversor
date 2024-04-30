import java.util.Scanner;

public class MenuInicioYFin {

    private String guarda = "*****************************************";
    private String bienvenida = "Bienvenidos al conversor de monedas";
    private String opciones = "Elija una opción válida";


    // Método para mostrar la bienvenida

    public void mostrarBienvenida() {
        System.out.println(guarda);
        System.out.println(bienvenida);
        System.out.println(guarda);
    }
    //Método para mostrar las opciones del menu

    public void mostrarOpciones() {
        System.out.println(opciones);

    }

    public int obtenerTipoConversion() {
        Scanner lectura = new Scanner(System.in);
        int tipoConversion = lectura.nextInt();
        System.out.println("");
        return tipoConversion;

    }

    public double obtenerSeleccion() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el importe que desea convertir");
        double importeConversion = lectura.nextDouble();
        return importeConversion;
    }

}


























