package br.univille.Caso6;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
    public List<Residuo> historico = new ArrayList<Residuo>();

    public void escaneiaResiduo(Residuo res) {
        historico.add(res);
    }
}
