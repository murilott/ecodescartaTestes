package Caso2;

import org.junit.Assert;
import org.junit.Test;

import br.univille.Caso2.Sistema;

public class BuscaTeste {

    @Test
    public void verificaBusca() {
        Sistema sis = new Sistema();
        sis.getInfoResiduos().put("Papel Sulfite", "Lixeira axul(recicálvei)");
        sis.getInfoResiduos().put("Papel Manteiga", "Lixo comum(não reciclável)");
        sis.getInfoResiduos().put("Papel Cartão", "Lixeira axul(recicálvei)");
        sis.getInfoResiduos().put("Papel Toalha", "Lixo comum(não reciclável)");
        
        String busca = "Papel";
        
        for ( String tipo : sis.getInfoResiduos().keySet()) {
            Assert.assertTrue(tipo.contains(busca));
        }    
    }

    @Test 
    public void verificaObterBusca() {
        Sistema sis = new Sistema();
        sis.getInfoResiduos().put("Papel Sulfite", "Lixeira axul(recicálvei)");
        sis.getInfoResiduos().put("Papel Manteiga", "Lixo comum(não reciclável)");
        sis.getInfoResiduos().put("Papel Cartão", "Lixeira axul(recicálvei)");
        sis.getInfoResiduos().put("Papel Toalha", "Lixo comum(não reciclável)");

        String busca2 = "Papel Sulfite";
        String busca2info = "Lixeira axul(recicálvei)";
        
        Assert.assertTrue(sis.getInfoResiduos().containsKey(busca2));
        Assert.assertTrue(sis.getInfoResiduos().get(busca2).equals(busca2info));
    }
}
