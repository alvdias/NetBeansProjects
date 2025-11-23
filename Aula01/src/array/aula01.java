package array;

import java.util.Arrays;
import java.util.List;

public class aula01 {
    public static void main(String[] args) {

        //array
        //estrutura de dados simples para armazenar uma colecao de elementos
        //declarando

        //tipo 1
        int[] arrayDeInt[];
        //tipo 2
        int arrayDeInt2[];
        //tipo 3
        int[] arrayDeInt3 = new int[20];
        Integer[] arrayDeInt4 = {1,2,3,4,5,6};

        int tamArray = arrayDeInt4.length;
        System.out.println(tamArray);

        List<Integer> itens = Arrays.asList(arrayDeInt4);
        itens.forEach(System.out::println);

        String[] treinamento = new String[] {
                "A", "B", "C", "D", "E", "F"
        };
        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 0, treinamento.length);
        List<String> treinamentoNomeList = List.of(treinamentoNome);
        treinamentoNomeList.forEach(System.out::println);

        String[] arrayComDois = Arrays.copyOf(treinamentoNome, 2);
        List<String> arrayComDoisList = Arrays.asList(arrayComDois);
        arrayComDoisList.forEach(System.out::println);

        System.out.println("Resultado Final: ");
    }
}
