package br.univille;

import br.univille.Caso1.Residuo;
import br.univille.Caso1.Sistema;

public class Main {
    public static void main(String[] args) {
        Residuo res1 = new Residuo("Papel Sulfite", "Sulfite");
        Residuo res2 = new Residuo("Pilha A3", "Pilha");
        Residuo res3 = new Residuo("Garrafa de refrigerante", "Garrafa Plástica");
        Residuo res4 = new Residuo("Pneu de bicicleta", "Borracha");

        Sistema sis = new Sistema();
        sis.getInfoResiduos().put("Sulfite", "Lixeira axul(recicálvei)");
        sis.getInfoResiduos().put("Pilha", "Descartar em local especializado | Cuidado ao manusear pilhas - verifique se há vazamentos");
        sis.getInfoResiduos().put("Garrafa Plástica", "Lixeira vermelha(reciclável) | Verifique o símbolo de reciclagem");

        System.out.println(sis.identificaResiduo(res1));
        System.out.println(sis.identificaResiduo(res2));
        System.out.println(sis.identificaResiduo(res3));
        System.out.println(sis.identificaResiduo(res4));
    }
}