import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class BuscadorDeMonedas {
    MonedaAConvertir BuscaMoneda(String moneda) {
        String direccion = "https://v6.exchangerate-api.com/v6/205d4a250db33ba28208cbc6/latest/" + moneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                //.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        MonedaAConvertir monedaEncontrada = gson.fromJson(response.body(), MonedaAConvertir.class);
        return monedaEncontrada;

    }

}



