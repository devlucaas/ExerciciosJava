package LISTA3;
import java.util.Scanner;

public  class l3q4{
    private static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Informe uma palavra: ");
       String nome1 = leitor.nextLine();
       System.out.println("Informe outra palavra: ");
       String nome2 = leitor.nextLine();
       nome1 = nome1.toUpperCase();
       nome2 = nome2.toUpperCase();

       if(nome1.equals(nome2)){
           System.out.println("Strings iguais!! :D");
       }else{
           System.out.print(nome1+nome2);
       }
    }
}