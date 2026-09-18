package bes.ucsal;

public class Manteiga extends PipocaDecorator{

    public Manteiga(Pipoca pipocaDec) {
        super(pipocaDec);
    }


    @Override
    public String getDescricao() {
        return super.getDescricao() + ", amanteigada";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.50;
    }
}
