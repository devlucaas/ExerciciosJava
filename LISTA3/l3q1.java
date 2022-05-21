package LISTA3;
import java.util.Scanner;

public class l3q1{

    private static Scanner leitor = new Scanner(System.in);
    public static int exibirParOuImpar( int numero) {
        if(numero % 2 == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("digite um numero: ");
        int numero = leitor.nextInt();
        if(exibirParOuImpar(numero) == 1){
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }
    }
}