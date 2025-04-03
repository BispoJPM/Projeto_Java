package Dia3;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        
        Scanner idade = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int id1 = idade.nextInt();
        int maior = 18;
        String ter;

        if(id1 >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Voce é menor de idade");
        }

        ter = (id1 >= 18 ? "Maior de idade" : "Menor de idade");
        System.out.println("Você é " + ter);

    }
}
