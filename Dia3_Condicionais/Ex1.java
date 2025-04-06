package Dia3_Condicionais;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 12) {
            System.out.println("Olá" + nome + " você ainda é uma criança");
        }else if (idade >= 13 && idade < 17) {
            System.out.println("Olá" + nome + " você é um adolescente");
        }else if (idade >= 18 && idade < 59) {
            System.out.println("Olá" + nome + " você é um adulto");
        }else {
            System.out.println("Olá" + nome + " você é um idoso");
        }
    }
}
