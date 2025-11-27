package dia04_repeticoes.exercicios.FOR;

import java.util.Scanner;

public class ExFor3 {
    public static void main(String[] args) {

        // ver os numeros pares até o numero escolhido
        
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número para ver os números pares até N: ");
        int numero = num.nextInt();

        for( int t =1; t <=numero; t++){
            if (t % 2 ==0){
                System.out.println(t);
            }
        }
    }
}
