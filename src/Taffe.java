public class Taffe {

    public int numeracao;

    public String versao;

    public int posicaoAtual = 0;

    public String dizerOi() {
        return "Oi pessoal";
    }

    public void falar(String oqueFalar) {

        System.out.println(oqueFalar);

    }

    public void andar(int quantidadePassos, boolean paraFrente) {

        for (int i = 1; i <= quantidadePassos; i++) {
            System.out.println("Passos" + i);
        }
        if (paraFrente == true) {
            posicaoAtual = quantidadePassos;
        } else {
            posicaoAtual += quantidadePassos;
        }

    }

    public void retornarPosicao() {
        System.out.println("Minha posição é: " + posicaoAtual);
    }
    //mandar mensagem bravo
    //andar
    //falar
    //dizer oi
    //limpar casa
    //cantar uma musica
    //mudar de idioma
}