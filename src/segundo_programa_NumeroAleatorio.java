import java.util.Random;
import java.util.Scanner;

public class segundo_programa_NumeroAleatorio {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int numeroAleatorio=new Random().nextInt(100);
        int tentativas=0;

        int numeroEscolhido=0;


        while (tentativas<5){
            tentativas++;
            System.out.println("Tente adivinhar o numero aleatorio:");
            numeroEscolhido=e.nextInt();

            if (numeroAleatorio==numeroEscolhido){
                System.out.println("VOCE DESCOBRIU, O NUMERO ERA: " + numeroAleatorio);
                break;
            }else if (numeroAleatorio>numeroEscolhido){
                System.out.println("Tente um numero maior!");
            }else {
                System.out.println("Tente um numero menor!");
            }
        }

        if (tentativas==5 && numeroEscolhido!=numeroAleatorio){
            System.out.println("Voce tentou!, o numero sortido era: " + numeroAleatorio);
        }
    }
}
