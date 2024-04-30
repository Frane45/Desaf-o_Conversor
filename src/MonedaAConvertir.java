import java.util.Map;

public record MonedaAConvertir(String base_code,
                               Map<String, Double> conversion_rates) {
    public Map<String, Double> getConversionRates() {

        return this.conversion_rates;

    }

}



