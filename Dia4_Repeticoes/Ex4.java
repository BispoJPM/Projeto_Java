package Dia4_Repeticoes;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner tbt = new Scanner(System.in);
        
        System.out.println("Escolha um numero para Tabuada: ");
        System.out.println("\n");
        int tau = tbt.nextInt();

        for (int num = 1; num <= 10; num++){
            System.out.println(tau + " * " + num + " = " + (tau * num));
        }
    }   
}
