package LISTA2;
import java.util.Scanner;

public class l2q7 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        final int m = 5;
        int matrizA[][] = new int[m][m];
        int matrizB[][] = new int[m][m];
        int i, j;
    
        System.out.println("Informe os valores da Matriz A: ");
        for(i = 0; i<m; i++){
            for(j = 0; j<m; j++){
                System.out.print("["+i+","+j+"]:" );
             matrizA[i][j] = leitor.nextInt();
            }
        }
    
        System.out.println("Informe os valores da Matriz B: ");
        for(i = 0; i<m; i++){
            for(j = 0; j<m; j++){
                System.out.print("["+i+","+j+"]:" );
                matrizB[i][j] = leitor.nextInt();
            }
        }
    
        System.out.println("Soma das Matrizes: ");
        for(i = 0; i<m; i++){
            for(j = 0; j<m; j++){
                System.out.print(matrizA[i][j] + matrizB[i][j] + " "); 
            }
            System.out.println("");
        }
    
        System.out.println("Subtração das Matrizes: ");
        for(i = 0; i<m; i++){
            for(j = 0; j<m; j++){
                System.out.print(matrizA[i][j] - matrizB[i][j] + " "); 
            }
            System.out.println("");
        }
    }  
}