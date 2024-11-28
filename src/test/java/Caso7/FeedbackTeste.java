package Caso7;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso7.Residuo;
import br.univille.Caso7.Sistema;

public class FeedbackTeste {

    @Test
    public void verificaFeedback() {
        Sistema sis = new Sistema();
        sis.getInfoResiduos().put("Sulfite", "Muito bem! Este papel amassado pode virar uma folha limpa!");
        sis.getInfoResiduos().put("Manteiga", "Apesar de ser um papel, ele não pode ser reciclado, descarte-o no lixo comum!");
        sis.getInfoResiduos().put("Pilha", "Muito bem! É essencial descartar corretamente pilhas e baterias!");

        Residuo res = new Residuo("Papel", "Sulfite");
        Residuo res2 = new Residuo("Papel", "Manteiga");
        Residuo res3 = new Residuo("Pilha A3", "Pilha");
        String feedback = sis.retornaFeedback(res);
        String feedback2 = sis.retornaFeedback(res2);
        String feedback3 = sis.retornaFeedback(res3);

        Assert.assertEquals(sis.getInfoResiduos().get(res.tipo), feedback);
        Assert.assertEquals(sis.getInfoResiduos().get(res2.tipo), feedback2);
        Assert.assertEquals(sis.getInfoResiduos().get(res3.tipo), feedback3);
    }
}
