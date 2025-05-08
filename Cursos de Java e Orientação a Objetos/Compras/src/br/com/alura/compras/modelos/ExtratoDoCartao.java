package br.com.alura.compras.modelos;

import br.com.alura.compras.calculos.CartaoDeCredito;

import java.util.Comparator;
import java.util.List;

public class ExtratoDoCartao {
    private List<Compra> compras;

    public ExtratoDoCartao(CartaoDeCredito cartaoDeCredito) {
        compras = cartaoDeCredito.getCompras();
    }

    public void imprimeNotaFiscal(){
        System.out.println("\n**************************");
        System.out.println("COMPRAS REALIZADAS:");

        compras.sort(Comparator.comparing(Compra::getValor));
        for (Compra compra : compras){
            System.out.println(compra.toString());
        }

        System.out.println("************************** \n");
    }
}
