package Caso1;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso1.Residuo;
import br.univille.Caso1.Sistema;

public class SistemaTeste {
    
    @Test
    public void verificaTipos() {
        Residuo res1 = new Residuo("Papel Sulfite", "Sulfite");
        Residuo res2 = new Residuo("Pilha A3", "Pilha");
        Residuo res3 = new Residuo("Garrafa de refrigerante", "Garrafa Plástica");

        Sistema sis = new Sistema();
        sis.infoResiduos.put("Sulfite", "Lixeira axul(reciclável)");
        sis.infoResiduos.put("Pilha", "Descartar em local especializado | Cuidado ao manusear pilhas - verifique se há vazamentos");
        sis.infoResiduos.put("Garrafa Plástica", "Lixeira vermelha(reciclável) | Verifique o símbolo de reciclagem");

        Assert.assertTrue(sis.infoResiduos.containsKey(res1.tipo));
        Assert.assertTrue(sis.infoResiduos.containsKey(res2.tipo));
        Assert.assertTrue(sis.infoResiduos.containsKey(res3.tipo));
    }
}
