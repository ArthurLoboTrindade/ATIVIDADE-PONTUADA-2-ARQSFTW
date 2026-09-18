package bes.ucsal;

import java.util.ArrayList;
import java.util.List;

public class GaleriaMain {
    public static void main(String[] args) {

        List<Estabelecimento> shoppingCenter = new ArrayList<>();
        shoppingCenter.add(new Restaurante("Outback"));
        shoppingCenter.add(new Cinema("Cinemark"));
        shoppingCenter.add(new LojaRoupas("Zara"));

        Fiscal fiscalSanitario = new FiscalSanit();
        System.out.println("=== INÍCIO DA INSPEÇÃO SANITÁRIA ===");
        for (Estabelecimento loja : shoppingCenter) {
            loja.receberFiscalizacao(fiscalSanitario);
        }

        System.out.println("\n-------------------------------------------------\n");

        Fiscal fiscalSeguranca = new FiscalSegu();
        System.out.println("=== INÍCIO DA INSPEÇÃO DE SMT ===");
        for (Estabelecimento loja : shoppingCenter) {
            loja.receberFiscalizacao(fiscalSeguranca);
        }

    }
}