package bes.ucsal;

public class Achocolatado extends PipocaDecorator{

    public Achocolatado(Pipoca pipocaDec) {
        super(pipocaDec);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com achocolatado por cima";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 3.00;
    }
}
