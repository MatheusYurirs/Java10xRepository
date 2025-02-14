package NivelIntermediario.Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialides;

    public NinjaAvancado(String nome, int idade, TipoHabilidades tipoHabilidades, String especialides) {
        super(nome, idade, tipoHabilidades);
        this.especialides = especialides;
    }

    @Override
    public void mostrarInformacoes() {
    super.mostrarInformacoes();

    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.nome + " utiliza do seu " + this.tipoHabilidades +" e também o seu " + especialides);
    }

}
