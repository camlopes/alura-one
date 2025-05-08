package br.com.alura.compras.calculos;

import br.com.alura.compras.modelos.Compra;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDoCartao;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteDoCartao){
        this.limiteDoCartao = limiteDoCartao;
        saldo = limiteDoCartao;
        compras = new ArrayList<>();
    }

    public double getLimiteDoCartao(){
        return limiteDoCartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public double getSaldo(){
        return saldo;
    }

    public int verificaSaldo(Compra compra){
        if (saldo < compra.getValor()){
            System.out.println("\nSaldo insuficiente para essa compra!");
            return 0;
        } else {
            saldo -= compra.getValor();
            this.compras.add(compra);
            System.out.println("Compra realizada! \n");
            return 1;
        }
    }
}
