package dia04_repeticoes.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        // Peça 5 números ao usuário com while e calcule a média.

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int nums = 0; // Conta quantos números foram digitados

        System.out.println("Digite 5 números:");

        while (nums < 5) { // Repete até ler 5 números
            System.out.print("Número " + (nums + 1) + ": ");
            int num = sc.nextInt();
            soma += num;
            nums++;
        }

        double media = (double) soma / 5; // Calcula a média
        System.out.println("A média dos números é: " + media);
    }
}