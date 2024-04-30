import java.util.ArrayList;
import java.util.List;


public class ManejadorMonedas {
        public List<String> ObtenerListaMonedas () {
                List<String> listaMonedas = new ArrayList<>();
                listaMonedas.add("Dólar ==> Peso argentino");
                listaMonedas.add("Peso argentino ==> Dólar");
                listaMonedas.add("Dólar ==> Real brasileño");
                listaMonedas.add("Real brasileño ==> Dólar");
                listaMonedas.add("Dólar ==> Peso colombiano");
                listaMonedas.add("Peso colombiano ==> Dólar");
                listaMonedas.add("Salir");
                return listaMonedas;
        }

}



