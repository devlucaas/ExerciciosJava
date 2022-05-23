package Q5;
public class Professor {
    private String nome;
    private Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina){
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome(){
        return this.nome;
    }

    public Disciplina getDisicplina(){
        return this.disciplina;
    }
}


