package bes.ucsal;

public abstract class PipocaDecorator implements Pipoca{

    protected Pipoca pipocaDec;

    public PipocaDecorator(Pipoca pipocaDec){
        this.pipocaDec = pipocaDec;
    }

    @Override
    public String getDescricao() {
        return pipocaDec.getDescricao();
    }

    @Override
    public double getPreco() {
        return pipocaDec.getPreco();
    }

}
