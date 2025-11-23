import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {


        //repeticoes
        //for
        //for (int i =0; i<=100; i++){
        //    System.out.println("Nessa repeticao i esta valendo: "+i);
        //}

        //while
/*        Scanner in = new Scanner(System.in);
        var valorSecreto = 0;
        while (valorSecreto != 12345){
            System.out.println("Digite um valor: ");
            valorSecreto = in.nextInt();
            if(valorSecreto == 12345){
                System.out.println("VC acertou");
            } else {
                System.out.println("nao eh esse o valo, tente novamente");
            }
        }*/

        //do while
        int valor = 1;
        do {
            System.out.println(valor);
            valor++;
        } while (valor <= 10);
    }
}
