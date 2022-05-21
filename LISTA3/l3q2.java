package LISTA3;
import java.util.Scanner;

public class l3q2 {
    private static Scanner leitor = new Scanner(System.in);
    private static char caracter;

    public static float mediaAluno(float nota1, float nota2, float nota3, char caracter){
        if(caracter == 'A'){
            return 1;
        }else if(caracter == 'P'){
            return 0;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        float soma;
        System.out.println("Digite sua primeira nota: ");
        float nota1 = leitor.nextInt();

        System.out.println("Digite sua segunda nota: ");
        float nota2 = leitor.nextInt();

        System.out.println("Digite sua terceira nota: ");
        float nota3 = leitor.nextInt();

        System.out.println("Digite letra A (média Aritmética) ou letra P (média Ponderada): ");
        caracter =  leitor.next().charAt(0);

        if(mediaAluno(nota1, nota2, nota3, caracter) == 1){
            soma = (nota1 + nota2 + nota3)/3;
            System.out.println(soma);
        }else if(mediaAluno(nota1, nota2, nota3, caracter) == 0){
            soma = ((nota1*5) + (nota2*3) + (nota3*2))/10;
            System.out.println(soma);
        }else{
            System.out.println("Valor inválido");
        }
    }
}
