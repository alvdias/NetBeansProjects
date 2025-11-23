public class Aula02 {
    public static void main(String[] args) {
        //operacoes

        //Operadores
        int idade = 35;
        System.out.println("Idade: " + idade);

        //matematicos
        int soma = idade + 10;
        System.out.println("resultado da idade + 10: " + soma);

        //multiplicacao
        double multiplicacao = idade * 2.5;
        System.out.println("Resultado da idade * 2: " + multiplicacao);

        //divisao
        double diviso = idade / 2;
        System.out.println("Resultado da idade dividido 2: " + diviso);

        //modulo
        double modulo = diviso % 2;
        System.out.println("Resultado da idade modulo diviso 2: " + modulo);

        int incremento = 15;
        incremento++;
        System.out.println("Resultado da idade incremento: " + incremento);
        incremento--;
        incremento--;
        System.out.println("Resultado da idade incremento: " + incremento);

        long valo1r1 = 1L;
        long valo2r1 = 1L;

        if(valo1r1 != valo2r1){
            System.out.println("é igual ");
        } else {
            System.out.println("é diferente");
        }

        boolean verdade = true;
        boolean falsa = false;

        System.out.println(verdade && falsa);
    }
}
