package dia04_repeticoes.exercicios.WHILE;
import java.util.Scanner;


public class Ex3While {
    public static void main(String[] args){

        Scanner senha = new Scanner (System.in);
        int codigo = 0;

        while (codigo != 12345){
            System.out.print("Digite a senha: ");
            codigo = senha.nextInt();
            if (codigo == 12345){
                System.out.print("Acertou");
            } else {
            System.out.print("Errado, tente novamente" + "\n");
            }
        }


    }
    
}
