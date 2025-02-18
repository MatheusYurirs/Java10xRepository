package NivelIntermediario.Desafio05;

import java.util.Scanner;

public class BancoKonoha {
    public static void main(String[] args) {

        System.out.println(" ||| Seja muito bem vindo ao banco de Konoha |||");
        System.out.println(" | Depositor em conta Corrente tem uma taxa de 1%. |");


        ContaCorrente Naruto = new ContaCorrente("Naruto",100, TipoConta.CORRENTE);
        System.out.println(Naruto);

        System.out.println("------------");
        Naruto.depositar(20);
        Naruto.consultarSaldo();
        
        System.out.println("----------------------");

        ContaPoupanca Jiraya = new ContaPoupanca("Jiraya",100, TipoConta.POUPANCA);
        System.out.println(Jiraya);
        Jiraya.depositar(10);
        Jiraya.consultarSaldo();


    }
}
