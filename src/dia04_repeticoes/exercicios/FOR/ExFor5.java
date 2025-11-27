package dia04_repeticoes.exercicios.FOR;

import java.util.Scanner;

public class ExFor5 {
    public static void main(String[] Args) {
    

        // Peça 10 numero e diga o maior/menor 


        Scanner num = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int a = 1; a <=10; a++) {
        System.out.print("Digite o " + a + "° numero: ");
        int numero = num.nextInt();
        
        if (numero > maior) {
            maior = numero;
         }

        if (numero < menor) {
            menor = numero;
        }
    
    }
        System.out.print("O menor numero é o: " + menor);
        System.out.print("O maior numero é o: " + maior);
    
    }
}
