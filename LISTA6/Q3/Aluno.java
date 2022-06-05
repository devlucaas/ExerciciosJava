package LISTA6.Q3;

import java.util.Calendar;

public class Aluno extends Pessoa{

    private String matricula;
    
    public Aluno(String nome, String cpf, Calendar dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", dataNasc=" + dataNasc.get(Calendar.DAY_OF_MONTH) + "/" + dataNasc.get(Calendar.MONTH) + "/" + dataNasc.get(Calendar.YEAR) + ", nome=" + nome + ", matricula=" + matricula + "]";
    }
   
    
    
}