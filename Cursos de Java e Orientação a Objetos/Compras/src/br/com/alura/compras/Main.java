package br.com.alura.compras;

import br.com.alura.compras.calculos.CartaoDeCredito;
import br.com.alura.compras.modelos.Compra;
import br.com.alura.compras.modelos.ExtratoDoCartao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double limiteDoCartao;
        String descricaoDaCompra;
        double valorDaCompra;
        int continuaCompra = 1;

        System.out.print("Digite o limite do cartão: ");
        limiteDoCartao = scanner.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limiteDoCartao);

        while (continuaCompra == 1){
            System.out.print("Digite a descrição da compra: ");
            descricaoDaCompra = scanner.next();

            System.out.print("Digite o valor da compra: ");
            valorDaCompra = scanner.nextDouble();

            Compra compra = new Compra(descricaoDaCompra, valorDaCompra);
            continuaCompra = cartaoDeCredito.verificaSaldo(compra);

            if (continuaCompra == 0){
                break;
            } else {
                System.out.println("Digite 0 para sair ou 1 para continuar");
                continuaCompra = scanner.nextInt();
            }
        }

        ExtratoDoCartao extrato = new ExtratoDoCartao(cartaoDeCredito);
        extrato.imprimeNotaFiscal();

        System.out.println("Saldo do cartão: " + cartaoDeCredito.getSaldo() + "\n");

        scanner.close();
    }
}
