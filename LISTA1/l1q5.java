package LISTA1;

import java.util.Scanner;
import java.util.zip.Deflater;

public class l1q5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int prato;
        int bebida;
        int somaCal =  0;

        System.out.println("Escolha um prato: Italiano(1), Japonês(2), Salvadoreno(3): ");
        prato = leitor.nextInt();

        switch(prato){
            case 1: somaCal += 750;
            break;
            case 2: somaCal += 342;
            break;
            case 3: somaCal += 545;            
            break;
            default: System.out.println("opção inválida");
        }

        System.out.println("Escolha uma bebida: Chá(1), Suco de laranja(2), Refrigerante(3): ");
        bebida = leitor.nextInt();

        switch (bebida) {
            case 1: somaCal +=30;
                break;
            case 2: somaCal +=80;
                break;
            case 3: somaCal +=90;
                break;
            default:System.out.println("Opção inválida");
                break;
        }
        System.out.println("Quantidade de calorias do seu prato é de: " + somaCal + "cal");
        
    }
}
