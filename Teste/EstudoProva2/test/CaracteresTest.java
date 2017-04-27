
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
    
    //Todas as classes validas
    @Test
    public void ClassesValidas() {
        String resp = caracteres.getPosicao(7, "abcdefg", 'c');
        assertEquals("3", resp);
    }

    // cc < 1
    @Test
    public void ClassesInvalidas01() {
        String resp = caracteres.getPosicao(-20, "abcdefg", 'c');
        assertEquals("erro", resp);
    }

    // cc > 20
    @Test
    public void ClassesInvalidas02() {
        String resp = caracteres.getPosicao(35, "abcdefg", 'c');
        assertEquals("erro", resp);
    }

    // s != cc
    @Test
    public void ClassesInvalidas03() {
        String resp = caracteres.getPosicao(7, "abc", 'c');
        assertEquals("erro", resp);
    }

    // c !incluido s
    @Test
    public void ClassesInvalidas04() {
        String resp = caracteres.getPosicao(7, "abcdefg", 'y');
        assertEquals("erro", resp);
    }
    
    @Test
    public void AVL01() {
        String resp = caracteres.getPosicao(0, "", 'a');
        assertEquals("nao contem", resp);
    }
    
    @Test
    public void AVL02() {
        String resp = caracteres.getPosicao(1, "a", 'a');
        assertEquals("1", resp);
    }
    
    @Test
    public void AVL03() {
        String resp = caracteres.getPosicao(2, "ab", 'a');
        assertEquals("1", resp);
    }
    
    @Test
    public void AVL04() {
        String resp = caracteres.getPosicao(19, "abcdefghijklmnopqrs", 'f');
        assertEquals("6", resp);
    }
    
    @Test
    public void AVL05() {
        String resp = caracteres.getPosicao(20, "abcdefghijklmnopqrst", 'f');
        assertEquals("6", resp);
    }
    
    @Test
    public void AVL06() {
        String resp = caracteres.getPosicao(21, "abcdefghijklmnopqrstu", 'f');
        assertEquals("erro", resp);
    }
    
    @Test
    public void AVL07() {
        String resp = caracteres.getPosicao(21, "abcdefghijkl", 'a');
        assertEquals("1", resp);
    }
    
    @Test
    public void AVL08() {
        String resp = caracteres.getPosicao(20, "abcdefghijklmnopqrst", 't');
        assertEquals("20", resp);
    }
}
