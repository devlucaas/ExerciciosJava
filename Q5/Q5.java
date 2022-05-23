package Q5;

import Q5.Professor;
import Q5.Disciplina;
import Q5.Aluno;
import Q5.Turma;

public class Q5 {
   /*
        Professor -> nome 
        Disciplina -> nome
        Aluno -> nome 
        Turmas -> Professor + Alunos

   */ 
    public static void main(String [] args){
        Disciplina disciplina = new Disciplina("Matematica");
        Professor professor = new Professor("Pedro", disciplina);
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José");
        Aluno[] alunos = new Aluno[3];
        alunos[0] = aluno1; 
        alunos[1] = aluno2;
        alunos[2] = aluno3;
  
        //Vetor de alunos
        Turma turma = new Turma("8 ano", professor, disciplina, alunos);
        
        System.out.printf("O professor %s leciona a disciplina %s na turma %s aos alunos.\n", turma.getProfessor().getNome(), turma.getDisciplina().getNome(), turma.getNome());
        for(int i=0; i<3;i++){
            System.out.printf("%s\n", alunos[i].getNome());
        }
    }
}

