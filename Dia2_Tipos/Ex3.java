package Dia2_Tipos;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double n = sc.nextDouble();

        if (n % 2 == 0){
            System.out.println(n + " é par");
        }else{
            System.out.println(n + " é impar");
        }
    }
}
