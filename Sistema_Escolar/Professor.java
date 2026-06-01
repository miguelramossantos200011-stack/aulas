import java.util.ArrayList;
import java.util.List;

public class Professor {

    protected String Nome;
    protected List<Materia> Materias;
    protected List<String> Turmas;

    public Professor (String Nome) {

        this.Materias = new ArrayList<>();
        this.Nome = Nome;
        this.Turmas = new ArrayList<>();

    }

    public void AdicionarMateria(Materia Materia) {
        this.Materias.add(Materia);
    }

    public List<Materia> getMaterias() {
        return this.Materias;
    }

    public String getNome(){

        return Nome;

    }

}
