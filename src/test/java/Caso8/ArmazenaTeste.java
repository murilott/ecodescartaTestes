package Caso8;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso8.Residuo;
import br.univille.Caso8.Sistema;

public class ArmazenaTeste {
    @Test
    public void verificaArmazenamento() {
        Sistema sis = new Sistema();
        Residuo res = new Residuo("Papel", "Sulfite");
        Residuo res2 = new Residuo("Papel", "Papelão");

        sis.escaneiaResiduo(res, "2024-10-10");
        sis.escaneiaResiduo(res2, "2024-10-12");
        int tamanhoEsperado = 2;

        Assert.assertEquals(tamanhoEsperado, sis.banco.size());
    }
}
