package Dia1_Introducao;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        Integer idade;
        Double altura;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println("Olá, " + nome + ", você tem " + idade + " e mede " + altura + "m");
    }
}
