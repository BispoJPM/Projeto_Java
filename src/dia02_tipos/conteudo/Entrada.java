package dia02_tipos.conteudo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner dado =  new Scanner(System.in); // Iniciei um scanner chamado 'dado' 
        String algo; // Delarei a variavel algo como string 


        System.out.println("Fala algo: ");
        algo = dado.next(); // Lê uma palavra -- declarei que a variavel algo vai receber a entrada de dado
        System.out.println("Voce falou: " + algo); // vai printar a variavel algo


        // dado.nextLine(); // Ler uma linha
        // dado.nextInt(); // Ler um
    }

}
