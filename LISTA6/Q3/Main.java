package LISTA6.Q3;

import java.util.Calendar;

public class Main {
    public static void main(String [] args){

        Calendar dataNascPessoa = Calendar.getInstance();
        dataNascPessoa.set(1990, Calendar.APRIL, 07);
        Pessoa pessoa = new Pessoa("Ana", "123456789", dataNascPessoa);
        Calendar dataNascAluno = Calendar.getInstance();
        dataNascAluno.set(1999, Calendar.APRIL, 02);
        Pessoa aluno = new Aluno("Pedro", "123654987", dataNascAluno, "8005896");
        Calendar dataNascFuncionario = Calendar.getInstance();
        Calendar dataAdmissaoFuncionario = Calendar.getInstance();
        dataNascFuncionario.set(1999, Calendar.AUGUST, 06);
        dataAdmissaoFuncionario.set(2020, Calendar.AUGUST, 06);
        Pessoa funcionario = new Funcionario("Maria", "987456123", dataNascFuncionario, "12345678", dataAdmissaoFuncionario, 5000);
        Calendar dataNascChef = Calendar.getInstance();
        Calendar dataAdmissaoChef = Calendar.getInstance();
        Calendar dataPromocaoChef = Calendar.getInstance();
  
        dataNascChef.set(1990, Calendar.FEBRUARY, 06);
        dataAdmissaoChef.set(2019, Calendar.DECEMBER, 06);
        dataPromocaoChef.set(2021, Calendar.AUGUST, 06);

        Pessoa chefedepartamento = new ChefeDepartamento("João", "456789123", dataNascChef, "987456", dataAdmissaoChef, 5000, "RH", dataPromocaoChef, 2000);
        System.out.println(pessoa.toString()+"\n"+aluno.toString()+"\n"+funcionario.toString()+"\n"+ chefedepartamento.toString());
    }  
}