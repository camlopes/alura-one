package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        Filme filme2 = new Filme("Avatar", 2023);
        Filme filme3 = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        filme1.avalia(9);
        filme2.avalia(6);
        filme3.avalia(10);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filme1);
        listaDeAssistidos.add(filme2);
        listaDeAssistidos.add(filme3);
        listaDeAssistidos.add(lost);

        for (Titulo item: listaDeAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}