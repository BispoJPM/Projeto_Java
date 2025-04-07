package dia04_repeticoes.conteudo;

public class doWhile {
    public static void main(String[] args) {
        // diferente do While, o Do While segue a mesma logica, porém inversamente...
        // enquanto o while realiza primeiro a condição para depois rodar o codigo
        // o do while faz o contrario.

        /* 
        do{
            codigo
        } while(condicao)
        */ 


        // Quase igual ao while, mas sempre executa ao menos uma vez


        int dot = 10;
        do {
            System.out.println("inverso"); // como não passou pela condição, vai ser printado pelo menos 1 vez
            dot--; // diminuir 1 toda vez
        }while (dot >= 1); // aqui ele roda a condição, se for verdadeira, ele faz o caminho normal.
        
    }
    
}
