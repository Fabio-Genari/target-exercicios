package target.exercicios;

import java.util.Scanner;

/*
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores,
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci
e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/

public class Ex_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero,num1 = 0, num2 = 1, resultado = 1;

        System.out.println("Informe um número: ");
        numero = scan.nextInt();

        System.out.printf("Sequência: %d %d ", num1, num2);
        do {
            System.out.printf("%d ", resultado);

            if (numero == resultado || numero == 0) {
                System.out.println("\nO número " + numero + " pertence a sequência de Fibonacci!");
                break;
            }
            num1 = num2;
            num2 = resultado;
            resultado = num1 + num2;
        }while (resultado < 1000);

        if (numero != resultado)
            System.out.println("\nO número " + numero + " não pertence a sequência de Fibonacci!");
    }
}
