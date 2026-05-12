import java.ultils.scanner;
public class App {
public static void main(String[] args) throws Exception {

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = dados.nextInt();
        if (idade >= 18) {
            System.out.println("Você pode tirar a sua carteira de habilitação.");
        } else {
            System.out.println("Você não pode tirar a sua carteira de habilitação.");
        }

    }
}