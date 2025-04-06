package Dia3_Condicionais;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int num1 = sc.nextInt();

        switch(num1) {
            case 1:
                System.out.println("Você escolheu a Segunda-Feira");
                break;
            case 2:
                System.out.println("Você escolheu a Terça-Feira");
                break;
            case 3:
                System.out.println("Você escolheu a Quarta-Feira");
                break;
            case 4:
                System.out.println("Você escolheu a Quinta-Feira");
                break;
            case 5:
                System.out.println("Você escolheu a Sexta-Feira");
                break;
            case 6:
                System.out.println("Você escolheu o Sabado");
                break;
            case 7:
                System.out.println("Você escolheu Domingo");
                break;
        }
    }
}
