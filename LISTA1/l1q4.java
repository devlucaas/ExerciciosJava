package LISTA1;

import java.util.Scanner;

public class l1q4 {
    public static void main(String[] args) {
        int idade;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        
        if(idade < 16){
            System.out.println("Não Eleitor");        
        }
        else if(idade >= 18 && idade < 65){
            System.out.println("Eleitor Obrigatório");        
        }
        else{
            System.out.println("Eleitor Facultativo"); 
        }
    }
}
