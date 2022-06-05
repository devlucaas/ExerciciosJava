package LISTA6.Q6;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    public List<Pessoa> lista = new ArrayList<Pessoa>();

    public void cadastrarPessoa(Pessoa pessoa){
        lista.add(pessoa);
    }

    public void mostrarPessoa(){
        for(Pessoa pessoa:lista){
            System.out.println(pessoa.toString());
        }
    }

    public static void main(String [] args){
        CadastroPessoas aplicacao = new CadastroPessoas();
        Pessoa pessoa = new Pessoa("Pessoa 1", "cpf 1");
        Pessoa cliente = new Cliente("Cliente", "cpf 2", 001);
        Pessoa funcionario = new Funcionario("Funcionario", "cpf 3 ", "0001", 2000);
        Pessoa gerente = new Gerente("Gerente", "cpf 4", "0004", 4000, 1);
        aplicacao.cadastrarPessoa(pessoa);
        aplicacao.cadastrarPessoa(cliente);
        aplicacao.cadastrarPessoa(funcionario);
        aplicacao.cadastrarPessoa(gerente);
        aplicacao.mostrarPessoa();
    }
}