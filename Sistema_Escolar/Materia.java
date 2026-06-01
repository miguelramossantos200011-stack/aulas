public class Materia {

    protected String Nome;
    // 1. Criamos o atributo para armazenar o professor desta matéria
    protected Professor professor;

    public Materia(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return this.Nome;
    }

    // 2. CORREÇÃO: Agora o método realmente salva o professor no atributo da classe
    public void setProfessor(Professor prof) {
        this.professor = prof;
    }

    // 3. NOVO: Método necessário para o menu (case 5) conseguir ler o professor
    public Professor getProfessor() {
        return this.professor;
    }
}