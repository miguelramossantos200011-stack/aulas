public class SmartTV extends DispositivoDeMidia{

    private String FilmeAtual;

    public SmartTV(String Nome, String Filme){

        super(Nome);
        this.FilmeAtual = Filme;

    }

    @Override
    public void Reproduzir() {

        System.out.println("A " + this.NomeDoDispositivo + " está reproduzindo o filme: " + this.FilmeAtual + "a uma resolução de 4000 pixels");

    }


}
