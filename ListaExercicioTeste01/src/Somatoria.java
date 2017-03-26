/**
 *
 * @author diego
 */
public class Somatoria {

    MathOps mathOps;

    public Somatoria(MathOps mathOps) {
        this.mathOps = mathOps;
    }

    /**
     * @param numeros
     * @return a somatoria do fatorial de cada inteiro no array numeros
     */
    public int somaDeFatoriais(int numeros[]) {
        int soma = 0;
        for (int numero : numeros) {
            soma += this.mathOps.fatorial(numero);
        }
        return soma;
    }
}
