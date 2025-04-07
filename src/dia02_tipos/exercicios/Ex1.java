package dia02_tipos.exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double nm;

        System.out.println("Digite um numero: ");
        nm = sc.nextDouble();

        if(nm > 0) {
            System.out.println(nm + " é posivito");
        }else if(nm < 0) {
            System.out.println(nm + " é negativo");
        }else{
            System.out.println("o numero é 0");
        }
    }
}
