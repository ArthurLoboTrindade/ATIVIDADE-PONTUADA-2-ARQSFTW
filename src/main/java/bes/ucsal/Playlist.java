package bes.ucsal;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements ColecaoMusica{
    private List<Musica> musicas;

    public Playlist() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public IteradorMusica criarIterador() {
        return new PlaylistIterador(this.musicas);
    }
}
