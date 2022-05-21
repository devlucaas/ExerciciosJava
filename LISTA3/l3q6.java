package LISTA3;
import  java.util.Scanner;

public class l3q6 {
    private static Scanner leitor = new Scanner(System.in);
    
    public static int somatorio(int numero){
        if(numero == 0){
            return 0;
        }else{
            return numero + somatorio(numero - 1);
        }
    }
    public static void main(String[] args) {    
        System.out.println("digite um número para calcular a soma de todos os valores dele até 1: ");
        int numero = leitor.nextInt();
        System.out.println("O resultado da soma é " + somatorio(numero));
    }
}
