package Dia2_Tipos;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        if (num == num2) {
            System.out.println("Os numeros sao iguais");
        } else if (num > num2) {
            System.out.println(num + "é maior que" + num2);
        }else{
            System.out.println(num2 + " é maior que " + num);
        }
    }
}
