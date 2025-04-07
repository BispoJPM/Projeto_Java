package dia02_tipos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        // Use operadores lógicos para verificar se um número está entre 10 e 100 e é diferente de 50.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        
        boolean num1 = (10 < num && num < 100) && num != 50;
        System.out.println("Está dentro de 10 e 100 e é diferente de 50? " + num1);


    }
}
