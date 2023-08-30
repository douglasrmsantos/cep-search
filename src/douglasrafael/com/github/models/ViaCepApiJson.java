package douglasrafael.com.github.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ViaCepApiJson {
    
    public static RecordCep requestCep(String adress){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(adress))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString()); 
            return new Gson().fromJson(response.body(), RecordCep.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}