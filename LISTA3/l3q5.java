package LISTA3;
import java.util.Scanner;

public class l3q5 {
    public static Scanner leitor = new Scanner(System.in);
    public static int op;
    public static void main(String[] args) {
        do{
            menu();
            switch(op){
                case 1: lerString(); break;
                case 2: imprimirTamanho(); break;
                case 3: compararString (); break;
                case 4: concatenarStrings(); break;
                case 5: imprimirInverso ();  break;
            }
        } while(op!=0);
    }

    public static void menu(){
        System.out.println("\nSeja bem-vindo ao Menu: ");
        System.out.println("1 - Ler uma string S1");
        System.out.println("2 - Imprimir o tamanho da string S1");
        System.out.println("3 - comparar a string S1  com uma nova string S2");
        System.out.println("4 - Concatenar a string S1 com uma nova string S2");
        System.out.println("5 -  Imprimir a string S1 de forma inversa");
        System.out.println("0 - Sair");
        op = leitor.nextInt();
    }

    public static void lerString(){
        String s1;
        System.out.println("Digite uma palavra (lembre-se dessa palavra): ");
        s1 = leitor.next();
        if(s1.length()<=20){
            System.out.println("A palavra é: " + s1);
        }else{
            System.out.println("A palavra ultrapassa o limite de 20 caracteres");
        }
    }

    public static void imprimirTamanho(){
        String s1;
        System.out.println("Digite a mesma palavra usada acima(ou uma nova se for sua primeira vez): ");
        s1 = leitor.next();
        System.out.println("O tamanho dessa palavra é de" + s1.length() + "caracteres");
    }

    public static void compararString(){
        String s1;
        String s2;
        System.out.println("Digite novamente a palavra usada acima(ou uma nova se for sua primeira vez): ");
        s1 = leitor.next();
        System.out.println("Digite outra palavra: ");
        s2 = leitor.next();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        if(s1.equals(s2)){
            System.out.println("Palavras iguais");
        }else{
            System.out.println("Palavras diferentes");
        }
    }

    public static void concatenarStrings(){
        String s1;
        String s2;
        System.out.println("Digite a primeira palavra que você escreveu nesse programa(ou uma nova se for sua primeira vez): ");
        s1 = leitor.next();
        System.out.println("Digite uma nova palavra ");
        s2 = leitor.next();
        System.out.println(s1+s2);
    }

    public static void imprimirInverso(){
        String s1;
        System.out.println("Digite a primeira palavra que você escreveu nesse programa(ou uma nova se for sua primeira vez): ");
        s1 = leitor.next();
        System.out.println(new StringBuilder(s1).reverse().toString());
    }

}
        


