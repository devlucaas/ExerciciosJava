package LISTA6.Q6;

public class Funcionario extends Pessoa {
    
    protected String matricula;
    protected float salario;

    public Funcionario(){

    }
    
    public Funcionario(String nome, String cpf, String matricula, float salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", matricula=" + matricula + ", salario=" + salario + "]";
    }
}