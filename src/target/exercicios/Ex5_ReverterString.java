package target.exercicios;

import java.util.Scanner;

//Escreva um programa que inverta os caracteres de um string.

public class Ex5_ReverterString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String frase = scan.next();
        char[] vetor = frase.toCharArray();

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.printf("%c " , vetor[i]);
        }
    }
}
