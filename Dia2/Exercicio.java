package Dia2;

public class Exercicio {
    public static void main(String[] args) {
        byte nota1 = 10;
        byte nota2 = 8;
        byte nota3 = 5;

        int notas = nota1 + nota2 + nota3;
        float media = notas/3f;

        System.out.println("Minhas notas são: " + nota1 + ", " + nota2 +", "+ nota3);
        System.err.println("Minha média: " + media) ;
    }
}
