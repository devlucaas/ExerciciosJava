package LISTA1;

import java.util.Scanner;

public class l1q3 {
    public static void main(String[] args) {
        Float deposito;
        Float juros;
        Float rendimento;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do depósito:");
        deposito = leitor.nextFloat();

        System.out.println("Digite a taxa de juros:");
        juros = leitor.nextFloat();

        /*System.out.println("Digite em quantos meses você quer calcular:");
        meses = leitor.nextInt();*/
        
        rendimento = (juros/100) * deposito + deposito;

        System.out.println("Seu rendimento é: " + rendimento + " Reais");
    }
}
