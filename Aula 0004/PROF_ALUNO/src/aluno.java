public class aluno extends pessoa {
    double nota;
    void verificarNota(){
        if(this.nota >= 7){
            System.out.println("Aprovado");
            System.out.println("A Sua nota é: " + this.nota);
        }
        else{
            System.out.println("Reprovado");
            System.out.println("A Sua nota é: " + this.nota);
        }
    }
    
}
