package LISTA6.Q3;

import java.util.Calendar;

public class Pessoa {
    
    protected String nome;
    protected String cpf;
    protected Calendar dataNasc;


    public Pessoa(String nome, String cpf, Calendar dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + cpf + ", dataNasc=" + dataNasc.get(Calendar.DAY_OF_MONTH) + "/" + dataNasc.get(Calendar.MONTH) + "/" + dataNasc.get(Calendar.YEAR) + ", nome=" + nome + "]";
    }

}
