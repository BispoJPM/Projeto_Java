package dia04_repeticoes.exercicios;

import java.util.Scanner;

public class ExFor2 {
    public static void main(String[] args) {
        
        // digitar um numero e ver a tabuada

        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada: ");
        int numero = num.nextInt();

        for (int t=1; t <= 10; t++){
            System.out.println(numero * t);
        } 
    }
}
