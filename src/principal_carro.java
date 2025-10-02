public class principal_carro {
    public static void main(String[] args) {

        carro carro = new carro();

        carro.modelo="Volkwagen";
        carro.cor="rosa";
        carro.ano=2012;

        carro.exibeFichaTecnicaCarro();

        double anoCarro = carro.calcularIdade();
        System.out.println("A idade do carro é de " + anoCarro + " anos");
    }
}
