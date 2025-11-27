package dia04_repeticoes.exercicios.FOR;

import java.util.Scanner;

public class ExFor {

    public static void main(String[] args) {

        // ver a soma do numero

        Scanner num = new Scanner(System.in);

        System.out.println("Digite um número para ver a soma de 1 até N: ");
        int numero = num.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
            System.out.println("Somando: " + soma + " + " + i + " = " + (soma + i));

        }
    }
}