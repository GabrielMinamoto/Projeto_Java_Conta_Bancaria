public class musica {

    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Nome do artisista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }


    void avalia(double nota){
        somaAvaliacao+=nota;
        numAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacao / numAvaliacoes;
    }
}
