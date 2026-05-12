public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador();
        jogador1.nome = "Neymar";
        jogador1.idade = 38;
        jogador1.peso = 74.6;
        jogador1.altura = 1.83;
        jogador1.calcularImc();
        Tecnico tecnico1 = new Tecnico();
        tecnico1.nome = "Ancelotti";
        tecnico1.idade = 60;
        tecnico1.verificarIdade();
    }
}
