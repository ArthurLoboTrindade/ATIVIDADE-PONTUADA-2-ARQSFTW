package bes.ucsal;

public class FiscalSegu implements Fiscal{

    @Override
    public void inspecionar(Restaurante restaurante) {
        System.out.println("Fiscal de Segurança no " + restaurante.getNome() + ": Verificando sistema de supressão de fogo na cozinha.");
    }

    @Override
    public void inspecionar(Cinema cinema) {
        System.out.println("Fiscal de Segurança no " + cinema.getNome() + ": Testando iluminação das saídas de emergência.");
    }

    @Override
    public void inspecionar(LojaRoupas lojaRoupas) {
        System.out.println("Fiscal de Segurança no " + lojaRoupas.getNome() + ": Checando validade dos extintores e detectores de fumaça.");
    }
}

