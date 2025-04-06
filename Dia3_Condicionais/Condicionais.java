package Dia3_Condicionais;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        
        /*
         IF
         IF...ELSE
         ELSE
         SWITCH
         ?
         */

         //  == > < >= <= != ! (Retorna True ou False)
          
         if(0>10){ //SE 0 É MAIOR QUE 10 IMPRIMIR 'DEU CERTO'
            System.out.println("deu certo");
         }else if(0<10){ // SE 0 FOR MENOR QUE 10 IMPRIMIR 'OPA'
            System.out.println("Opa");
         }else{ // SE NÃO, IMPRIMIR 'FINAL'
            System.out.println("Final");
         }
         System.out.println("Fim");
         

         int nota = 10;
         int media = 6;
         int faltasmax = 20;
         int faltas = 19;
         String teste;

         teste = (nota >= 6 ? "Aprovado" : "Reprovado"); // operação ternario depois do '?' deve se colocar 2 resultados divididos por ":"
         System.out.println(teste);



         Scanner teste2 = new Scanner(System.in);
         System.out.println("Digite uma opção de 1 até 3: ");
         int op = teste2.nextInt();

         switch(op){
            case 1:
            System.out.println("deu certo");
            break;
            case 2:
            System.out.println("deu certo 2");
            break;
            default:
            System.out.println("nao deu");
         }
    }
}
