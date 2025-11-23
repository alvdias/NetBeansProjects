package array;

import java.util.List;
import java.util.Map;

public class CalculaNota {


            public static void main(String[] args) {

            public static class Disciplina {
                private String codigo;
                private boolean anual; // True se for anual, False se for semestral
                private int numeroAvaliacoesMinimas;

                public Disciplina(String codigo, boolean anual) {
                    this.codigo = codigo;
                    this.anual = anual;
                    this.numeroAvaliacoesMinimas = anual ? 4 : 3;
                }

                public boolean isAnual() {
                    return anual;
                }

                public int getNumeroAvaliacoesMinimas() {
                    return numeroAvaliacoesMinimas;
                }

                public String getCodigo() {
                    return codigo;
                }
            }

            public static class Aluno {
                private String codigo;
                private List<Double> notas;
                private double frequencia;

                public Aluno(String codigo, List<Double> notas, double frequencia) {
                    this.codigo = codigo;
                    this.notas = notas;
                    this.frequencia = frequencia;
                }

                public String getCodigo() {
                    return codigo;
                }

                public List<Double> getNotas() {
                    return notas;
                }

                public double getFrequencia() {
                    return frequencia;
                }
            }

            public static double calcularMediaPonderada(Map<Double, Double> avaliacoes) {
                double somaPesos = 0;
                double somaNotasPonderadas = 0;

                for (Map.Entry<Double, Double> avaliacao : avaliacoes.entrySet()) {
                    double nota = avaliacao.getKey();
                    double peso = avaliacao.getValue();
                    somaNotasPonderadas += nota * peso;
                    somaPesos += peso;
                }

                return somaNotasPonderadas / somaPesos;
            }

            public static String calcularNotaFinal(Disciplina disciplina, Aluno aluno, Map<Double, Double> avaliacoes) {

                // Fluxo alternativo 3.a e 3.b - Verificar se há avaliações suficientes
                if (disciplina.isAnual() && avaliacoes.size() < 4) {
                    return "Avaliações Insuficientes";
                } else if (!disciplina.isAnual() && avaliacoes.size() < 3) {
                    return "Avaliações Insuficientes";
                }

                // Fluxo alternativo 5.a - Verificar se o número de notas corresponde às avaliações
                if (aluno.getNotas().size() < avaliacoes.size()) {
                    return "Notas insuficientes";
                }

                // Cálculo da média ponderada
                double media = calcularMediaPonderada(avaliacoes);

                // Fluxo alternativo 8.a - Verificar a frequência
                if (aluno.getFrequencia() < 75) {
                    return "Reprovado por Frequencia";
                }

                // Verificação da média e decisão final
                if (media >= 7) {
                    return "Aprovado";
                } else if (media >= 4) {
                    return "Exame";
                } else {
                    return "Reprovado";
                }
            }

            public static void main(String[] args) {
                // Exemplo de dados de entrada
                Disciplina disciplina = new Disciplina("MAT101", false); // Disciplina semestral
                Aluno aluno = new Aluno("A123", List.of(6.5, 7.0, 5.5), 80); // 80% de frequência

                // Avaliações com suas notas e pesos
                Map<Double, Double> avaliacoes = Map.of(
                        6.5, 0.3,
                        7.0, 0.4,
                        5.5, 0.3
                );

                String resultado = calcularNotaFinal(disciplina, aluno, avaliacoes);
                System.out.println("Resultado Final: " + resultado);
            }
        }


    }

}
