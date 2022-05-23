package Q6;
import Q6.Carro;

public class Carro1 {
    public static void main (String [] args){
        Carro ferrari = new Carro("Ferrari", "F-x0752021", 2021, "Flex"); 
        System.out.printf("Marca: %s\n Modelo: %s\n Ano: %s\n Tipo do combustivel: %s", ferrari.getMarca(), ferrari.getModelo(), ferrari.getAno(), ferrari.getTipo());
    }   
}
