package dia04_repeticoes.exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int op;


        do {
            System.out.println("Menu:");
            System.out.println("1 - Ola");
            System.out.println("2 - Tchau");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção acima: ");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                System.out.println("Você escolheu dizer Olá!");
                    break;
                case 2:
                System.out.println("Você escolheu dizer Tchau!");
                    break;    
            }
        } while (op != 0);
        System.out.println("Programa encerrado.");
    }
    
}
