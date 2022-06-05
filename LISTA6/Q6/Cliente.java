package LISTA6.Q6;

public class Cliente extends Pessoa{
    
    protected int codigo;

    public Cliente(){

    }
    
    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", nome=" + nome + ", codigo=" + codigo + "]";
    }
    
    
}