package pilharestrita;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pilharestrita.PilhaCheiaException;
import pilharestrita.PilhaRestrita;

/**
 *
 * @author diego
 */
public class PilhaRestritaTest {
    
    public PilhaRestritaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void ct01() throws PilhaCheiaException {
        //new
        PilhaRestrita pilhaRestrita = new PilhaRestrita(3);
        //vazia
        assertTrue(pilhaRestrita.vazia());
        //emp
        pilhaRestrita.empilhar("s1");
        //vazia
        assertFalse(pilhaRestrita.vazia());
        //emp (x - 1)
        pilhaRestrita.empilhar("s2");
        pilhaRestrita.empilhar("s3");
        //vazia
        assertFalse(pilhaRestrita.vazia());
    }
    
    @Test
    public void ct02() {
        //new(x)
        PilhaRestrita pilhaRestrita = new PilhaRestrita(3);
        try {
            //desempilhar
            pilhaRestrita.desempilhar();
            fail(); //Nao lanco a excessao
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(PilhaRestritaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //empilhar()
            pilhaRestrita.empilhar("s1");            
            //empilhar(x-1)
            pilhaRestrita.empilhar("s2");
            pilhaRestrita.empilhar("s3");
        } catch (PilhaCheiaException ex) {
            Logger.getLogger(PilhaRestritaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //empilhar()
            pilhaRestrita.empilhar("s4");
            fail(); //Nao lanco a excessao
        } catch (PilhaCheiaException ex) {
            Logger.getLogger(PilhaRestritaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void ct03() {
        //new(x)
        PilhaRestrita pilhaRestrita = new PilhaRestrita(3);
        try {
            //desempilhar
            pilhaRestrita.desempilhar();
            fail(); //Nao lanco a excessao
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(PilhaRestritaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //empilhar()
            pilhaRestrita.empilhar("s1");            
            //empilhar(x-1)
            pilhaRestrita.empilhar("s2");
            pilhaRestrita.empilhar("s3");
        } catch (PilhaCheiaException ex) {
            Logger.getLogger(PilhaRestritaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //empilhar()
            pilhaRestrita.empilhar("s4");
            fail(); //Nao lanco a excessao
        } catch (PilhaCheiaException ex) {
            Logger.getLogger(PilhaRestritaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
