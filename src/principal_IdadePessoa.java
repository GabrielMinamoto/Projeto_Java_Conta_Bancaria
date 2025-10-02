public class principal_IdadePessoa {
    public static void main(String[] args) {

        IdadePessoa idade = new IdadePessoa();

        //modifico->SETTERS
        idade.setIdade(25);
        idade.setNome("Gabriel");

        //acesso->GETTERS
        System.out.println("O nome da pessoa: " + idade.getNome());
        System.out.println("A idade da pessoa: " + idade.getIdade());

        idade.verficaMaior();
    }
}
