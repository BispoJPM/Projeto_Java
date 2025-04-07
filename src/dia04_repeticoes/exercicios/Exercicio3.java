package dia04_repeticoes.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        // Use do-while para pedir uma senha até o usuário digitar "1234".
        
        Scanner sc = new Scanner(System.in);
        int op;


        do {
            System.out.print("Digite uma senha de 4 digitos para sair: ");
            op = sc.nextInt();
            
        } while (op != 1234);
        System.out.println("Programa encerrado.");
    }
    
}
