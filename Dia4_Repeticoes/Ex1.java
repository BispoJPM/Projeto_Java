package Dia4_Repeticoes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros: ");
        int num = sc.nextInt();
        int soma = 0;

        while (num != 0){
            System.out.println("Digite os numeros: ");
            soma += num;
            num = sc.nextInt();
        }
    
        System.out.println("A soma de todos os numeros é: " + soma);
    }
    
}
