package LISTA6.Q6;

public class Gerente extends Funcionario{
    protected int area;

    public Gerente(){

    }
    
    public Gerente(String nome, String cpf, String matricula, float salario, int area) {
        super(nome, cpf, matricula, salario);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Gerente [cpf=" + cpf + ", nome=" + nome + ", matricula=" + matricula + ", salario=" + salario + ", area=" + area + "]";
    }
    
}