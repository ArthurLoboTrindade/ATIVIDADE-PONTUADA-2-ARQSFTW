package bes.ucsal;

public class Cinema implements Estabelecimento{
    private String nome;

    public Cinema(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void receberFiscalizacao(Fiscal fiscal) {
        fiscal.inspecionar(this);
    }
}
