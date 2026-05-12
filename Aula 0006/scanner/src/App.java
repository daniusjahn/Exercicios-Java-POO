public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto(88 , "Geladeira", 5000.00, 100);
        produto1.exibirDados();
        produto1.atualizarPreco(2500.00);
        produto1.exibirDados();
    }
}
