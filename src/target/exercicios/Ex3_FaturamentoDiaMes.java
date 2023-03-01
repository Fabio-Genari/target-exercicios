package target.exercicios;

/*
Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 */

public class Ex3_FaturamentoDiaMes {
    public static void main(String[] args) {
        double[] valores = {22174.1664, 24537.6698, 26139.6134,
                            0.0, 0.0, 26742.6612,
                            0.0, 42889.2258, 46251.174,
                            11191.4722, 0.0 ,0.0,
                            3847.4823, 373.7838, 2659.7563,
                            48924.2448, 18419.2614, 0.0,
                            0.0, 35240.1826, 43829.1667,
                            18235.6852, 4355.0662, 13327.1025,
                            0.0, 0.0, 25681.8318,
                            1718.1221, 13220.495, 8414.61};
        double menorValor = valores[0], maiorValor = 0, diasSemFaturamento = 0, totalMensal = 0, mediaMensal, diasMaiorFaturamento = 0;

        for (int i=0; i<(valores.length-1); i++){
            if (valores[i] < menorValor && valores[i] != 0.0)
                menorValor = valores[i];
            if (valores[i] > maiorValor)
                maiorValor = valores[i];
            if (valores[i] == 0.0)
                diasSemFaturamento++;
            totalMensal = totalMensal + valores[i];
        }

        mediaMensal = totalMensal / (valores.length-diasSemFaturamento);

        for (int i=0; i<(valores.length-1); i++){
            if (valores[i] != 0.0 && valores[i] > mediaMensal){
                diasMaiorFaturamento++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Total Mensal: " + totalMensal);
        System.out.printf("Média do faturamento mensal: %.2f" , mediaMensal);
        System.out.println("\nNúmero de dias com faturamento superior à média: " + diasMaiorFaturamento);
    }
}