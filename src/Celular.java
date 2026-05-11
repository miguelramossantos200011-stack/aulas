public class Celular extends DispositivoDeMidia {

    private String MusicaAtual;
    private String Artista;

    public Celular(String Nome, String Musica, String Artista){

        super(Nome);
        this.MusicaAtual = Musica;
        this.Artista = Artista;

    }

    @Override
    public void Reproduzir(){

        System.out.println("O " + this.NomeDoDispositivo + " está  tocando: " + this.MusicaAtual + " de " + this.Artista + ".");

    }

}
