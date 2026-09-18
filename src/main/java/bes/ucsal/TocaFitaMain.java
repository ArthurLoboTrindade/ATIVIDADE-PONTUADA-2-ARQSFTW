package bes.ucsal;

public class TocaFitaMain {
    public static void main(String[] args) {
        Playlist minhaPlaylist = new Playlist();
        minhaPlaylist.adicionarMusica(new Musica("Gatinha Comunista", "Vitroles"));
        minhaPlaylist.adicionarMusica(new Musica("Tudo Vai Dar Certo", "Natiruts, Amani Kush"));
        minhaPlaylist.adicionarMusica(new Musica("Feira de Mangaio", "Clara Nunes"));

        IteradorMusica iterador = minhaPlaylist.criarIterador();

        System.out.println("Iniciando a reprodução...\n");

        while (iterador.temNext()) {
            Musica tocandoAgora = iterador.proxima();
            System.out.println("Tocando agora: " + tocandoAgora.getInfo());
            System.out.println("[Usuário apertou Next]\n");
        }

        System.out.println("Fim da playlist. Sem mais músicas para tocar.");
    }
}