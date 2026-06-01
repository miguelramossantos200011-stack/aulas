import java.util.ArrayList;
import java.util.List;

public class Turma {

    protected String Turma;
    protected int Ano;
    protected List<Aluno> Alunos;
    protected List<Professor> Professores;

    public Turma(String Turma, int Ano, List<String> Alunos, List<String> Professores){

        this.Turma = Turma;
        this.Ano = Ano;
        this.Alunos = new ArrayList<>();
        this.Professores = new ArrayList<>();

    }

    public void Adicionar_Professor(Professor NovoProfessor){

        this.Professores.add(NovoProfessor);

    }

    public List<Professor> GetProfessores(Professor NovoProfessor){

        return this.Professores;

    }

    public void Adicionar_Aluno(Aluno NovoAluno){

        this.Alunos.add(NovoAluno);

    }

    public List<Aluno> GetAlunos(Aluno Alunos){

        return this.Alunos;

    }

}
