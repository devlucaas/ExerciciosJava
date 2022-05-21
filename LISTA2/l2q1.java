package LISTA2;

import java.util.Scanner;

public class l2q1 {
    public static void main(String[] args) {
        int numero;
        int resultado;
        int contador = 1;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        for(contador = 1; contador <=10; contador++){
            resultado = numero * contador;
            System.out.println(numero + " * " + contador + " = " + resultado);
        }
    }
}
