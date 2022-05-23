package LISTA4.Q5;

public class Turma {
    private String nome;
    private Professor professor;
    private Disciplina disciplina;
    private Aluno[] aluno = new Aluno[3];

    public Turma(String nome, Professor professor, Disciplina disciplina, Aluno[] aluno){
        this.nome = nome;
        this.professor = professor;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }


    public String getNome(){
        return this.nome;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    public Aluno[] getAlunos(){
        return this.aluno;
    } 

    public Disciplina getDisciplina(){
        return this.disciplina;
    }
}
