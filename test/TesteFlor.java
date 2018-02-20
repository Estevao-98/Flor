
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import flor.Flor;
import flor.CampoFlorido;
import flor.Petala;


public class TesteFlor {
    
    public TesteFlor() {
    }
    
     @Test
     public void testeAtribuicaoNomeFlor(){
       Flor flor = new Flor();
       flor.setNomeFlor("Margarida");
       assertEquals(flor.getNomeFlor(),"Margarida");
     }

     @Test
     public void testeAtribuicaoCorFlor(){
       Flor flor = new Flor();
       flor.setCorFlor("Branca");
       assertEquals(flor.getCorFlor(),"Branca");
     }
     
     
     
}
