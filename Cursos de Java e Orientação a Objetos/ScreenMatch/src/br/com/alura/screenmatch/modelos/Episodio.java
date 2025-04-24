package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel{
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getNumero(){
        return numero;
    }

    public String getNome(){
        return nome;
    }

    public Serie getSerie(){
        return serie;
    }

    public int getTotalVisualizacoes(){
        return totalVisualizacoes;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSerie(Serie serie){
        this.serie = serie;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes){
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao(){
        if (totalVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
