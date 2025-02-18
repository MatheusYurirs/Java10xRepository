package NivelIntermediario.Desafio05;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(String nome, double saldo, TipoConta tipoConta) {
        super(nome, saldo, tipoConta);
    }

    @Override
    public String toString() {
        return "ContaPoupanca:" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", tipoConta=" + tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo em conta:" + saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositar no valor de: " + valor);
        saldo += valor;
    }
}
