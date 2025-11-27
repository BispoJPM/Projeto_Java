package dia04_repeticoes.exercicios;

import java.util.Scanner;

public class ExFor4 {
    public static void main(String[] args) {

        // Digitar um numero pra ver o fatorial 
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para ver o fatorial de N: ");
        int numero = scanner.nextInt();

        for (int t = 1, fatorial = 1; t <= numero; t++) {
            fatorial *= t;
            System.out.println("Fatorial de " + t + " é: " + fatorial);
        }
    }
}
