package br.com.alura.consultacep.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

public class GeradorDeArquivo {
    BuscaCep buscaCep;

    public GeradorDeArquivo(BuscaCep buscaCep){
        this.buscaCep = buscaCep;
    }

    public void geraArquivo(){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            FileWriter arquivoEdereco = new FileWriter(buscaCep.buscaEndereco().cep() + ".json");
            arquivoEdereco.write(gson.toJson(buscaCep.buscaEndereco()));
            arquivoEdereco.close();
        } catch (Exception e){
            System.out.println("             ACONTECEU UM ERRO");
            System.out.println("             " + e.getMessage());
        }
    }
}
