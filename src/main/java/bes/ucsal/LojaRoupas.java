package bes.ucsal;

public class LojaRoupas implements Estabelecimento{

    private String nome;

    public LojaRoupas(String nome) {
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
