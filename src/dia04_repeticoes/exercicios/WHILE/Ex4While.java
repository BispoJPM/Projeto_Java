package dia04_repeticoes.exercicios.WHILE;
import java.util.Scanner;
public class Ex4While {
    public static void main (String[] args){
    
    
        Scanner num = new Scanner (System.in);

        System.out.print("Digite um numero para ver sua regressão: ");
        int contagem = num.nextInt();

        while (contagem > 0){
            contagem--;
            System.out.println(contagem);

           
        }


    }
}
