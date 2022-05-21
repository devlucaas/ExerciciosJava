package LISTA2;
import java.util.Scanner;

public class l2q2 {
    public static void main(String[] args) {
        Float salario = 0.0f;
        Float media = 0.0f;
        int numeroFilhos;
        int contador = 1;
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("Informe seu salário: ");
            salario =  leitor.nextFloat();
            if(salario  == -1){
                break;
            }
            media = salario/contador;
            contador++;

            System.out.println("Quantos filhos você tem");
            numeroFilhos = leitor.nextInt();
        }
        while(salario  != -1);
            System.out.printf("A média dos salários é: %.2f", media);
        
    }
}
