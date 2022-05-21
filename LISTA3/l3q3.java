package LISTA3;
import java.util.Scanner;

public class l3q3 {
    public static Scanner leitor = new Scanner(System.in);
    
    public static int verificaTriangulo(int a, int b, int c){
        if(a != b && b != c && a != c){
            return 1;
        }else if(a == b && b == c){
            return 0;
        }else{
            return 2;
        }
    }
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Digite o lado a: ");
        a = leitor.nextInt();
        System.out.println("Digite o lado b: ");
        b = leitor.nextInt();
        System.out.println("Digite o lado c: ");
        c = leitor.nextInt();
        if(a < b + c && b < a + c && c < a + b){
            System.out.println("Pode ser triângulo!");

            if(verificaTriangulo(a, b, c) == 1){
                System.out.println("Triangulo Escaleno");
            }else if(verificaTriangulo(a, b, c) == 0){
                System.out.println("Triangulo Equilátero");
            }else{
                System.out.println("Triangulo Isósceles");
            }
        }else{
            System.out.println("Não pode formar triângulo");
        }
    }
}
