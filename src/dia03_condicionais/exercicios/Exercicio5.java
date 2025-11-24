package dia03_condicionais.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        // Crie um programa que receba o número da semana (1 a 7) e imprima o nome correspondente.

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Digite um número de 1 a 7: ");
        // int num1 = sc.nextInt();

        // switch(num1) {
        //     case 1:
        //         System.out.println("Você escolheu a Segunda-Feira");
        //         break;
        //     case 2:
        //         System.out.println("Você escolheu a Terça-Feira");
        //         break;
        //     case 3:
        //         System.out.println("Você escolheu a Quarta-Feira");
        //         break;
        //     case 4:
        //         System.out.println("Você escolheu a Quinta-Feira");
        //         break;
        //     case 5:
        //         System.out.println("Você escolheu a Sexta-Feira");
        //         break;
        //     case 6:
        //         System.out.println("Você escolheu o Sabado");
        //         break;
        //     case 7:
        //         System.out.println("Você escolheu Domingo");
        //         break;
        // }

        Scanner bebida = new Scanner(System.in);

        int bebidae = bebida.nextInt();

        switch(bebidae) {
            case 1:
                System.out.println("Coca-Cola");
                break;
            case 2:
                System.out.println("Pepsi");
                break;
            case 3:
                System.out.println("Fanta");
                break;
            case 4:
                System.out.println("Guaraná");
                break;
            case 5:
                System.out.println("Sprite");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
