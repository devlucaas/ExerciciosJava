package Q10;

public class l4q10 {
    public static void main (String [] args){
        Conta corrente = new Conta();
        Conta poupanca = new Conta();
        corrente.depositar(1000);
        corrente.sacar(500);

        poupanca.depositar(500);
        poupanca.sacar(1000);
    }
}
