
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class CaracteresTest {
    
    private Caracteres caracteres = new Caracteres();

    public CaracteresTest() {
        caracteres = new Caracteres();
    }

    @Test
    public void ClassesValidas() {
        String resp = caracteres.getPosicao(7, "abcdefg", 'c');
        assertEquals("3", resp);
    }

    @Test
    public void ClassesInvalidas01() {
        String resp = caracteres.getPosicao(-20, "abcdefg", 'c');
        assertEquals("erro", resp);
    }

    @Test
    public void ClassesInvalidas02() {
        String resp = caracteres.getPosicao(35, "abcdefg", 'c');
        assertEquals("erro", resp);
    }

    @Test
    public void ClassesInvalidas03() {
        String resp = caracteres.getPosicao(7, "abc", 'c');
        assertEquals("erro", resp);
    }

    @Test
    public void ClassesInvalidas04() {
        String resp = caracteres.getPosicao(7, "abcdefgh", 'c');
        assertEquals("erro", resp);
    }

    @Test
    public void ClassesInvalidas05() {
        String resp = caracteres.getPosicao(7, "abcdefg", 'y');
        assertEquals("erro", resp);
    }
}
