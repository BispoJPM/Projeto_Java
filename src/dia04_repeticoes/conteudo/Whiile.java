package dia04_repeticoes.conteudo;

public class Whiile {
    public static void main(String[] args) {

        // while (condicao) {metodo/funcao/ a coisa que vai repetir}

        // Quando você não sabe exatamente quantas vezes, mas depende de uma condição


        int variavel = 0; // uma variavel para ele ter um parametro para se basear

        while (variavel < 5) {
            System.out.println("Enquanto minha variavel for menor que 5, vai continuar printando");
            variavel++; // o while vai rodar e vai iterar aqui, adicionando +1 nele mesmo, até chegar em 5
        }
    }
}
