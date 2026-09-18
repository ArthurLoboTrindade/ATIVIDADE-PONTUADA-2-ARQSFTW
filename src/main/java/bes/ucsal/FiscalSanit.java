package bes.ucsal;

public class FiscalSanit implements Fiscal{

    @Override
    public void inspecionar(Restaurante restaurante) {
        System.out.println("Vigilância Sanitária no " + restaurante.getNome() + ": Checando validade das carnes na geladeira.");
    }

    @Override
    public void inspecionar(Cinema cinema) {
        System.out.println("Vigilância Sanitária no " + cinema.getNome() + ": Inspecionando a limpeza dos banheiros e pipoqueira.");
    }

    @Override
    public void inspecionar(LojaRoupas lojaRoupas) {
        System.out.println("Vigilância Sanitária na " + lojaRoupas.getNome() + ": Tudo ok. Sem riscos biológicos aqui.");
    }
}

