package bes.ucsal;

import java.util.List;

public class PlaylistIterador implements IteradorMusica{

    private List<Musica> musicas;
    private int posicaoAt;

    public PlaylistIterador(List<Musica> musicas) {
        this.musicas = musicas;
        this.posicaoAt = 0;
    }

    @Override
    public boolean temNext() {
        return posicaoAt < musicas.size();
    }

    @Override
    public Musica proxima() {
        Musica musica = musicas.get(posicaoAt);
        posicaoAt++;
        return musica;
    }
}
