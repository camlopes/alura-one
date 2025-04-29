package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacao++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacao;
    }
}