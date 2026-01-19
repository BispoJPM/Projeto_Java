package dia05_arrays_listas.conteudo;

public class array {
    public static void main(String[] args) {
        // para declarar um array, temos que fazer uma variável do tipo reference

        int [] idades; // -> isso é uma do tipo reference
        //o colchotes pode ser tanto antes ou depois do nome da variável, mas o ideal é deixar logo após o tipo.

        String [] nomes = null; // -> inicializei essa com null, somente reference pode ser assim, variáveis do tipo primitivo não pode.

        System.out.println(nomes);

        int [] numeros = new int [4]; // -> inicializei o array com 4 posições (0 1 2 3)
        // para atribuir um dado ao array, usamos o nome da variável "numeros" a chave [] com a posição e o valor logo em seguida.

        numeros [0] = 4;
        numeros [1] = 3;
        numeros [2] = 2;
        numeros [3] = 1;
        // numeros [4] = 1; --> não consigo setar um array numa posição que não existe.
        System.out.println(numeros[1]); // --> Pedi para imprimir o número da posição 1.
        // System.out.println(numeros[4]); // não consigo imprimir um array numa posição que não existe.


        for (int i = 0; i < numeros.length; i++)   // aqui o for vai iterar o tamanho todo do array por conta do "length" e vai imprimir tudo.
            System.out.println(numeros[i]);


    }

}
