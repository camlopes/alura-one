package br.com.alura.audioplayer.modelos;

public class Preferidos {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " é curtido por algumas pessoas");
        }
    }
}
