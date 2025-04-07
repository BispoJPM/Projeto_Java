package dia04_repeticoes.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        // Informe a tabuada do número fornecido pelo usuário
        
        Scanner tbt = new Scanner(System.in);
        
        System.out.print("Escolha um numero para Tabuada: ");
    
        int tau = tbt.nextInt();

        for (int num = 1; num <= 10; num++){
            System.out.print("\n" + tau + " * " + num + " = " + (tau * num));
        }
    }   
}
