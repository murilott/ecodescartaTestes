package Caso4;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso4.Celular;
import br.univille.Caso4.Sistema;

public class NotificacaoTeste {

    @Test
    public void verificaNotificacao() {
        Sistema sis = new Sistema();
        sis.novaNotificao("Lembre-se de reciclar os resíduos de forma correta");
        sis.novaNotificao("Manuseie resíduos perigosos, como pilhas estragadas, com luvas.");

        Celular cel = new Celular();
        sis.enviarNotificacao(cel);

        int notificacoesEsperadas = 2;

        Assert.assertEquals(notificacoesEsperadas, cel.listaNotificacao.size());
    }
}
