public class principal_Produto {
    public static void main(String[] args) {
        //SETTERS DECLARADO
        Produto produto = new Produto("Celular", 2000.0);

        //GETTERS
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());

        //ao escrever nas parenteses, percentual recebe um valor
        produto.aplicarDesconto(10);
        System.out.println("Desconto aplicado, resultou no novo preço: " + produto.getPreco());
    }
}
