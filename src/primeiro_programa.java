import java.util.Scanner;

public class primeiro_programa {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        System.out.println("Olá Mundo!");

        String mensagem = """
                ola pessoal
                tudo bem?
                """;

        System.out.println(mensagem);

        double x=10.5;
        int y=(int) x;

        System.out.println(y);


        System.out.println("-------------");
        System.out.println("Conversão");

        double celsius=0;

        System.out.println("Digite a temperatura em celsius: ");
        celsius=e.nextDouble();

        double farenheit=0;

        farenheit=(celsius * 1.8) + 32;

        System.out.println("sua temperatura em farenheit é de: "+ farenheit);

        System.out.println("__________");

        String nome;
        System.out.println("Digite seu nome");
        nome=e.next();

        System.out.println(nome);
    }
}
