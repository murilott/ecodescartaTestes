package br.univille.Caso7;

import java.util.HashMap;

public class Sistema {
    public HashMap<String, String> infoResiduos = new HashMap<String, String>();

    public String retornaFeedback(Residuo res) {
        for ( String tipo : infoResiduos.keySet()) {
            if (res.tipo.equals(tipo)) {
                return infoResiduos.get(tipo);
            }
        }

        return "Item não encontrado";
    }

    public HashMap<String, String> getInfoResiduos() {
        return infoResiduos;
    }

    public void setInfoResiduos(HashMap<String, String> infoResiduos) {
        this.infoResiduos = infoResiduos;
    }
}
