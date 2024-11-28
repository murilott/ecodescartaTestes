package Caso5;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso5.Residuo;
import br.univille.Caso5.Sistema;

public class ImpactoTeste {

    @Test
    public void verificaImpactoAmbiental() {
        Sistema sis = new Sistema();
        sis.getInfoResiduos().put("Sulfite", "O papel sulfite pode ser reciclado para se transformado em um novo papel.");

        Residuo res = new Residuo("Papel", "Sulfite");
        String impacto = sis.retornaResiduoImpacto(res);

        Assert.assertEquals(sis.getInfoResiduos().get(res.tipo), impacto);
    }
}

