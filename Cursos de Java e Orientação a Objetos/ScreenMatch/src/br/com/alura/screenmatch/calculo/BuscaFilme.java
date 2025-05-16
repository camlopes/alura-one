package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaFilme {
    private String filmeBuscado = "";
    private List<Titulo> tiltulosBuscados = new ArrayList<>();

    public List<Titulo> buscaFilme(){
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        while (!filmeBuscado.equalsIgnoreCase("sair")) {
            System.out.print("Digite um Filme para busca: ");
            filmeBuscado = scanner.nextLine();
            String endereco = "https://www.omdbapi.com/?t=" + filmeBuscado.replace(" ", "+") + "&apikey=ece4d09a";

            if (filmeBuscado.equalsIgnoreCase("sair")){
                break;
            }

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String jsonResponse = response.body();

                System.out.println(jsonResponse);

                TituloOmdb tituloOmdb = gson.fromJson(jsonResponse, TituloOmdb.class);
                System.out.println(tituloOmdb);

                Titulo titulo = new Titulo(tituloOmdb);
                System.out.println(titulo);

                tiltulosBuscados.add(titulo);
            } catch (NumberFormatException | IOException | InterruptedException e) {
                System.out.println("            ACONTECEU UM ERRO");
                System.out.println("            " + e.getMessage());
            } catch (NullPointerException e){
                System.out.println("            ERRO FILME NAO ENCONTRADO");
                System.out.println("            " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("            ACONTECEU UM ERRO DE ARGUMENTO");
                System.out.println("            " + e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println("            ACONTECEU UM ERRO COM O ANO DO FILME");
                System.out.println("            " + e.getMessage());
            }
        }
        scanner.close();

        return tiltulosBuscados;
    }
}
