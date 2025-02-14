package NivelIntermediario.Desafio04;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    TipoHabilidades tipoHabilidades;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, TipoHabilidades tipoHabilidades) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidades = tipoHabilidades;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Habilidades:" + this.tipoHabilidades);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.nome + " utiliza do seu " + this.tipoHabilidades);
    }
}
