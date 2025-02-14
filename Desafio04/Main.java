package NivelIntermediario.Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico("Iruka Umino",23,
                TipoHabilidades.TAIJUTSU);
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();
        System.out.println("--------------");
        NinjaAvancado ninjaAvancado = new NinjaAvancado("Naruto Uzumaki",23,
                TipoHabilidades.NINJUTSU,"Jutso Clones das Sombras");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}
