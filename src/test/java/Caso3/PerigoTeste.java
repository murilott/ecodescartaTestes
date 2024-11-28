package Caso3;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso3.Residuo;

public class PerigoTeste {

    @Test
    public void verificaResiduoPerigoso() {
        Residuo res1 = new Residuo("Pilha A2", "Pilha");
        Residuo res2 = new Residuo("Pilha A3", "Pilha");
        Residuo res3 = new Residuo("Bateria 9V", "Pilha");

        HashMap<String, String> sisInfo = new HashMap<String, String>();
        sisInfo.put("Pilha", "Descartar em local especializado | Cuidado ao manusear pilhas - verifique se há vazamentos");
        
        Assert.assertTrue(sisInfo.containsKey(res1.tipo));
        Assert.assertTrue(sisInfo.containsKey(res2.tipo));
        Assert.assertTrue(sisInfo.containsKey(res3.tipo)); 
    }

}
