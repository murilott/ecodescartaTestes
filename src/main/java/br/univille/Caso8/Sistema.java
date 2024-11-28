package br.univille.Caso8;

import java.util.HashMap;

public class Sistema {
    public HashMap<Residuo, String> banco = new HashMap<Residuo, String>();

    public void escaneiaResiduo(Residuo res, String data) {
        banco.put(res, data);
    }
}
