package dia04_repeticoes.exercicios.WHILE;
import java.util.Scanner;

public class Ex5While {
    public static void main (String[]args){

        Scanner numero = new Scanner (System.in);
        
        System.out.print("Digite um numero: ");
        int tabuaba = numero.nextInt();
        int tabu = 1;
        
        while(tabu <= 10){
            int soma = tabuaba * tabu;
            System.out.println(tabuaba + " x " + tabu + " = " + soma);
            tabu++;
    
        }
    }
}
