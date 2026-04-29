public class Nota {

    String nome;
    int nota;

    void verificar(){
        if (nota >= 6) {
            System.out.println("Parabéns " + nome + ", você passou");
        } else {
            System.out.println("Que pena " + nome + ", você não passou");
        }
    }
}

