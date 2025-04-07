package dia03_condicionais.exercicios;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        // Solicite ao usuário um número e diga se é positivo, negativo ou zero.

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu numero: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Ele é negativo");
        } else if (num > 0) {
            System.out.println("Ele é positivo");
        } else {
            System.out.println("Ele é zero");
        }
    }
}

