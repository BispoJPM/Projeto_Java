package dia04_repeticoes.exercicios.DOWHILE;
import java.util.Scanner;

public class Ex1 {
    public static void main (String[]args){

    
    Scanner sn = new Scanner (System.in);
    String ab;

    do {
        System.out.println("Digite um numero: ");
        int num = sn.nextInt();
        System.out.println("Deseja continuar? (S/N) ");
        ab = sn.next();

    } while (!ab.equals("N"));
        
        System.out.println("Acabou");
    
}
}



