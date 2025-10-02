public class principal_ContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        //possivel modificar SETTERS
        conta.setNumeroConta(123);
        conta.setSaldo(1280);
        conta.titular="Rogerio";

        //impossivel modificar GETTERS
        System.out.println("Nome do titular: " + conta.titular);
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());

        //modifiquei o saldo
        conta.setSaldo(1500);

        //acessei o novo saldo
        System.out.println("Novo saldo: " + conta.getSaldo());
    }
}
