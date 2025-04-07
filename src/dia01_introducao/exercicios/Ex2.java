package dia01_introducao.exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base;
        float altura;

        System.out.println("Digite a altura: ");
        base = sc.nextFloat();
        System.out.println("Digite a largura: ");
        altura = sc.nextFloat();
        sc.close();

        System.out.println("A area é:  " + (base*altura));

    }
}
