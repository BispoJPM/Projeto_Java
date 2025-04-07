package dia02_tipos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        // Crie um programa que calcule a soma, subtração, multiplicação e divisão de dois números informados pelo usuário.
        
        Scanner conta = new Scanner(System.in);
        Double n1;
        Double n2;

        System.out.println("Digite o primeiro numero: ");
        n1 = conta.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = conta.nextDouble();

        System.out.println("A soma é: " + (n1 + n2));
        System.out.println("A subtração é: " + (n1 - n2));
        System.out.println("A multiplicação é: " + (n1 * n2));
        System.out.println("A divisão é: " + (n1 / n2));
   }
}
