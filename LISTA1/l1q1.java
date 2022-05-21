package LISTA1;

import java.util.Scanner;

public class l1q1 {
    public static void main(String[] args) throws Exception {
        String nome;
        String materia;
        Float nota1;
        Float nota2;
        Float nota3;
        Float nota4;
        Float media;
        Scanner leitor  = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        nome = leitor.nextLine();

        System.out.println("Qual é sua materia?");
        materia = leitor.nextLine();

        System.out.println("Qual é sua primeira nota?");
        nota1 = leitor.nextFloat();

        System.out.println("Qual é sua segunda nota?");
        nota2 = leitor.nextFloat();

        System.out.println("Qual é sua terceira nota?");
        nota3 = leitor.nextFloat();

        System.out.println("Qual é sua quarta nota?");
        nota4 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("Seu nome é %s, cursa a disciplina de %s e obteve média %.2f", nome, materia, media);

    }
}
