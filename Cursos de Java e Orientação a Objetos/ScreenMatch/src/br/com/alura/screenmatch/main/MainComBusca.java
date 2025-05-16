package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculo.BuscaFilme;
import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        BuscaFilme busca = new BuscaFilme();
        List<Titulo> tiltulosBuscados = busca.buscaFilme();

        System.out.println(tiltulosBuscados);

        FileWriter arquivoTitulosBuscados = new FileWriter("filmes.json");
        arquivoTitulosBuscados.write(gson.toJson(tiltulosBuscados));
        arquivoTitulosBuscados.close();

        System.out.println("O programa finalizou corretamente");
    }
}
