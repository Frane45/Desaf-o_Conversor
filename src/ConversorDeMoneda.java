import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class ConversorDeMoneda {
    private Map<String, Double> tipoDeCambioMap;

    public ConversorDeMoneda(Map<String, Double> tipoDeCambioMap) {
        this.tipoDeCambioMap = tipoDeCambioMap;
    }

    public double Convierte(String MonedaOrigen, String MonedaDestino, double monto) {
        double tipoDeCambio = tipoDeCambioMap.get(MonedaDestino) / tipoDeCambioMap.get(MonedaOrigen);
        double resultado = monto * tipoDeCambio;
        return resultado;

    }

}

