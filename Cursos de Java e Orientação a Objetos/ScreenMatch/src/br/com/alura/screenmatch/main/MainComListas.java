package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        Filme filme2 = new Filme("Avatar", 2023);
        Filme filme3 = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        filme1.avalia(9);
        filme2.avalia(6);
        filme3.avalia(10);

        List<Titulo> listaDeAssistidos = new LinkedList<>();
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

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jack");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenar: " + buscaPorArtista);
        Collections.sort(listaDeAssistidos);
        System.out.println("Lista de titulos ordenados por nome: " + listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de titulos ordenados por ano de lancamento: " + listaDeAssistidos);
    }
}