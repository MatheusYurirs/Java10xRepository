package NivelIntermediario.Desafio05;

public abstract class ContaBancaria implements Conta {
    String nome;
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String nome, double saldo, TipoConta tipoConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
}
