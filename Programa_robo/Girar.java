public class Girar extends Acao {

    private String Direcao;
    public Girar(String Direcao) { this.Direcao = Direcao; }
    @Override
    public void Executar() {

        System.out.println("Girando para a " + Direcao + ".");

    }

}
