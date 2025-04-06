package Dia3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======MENU======");
        System.out.println("1. Soma");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        System.out.println("================");


        System.out.println("Escolha uma das opçoes acima: ");
        int op = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        switch (op) {
            case 1:
//                System.out.println("Digite o primeiro valor: ");
//                int num1 = sc.nextInt();
//                System.out.println("Digite o segundo valor: ");
//                int num2 = sc.nextInt();
                System.out.println("O resultado da Soma entre " + num1 + " e " + num2 + " = " + (num1 + num2));
                break;
            case 2:
//                System.out.println("Digite o primeiro valor: ");
//                int num3 = sc.nextInt();
//                System.out.println("Digite o segundo valor: ");
//                int num4 = sc.nextInt();
                System.out.println("O resultado da Subtração entre " + num1 + " e " + num2 + " = " + (num1 - num2));
                break;
            case 3:
//                System.out.println("Digite o primeiro valor: ");
//                int num5 = sc.nextInt();
//                System.out.println("Digite o segundo valor: ");
//                int num6 = sc.nextInt();
                System.out.println("O resultado da Multiplicação entre " + num1 + " e " + num2 + " = " + (num1 * num2));
                break;
            case 4:
//                System.out.println("Digite o primeiro valor: ");
//                int num7 = sc.nextInt();
//                System.out.println("Digite o segundo valor: ");
//                int num8 = sc.nextInt();
                System.out.println("O resultado da Divisão entre " + num1 + " e " + num2 + " = " + (num1 / num2));
                break;

        }
    }
}
