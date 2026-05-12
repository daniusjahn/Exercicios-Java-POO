public class Tecnico extends Pessoa{
    public void verificarIdade(){
        if (idade < 35){
            System.out.println(" NÃO ESTÁ APTO PARA SER TÉCNICO");
        }
        else if (idade >= 35 && idade <= 50){
            System.out.println("APTO A SER TÉCNICO");
        }
        else if (idade > 50){
            System.out.println("O HEXA VEM!!!");
        }
    }

}
