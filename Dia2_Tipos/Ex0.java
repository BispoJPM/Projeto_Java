package Dia2;

import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {

        // Crie um programa que imprime seu nome e idade no console.
        
        byte nota1 = 10;
        byte nota2 = 8;
        byte nota3 = 5;

        int notas = nota1 + nota2 + nota3;
        float media = notas/3f;

        System.out.println("Minhas notas são: " + nota1 + ", " + nota2 +", "+ nota3);
        System.err.println("Minha média: " + media) ;


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
