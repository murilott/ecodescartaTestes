package br.univille.Caso4;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
    public List<String> notificacao = new ArrayList<>();

    public void novaNotificao(String not) {
        notificacao.add(not);
    }

    public void enviarNotificacao(Celular celular) {
        for (String not : notificacao) {
            celular.listaNotificacao.add(not);
        }
    }
}
