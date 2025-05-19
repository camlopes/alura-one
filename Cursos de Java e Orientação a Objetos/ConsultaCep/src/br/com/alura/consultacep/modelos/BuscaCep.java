package br.com.alura.consultacep.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCep {
    private String cep;
    private Endereco endereco;

    public BuscaCep(String cep){
        this.cep = cep;
    }

    public Endereco buscaEndereco() {
        Gson gson = new GsonBuilder()
                .create();

        try {
            String url = "https://viacep.com.br/ws/" + cep + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            endereco = gson.fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            System.out.println("            NAO FOI POSSIVEL OBTER UM ENDERECO COM O CEP FORNECIDO");
            System.out.println("            " + e.getMessage());
        }

        return endereco;
    }
}
