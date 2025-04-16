package br.com.alura.audioplayer.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descircao;

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
