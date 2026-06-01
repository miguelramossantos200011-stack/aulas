import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno {

    protected String Sala;
    protected int Numero;
    protected String Nome;
    protected List<Double> Notas;
    protected double Media;
    protected int Faltas;
    protected Map<Materia, List<Double>> NotasPorMateria;

    public Aluno(String Nome){

        this.Sala = Sala;
        this.Numero = Numero;
        this.Nome = Nome;
        this.Notas = new ArrayList<Double>();
        this.Media = Media;
        this.Faltas = Faltas;
        this.NotasPorMateria = new HashMap<>();

    }

    public void AdicionarNota(Materia Materia, double Notas) {

        this.NotasPorMateria.putIfAbsent(Materia, new ArrayList<>());

        this.NotasPorMateria.get(Materia).add(Notas);
    }

    public double GetMediaDaMateria(Materia Materia) {
        List<Double> notas = this.NotasPorMateria.get(Materia);

        if (notas == null || notas.isEmpty()) {
            System.out.println("Nenhuma nota em " + Materia.getNome());
            return 0.0;
        }

        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String GetNome(){

        return Nome;

    }

    public String GetTurma() {

        return Sala;

    }
}
