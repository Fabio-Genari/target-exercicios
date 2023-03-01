package target.exercicios;

 /*
Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule o percentual de representação
que cada estado teve dentro do valor total mensal da distribuidora.
*/
public class Ex4_PercentualEstados {
    public static void main(String[] args) {
        double percentualSp, percentualRj, percentualMg, percentualEs, percentualOutros,
               faturamentoSp = 67836.43, faturamentoRj = 36678.66, faturamentoMg = 29229.88,
               faturamentoEs = 27165.48, faturamentoOutros = 19849.53,
               faturamentoTotal = faturamentoSp + faturamentoRj + faturamentoMg + faturamentoEs + faturamentoOutros;

        percentualSp = (faturamentoSp * 100) / faturamentoTotal;
        percentualRj = (faturamentoRj * 100) / faturamentoTotal;
        percentualMg = (faturamentoMg * 100) / faturamentoTotal;
        percentualEs = (faturamentoEs * 100) / faturamentoTotal;
        percentualOutros = (faturamentoOutros * 100) / faturamentoTotal;

        System.out.println("Faturamento Total: R$" + faturamentoTotal);
        System.out.printf("Percentual de representação de SP: %.2f%c" , percentualSp, '%');
        System.out.printf("\nPercentual de representação de RJ: %.2f%c" , percentualRj, '%');
        System.out.printf("\nPercentual de representação de MG: %.2f%c" , percentualMg, '%');
        System.out.printf("\nPercentual de representação de ES: %.2f%c" , percentualEs, '%');
        System.out.printf("\nPercentual de representação de outros estados: %.2f%c" , percentualOutros, '%');
    }
}
