public class prof extends pessoa {
    int salario;
    void verificarSalario(){
        if(this.salario > 5000){
            System.err.println("O Seu salario é alto.");
        }
        else{
            System.out.println("O Seu salario é normal.");
        }
    }

    
}
