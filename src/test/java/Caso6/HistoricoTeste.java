package Caso6;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso6.Residuo;
import br.univille.Caso6.Sistema;

public class HistoricoTeste {
    
    @Test
    public void verificaHistorico() {
        Sistema sis = new Sistema();
        Residuo res = new Residuo("Papel", "Sulfite");
        Residuo res2 = new Residuo("Papel", "Papelão");

        sis.escaneiaResiduo(res);
        sis.escaneiaResiduo(res2);
        int tamanhoEsperado = 2;

        Assert.assertEquals(tamanhoEsperado, sis.historico.size());
    }
}
