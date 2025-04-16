import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args){
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie lost = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos() + " minutos");
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacao());
        System.out.println("Media de avaliações: " + filme1.pegaMedia());
        System.out.println("----------------------------\n");

        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos() + " minutos");
        System.out.println("----------------------------\n");

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println("Tempo para maratonar: " + calculadora.getTempoTotal() + " minutos");
        System.out.println("----------------------------\n");

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        System.out.println(filme1.getNome());
        filtroRecomendacao.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        System.out.println(lost.getNome());
        filtroRecomendacao.filtra(episodio);
        System.out.println("----------------------------\n");
    }
}
