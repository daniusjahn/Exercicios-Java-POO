public class App {
    public static void main(String[] args) throws Exception {

        carro c1 = new carro();
        c1.marca = "Chevrolet";
        c1.modelo = "Onix";
        c1.ano = 2020;
        c1.cor = "Preto";
        c1.ligar();
        c1.andar();
        c1.buzinar();


        carro c2 = new carro();
        c2.marca = "Carro";
        c2.ano = 2010;
        c2.cor = "vermelho";
        c2.modelo = "modelo";
        c2.ligar();
        c2.andar();
        c2.buzinar();
        


    }
}
