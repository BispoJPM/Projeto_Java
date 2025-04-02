package Dia2;

public class Primitivos{
    public static void main(String[] args) {

        // Variaveis do tipo Inteiro:
         byte menor = 127; // -128 até -127
         short pequeno = 32767; // -32768 até 32767
         int maior = 2147483647; // -2147483648 até 2147483647
         long enorme = 922337203685477000l; // -922337203685477001l até 922337203685477000l "Deve ser colocado um 'l' no final do numero para remeter a long"

        // Variaveis do tipo Flutuante:
        float peso = 78.7f; // Utilizar ponto em vez da virgula e adicionar o F no final
        double pi = 3.14758464; // a variavel do tipo double, armazena muitos numeros depois da virgula.

        // Variaveis do tipo Caractere:
        char letra = 'c'; // por padrao a variavel char por padrao deve estar dentro de aspas simples e somente 1 caractere de qualquer tipo.
        
        // Variaveis do tipo Booleano:
        boolean duvida = true; // somente armazena true para verdadeiro ou false para falso


        // Variavel String não é uma primitiva.
        String nome = "Joao"; // tem que ser String com S maisculo e deve estar em aspas duplas.

    }
}