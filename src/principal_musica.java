public class principal_musica {
    public static void main(String[] args) {

        musica minhaMusica = new musica();

        minhaMusica.titulo="soFaygo";
        minhaMusica.artista="faygo";
        minhaMusica.anoLancamento = 2020;

        minhaMusica.fichaTecnica();

        minhaMusica.avalia(5);
        minhaMusica.avalia(8);
        minhaMusica.avalia(10);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Media das avaliações: " + mediaAvaliacoes);
    }
}
