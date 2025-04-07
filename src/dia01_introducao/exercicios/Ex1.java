package dia01_introducao.exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n1;
        Integer n2;

        System.out.println("Digite o primeiro numero: ");
        n1=sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2=sc.nextInt();

        System.out.println("Soma: " + (n1+n2));
        System.out.println("Subtracao: " + (n1-n2));
        System.out.println("Multiplicacao: " + (n1*n2));
        System.out.println("Divisao: " + (n1/n2));

    }
}
