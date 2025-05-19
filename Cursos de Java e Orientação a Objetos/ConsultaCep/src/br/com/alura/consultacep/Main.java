package br.com.alura.consultacep;

import br.com.alura.consultacep.modelos.BuscaCep;
import br.com.alura.consultacep.modelos.GeradorDeArquivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CEP buscado: ");
        String cepBuscado = scanner.nextLine();
        BuscaCep buscaCep = new BuscaCep(cepBuscado);

        try {
            GeradorDeArquivo geraArquivo = new GeradorDeArquivo(buscaCep);
            geraArquivo.geraArquivo();
            System.out.println("Finalizando a aplicação");

        } catch (Exception e){
            System.out.println("             ACONTECEU UM ERRO");
            System.out.println("             " + e.getMessage());
        }

        scanner.close();
    }
}
