package bes.ucsal;

public class LeiteCondenado extends PipocaDecorator{

    public LeiteCondenado(Pipoca pipocaDec){
        super(pipocaDec);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Leite condenado";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.00;
    }
}
