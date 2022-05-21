package LISTA1;

import java.util.Scanner;

public class l1q2 {
    public static void main(String[] args) {
        int pedaco1;    
        int pedaco2;    
        int pedaco3;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do primeiro pedaço:");
        pedaco1 = leitor.nextInt();

        System.out.println("Digite o tamanho do segundo pedaço:");
        pedaco2 = leitor.nextInt();

        System.out.println("Digite o tamanho do terceiro pedaço:");
        pedaco3 = leitor.nextInt();

        if(pedaco1 < pedaco2 + pedaco3 && pedaco2 < pedaco1 + pedaco3 && pedaco3 < pedaco1 + pedaco2){

            System.out.println("Esses pedaços podem formar um triângulo!!");
        }
        else{
            System.out.println("Esses pedaços não conseguem formar um triângulo!!");
        }
    }  
}
