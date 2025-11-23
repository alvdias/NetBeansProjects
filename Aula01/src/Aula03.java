public class Aula03{
    public static void main(String[] args){



        //condicoes

        long valor1 = 111111111111L;
        long valor2 = 21212212L;

        if (valor1 == valor2){
            System.out.println("Iguais");
        }else if (valor1 < valor2) {
            System.out.println("valor 1 é menor que valor 2");
        } else {
            System.out.println("diferentes");
        }

        //switch case
        String nomeMes = "December";

        switch (nomeMes){
            case "Janeiro":
                System.out.println("01");
                break;
            case "Fevereiro":
                System.out.println("02");
                break;
            case "Marco":
                System.out.println("03");
                break;
            case "Abril":
                System.out.println("04");
                break;
            case "Maio":
                System.out.println("05");
                break;
            case "Junho":
                System.out.println("06");
                break;
            case "Julho":
                System.out.println("07");
                break;
            case "Agosto":
                System.out.println("08");
                break;
            case "Setembro":
                System.out.println("09");
                break;
            case "Outubro":
                System.out.println("10");
                break;
            case "Novembro":
                System.out.println("11");
                break;
            case "Dezembro":
                System.out.println("12");
                break;

            default: System.out.println("QUe mes é esse?");
            break;
        }
    }
}
