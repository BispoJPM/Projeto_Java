package dia02_tipos.conteudo;

public class Operadores {
    public static void main(String[] args) {
        
        /* 
        Operadores Matematicos
        +	Adição	
        -	Subtração
        *	Multiplicação
        /	Divisão	
        %	Módulo (resto) 
        */
        int a = 10, b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        /*
        Operadores Lógicos
        && AND - E 
        || OR - OU
        !  NOT - NAO 
        */ 

        boolean condicao1 = (5 > 3);
        boolean condicao2 = (8 < 5);

        System.out.println("AND (&&): " + (condicao1 && condicao2));
        System.out.println("OR (||): " + (condicao1 || condicao2));
        System.out.println("NOT (!): " + !condicao1);
        
        /* 
        Operadores Relacionais
        ==	Igualdade	
        !=	Diferente	
        >	Maior que	
        <	Menor que	
        >=	Maior ou igual
        <=	Menor ou igual
         */

         int x = 10, y = 20;
        
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }
}
