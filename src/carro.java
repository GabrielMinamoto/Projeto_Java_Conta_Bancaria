public class carro {

    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnicaCarro(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Cor do carro: " + cor);
        System.out.println("Ano do carro: " + ano);
    }

    double calcularIdade(){
        return 2025 - ano;
    }
}
