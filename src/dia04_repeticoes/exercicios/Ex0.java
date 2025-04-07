package dia04_repeticoes.exercicios;

public class Ex0 {
    public static void main(String[] args) {
        
        int prog = 0;

        while (prog <= 10){
        System.out.println("while: " + prog);
        prog ++;
        }

        int prog1 = 0;
        do {
            System.out.println("Do While: " + prog1);
            prog1 ++;
        } while (prog1 <=10);

        for (int prog2 = 0; prog2 <= 10; prog2++){
            System.out.println("For: " + prog2);
        }
    }
    
}
