public class aluno extends pessoa {
    double nota;
    void verificarNota(){
        if(this.nota > 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
    
}
