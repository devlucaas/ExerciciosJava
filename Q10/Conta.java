package Q10;

public class Conta {
    private float saldo;
   
    public Conta(){
       saldo = 0.0f;
    }

    public void depositar(float quantia){
        saldo = saldo + quantia;
        System.out.printf("Deposito efetuado com sucesso!\nSeu novo saldo é %.2f\n",  this.saldo);
    }

    public void sacar(float quantia){
        if(saldo>=quantia){
            saldo = saldo - quantia;
            System.out.printf("Saque efetuado com sucesso!\nSeu novo saldo é %.2f\n",  this.saldo);
        } else{
            System.out.println("Saldo inferior a quantia solicitada!");
        }      
    }
}
