package dia04_repeticoes.exercicios.WHILE;
import java.util.Scanner;


public class Ex2While {
    public static void main (String[] args){

        // 10 numeros e ver o maior

        Scanner num = new Scanner(System.in);
        int ab = 1;
        int maior = Integer.MIN_VALUE;

        while (ab <= 10){
        System.out.print("Digite um numero: ");
        int numero = num.nextInt();

        if (numero>maior){
            maior = numero;
        }
        ab++;
        }
        System.out.print("o maior numero  é o: " + maior);
    }

    
}
