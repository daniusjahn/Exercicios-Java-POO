public class App {
    public static void main(String[] args) throws Exception {
        System.err.println("-----------------------------");
        aluno aluno1 = new aluno();
        aluno1.nome = "Jubileu";
        aluno1.idade = 30;
        aluno1.nota = 10.0;
        aluno1.mostrarDados();
        aluno1.verificarNota();
        System.err.println("-----------------------------");
        
        prof prof1 = new prof();
        prof1.nome = "Alexandre";
        prof1.idade = 25;
        prof1.salario = 2000;
        prof1.mostrarDados();
        prof1.verificarSalario();
    }
}
