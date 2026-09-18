package bes.ucsal;

public class Restaurante implements Estabelecimento{

    private String nome;

    public Restaurante(String nome) {
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
