package dia03_condicionais.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        // Crie um programa que verifique se a pessoa é maior de idade.
        
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
