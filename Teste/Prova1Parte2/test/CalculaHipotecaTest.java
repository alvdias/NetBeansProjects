import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class CalculaHipotecaTest {
    
    public CalculaHipotecaTest() {
    }

    @Test
    public void ct01() {
        //Parametros
        int genero = 0;
        int idade = 35;
        int salario = 20;
        int fator = 80;
        
        //Chamada do Metodo
        CalculaHipoteca calculaHipoteca = new CalculaHipoteca();
        int resp = calculaHipoteca.calcularValorMaximoHipoteca(genero, idade, salario);
        
        //Teste
        assertEquals(salario * fator, resp);
    }
    
    @Test
    public void ct02() {
        //Parametros
        int genero = 0;
        int idade = 50;
        int salario = 20;
        int fator = 40;
        
        //Chamada do Metodo
        CalculaHipoteca calculaHipoteca = new CalculaHipoteca();
        int resp = calculaHipoteca.calcularValorMaximoHipoteca(genero, idade, salario);
        
        //Teste
        assertEquals(salario * fator, resp);
    }
    
    @Test
    public void ct03() {
        //Parametros
        int genero = 1;
        int idade = 35;
        int salario = 20;
        int fator = 60;
        
        //Chamada do Metodo
        CalculaHipoteca calculaHipoteca = new CalculaHipoteca();
        int resp = calculaHipoteca.calcularValorMaximoHipoteca(genero, idade, salario);
        
        //Teste
        assertEquals(salario * fator, resp);
    }
    
    @Test
    public void ct04() {
        //Parametros
        int genero = 1;
        int idade = 50;
        int salario = 20;
        int fator = 30;
        
        //Chamada do Metodo
        CalculaHipoteca calculaHipoteca = new CalculaHipoteca();
        int resp = calculaHipoteca.calcularValorMaximoHipoteca(genero, idade, salario);
        
        //Teste
        assertEquals(salario * fator, resp);
    }
}
