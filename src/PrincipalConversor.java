import java.text.DecimalFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrincipalConversor {
    public static void main(String[] args) {
        MenuInicioYFin menu = new MenuInicioYFin();
        ManejadorMonedas manejador = new ManejadorMonedas();
        BuscadorDeMonedas buscaMonedas = new BuscadorDeMonedas();
        MonedaAConvertir monedaEncontrada = buscaMonedas.BuscaMoneda("USD");
        Map<String, Double> tipoDeCambioMap = monedaEncontrada.conversion_rates();
        ConversorDeMoneda conversor = new ConversorDeMoneda(tipoDeCambioMap);
        boolean continuar = true;

        while (continuar) {
            menu.mostrarBienvenida(); // muestra bienvenida y guarda
            List<String> listaMonedas = manejador.ObtenerListaMonedas();
            for (int i = 0; i < listaMonedas.size(); i++) {
                int numeroCorrelativo = i + 1;
                System.out.println(numeroCorrelativo + ") " + listaMonedas.get(i));
            } // muestra el listado de monedas
            menu.mostrarOpciones(); // me pide que seleccione una opción

            int tipoConversion = menu.obtenerTipoConversion();

            if (tipoConversion == 7) {
                System.out.println("Adiós");
                break; // Salir del bucle
            }
            try {
                double importeConversion = menu.obtenerSeleccion();


                switch (tipoConversion) {
                    case 1:
                        double resultado = conversor.Convierte("USD", "ARS", importeConversion);
                        System.out.println("El valor " + importeConversion + " [USD]" + " corresponde al valor final " + formatoDecimal(resultado) + " [ARS]");

                        break;
                    case 2:
                        resultado = conversor.Convierte("ARS", "USD", importeConversion);
                        System.out.println("El valor " + importeConversion + " [ARS]" + " corresponde al valor final " + formatoDecimal(resultado) + " [USD]");

                        break;
                    case 3:
                        resultado = conversor.Convierte("USD", "BRL", importeConversion);
                        System.out.println("El valor " + importeConversion + " [USD]" + " corresponde al valor final " + formatoDecimal(resultado) + " [BRL]");

                        break;
                    case 4:
                        resultado = conversor.Convierte("BRL", "USD", importeConversion);
                        ;
                        System.out.println("El valor " + importeConversion + " [BRL]" + " corresponde al valor final " + formatoDecimal(resultado) + " [USD]");

                        break;
                    case 5:
                        resultado = conversor.Convierte("USD", "COP", importeConversion);
                        System.out.println("El valor " + importeConversion + " [USD]" + " corresponde al valor final " + formatoDecimal(resultado) + " [COP]");
                        break;
                    case 6:
                        resultado = conversor.Convierte("COP", "USD", importeConversion);
                        System.out.println("El valor " + importeConversion + " [COP]" + " corresponde al valor final " + formatoDecimal(resultado) + " [USD]");
                        break;

                    default:
                        System.out.println("Opción no válida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Debes ingresar un número válido.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
            }

        }

    }

    public static String formatoDecimal(double numero) {
        DecimalFormat df = new DecimalFormat("#.#####");
        return df.format(numero);
    }
}













