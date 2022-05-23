package LISTA4.Q6;
import LISTA4.Q5.*;

public class Carro1 {
    public static void main (String [] args){
        Carro ferrari = new Carro("Ferrari", "F-x0752021", 2021, "Flex"); 
        System.out.printf("Marca: %s\n Modelo: %s\n Ano: %s\n Tipo do combustivel: %s", ferrari.getMarca(), ferrari.getModelo(), ferrari.getAno(), ferrari.getTipo());
    }   
}
