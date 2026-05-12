public class Jogador extends Pessoa {
    public double imc;
    public void calcularImc(){
        imc = peso / (altura*altura);
        if(imc < 18.5){
            System.out.println("Você esta magro.");
        }
        else if(imc >= 18.5 && imc <= 24.9 ){
            System.out.println("Você esta em boa forma.");
        }
        else {
            System.out.println("Você esta gordo.");
        }
        
    }
}
