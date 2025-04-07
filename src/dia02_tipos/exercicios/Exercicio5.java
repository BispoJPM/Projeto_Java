package dia02_tipos.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        Float num;

        System.out.print("Digite um numero e veremos seu dobro, triplo e metade: ");
        num = sc.nextFloat();

        System.out.println("O dobro de " + num + " é: " + (num * 2));
        System.out.println("O triplo de " + num + " é: " + (num * 3));
        System.out.println("A metade de " + num + " é: " + (num / 2));
}
    
}
