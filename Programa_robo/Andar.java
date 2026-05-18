public class Andar  extends Acao {

    private int Passos;

    public Andar(int Passos) { this.Passos = Passos; }
    @Override
    public void Executar() {

        System.out.println("Andando " + Passos + " passos para frente");

    }

}
