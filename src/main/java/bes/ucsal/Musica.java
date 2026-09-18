package bes.ucsal;

public class Musica {
    private String titulo;
    private String artista;


    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getInfo(){
        return titulo + " - " + artista;
    }

}
