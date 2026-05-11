public class RadioAutomotivo  extends DispositivoDeMidia {

    private double EstacaoAtualFM;

    public RadioAutomotivo(String Nome, double Estação) {

        super(Nome);
        this.EstacaoAtualFM = Estação;

    }

    @Override
    public void Reproduzir() {

        System.out.println("O " + this.NomeDoDispositivo + " está sintonizado na rádio " + this.EstacaoAtualFM);

    }

}
