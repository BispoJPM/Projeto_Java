package dia04_repeticoes.exercicios.WHILE;
import java.util.Scanner;

public class Ex1While {
    public static void main(String[] args){

        //Somar todos os numeros até digitar 0

        Scanner while1 = new Scanner(System.in);
        int num = -1;
        int soma = 0;

        while( num != 0){
            System.out.print("Digite um numero: ");
            num = while1.nextInt();

            soma =+ num;

        }

        System.out.println("A soma de todos é: ");
    }
}
