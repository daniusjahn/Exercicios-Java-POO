public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
     void exibirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);

    }
    public void atualizarPreco(double novoPreco){
        this.preco = novoPreco;
    }

}
