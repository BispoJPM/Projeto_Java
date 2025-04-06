package Dia3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: " );
        double nota = sc.nextDouble();
        System.out.println("Digite a nota 2: " );
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3: " );
        double nota3 = sc.nextDouble();

        Double media;
        media = (nota + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado com nota: " + media);
        }else if (media >= 5 || media <= 7) {
            System.out.println("Recuperação com nota: " + media);
        }else{
            System.out.println("Reprovado com nota: " + media);
        }
    }
}
