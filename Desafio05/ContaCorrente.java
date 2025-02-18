package NivelIntermediario.Desafio05;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(String nome, double saldo, TipoConta tipoConta) {
        super(nome, saldo, tipoConta);
    }


    @Override
    public String toString() {
        return "ContaCorrente:" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", tipoConta=" + tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo em conta de " + nome + ":" + saldo );
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Deposito no Valor de: " + valor);
        System.out.println("Taxa de 1% Aplicada");
        saldo += (valor * 0.99);
    }
}
