public abstract class Art extends DGTCntt {

    private int PLVRs;
    private String ArtTT;

    public Art(String ArtTT, Usr UsrNM, int PLVRs){

        super(ArtTT, UsrNM);
        this.PLVRs = PLVRs;
        this.ArtTT = ArtTT;

    }

    @Override
    public void Exibir() {

        System.out.println("Artigo " + this.ArtTT + " (" + this.PLVRs + ") ");

    }

    @Override
    public void getTipo() {

        return "Artigo";

    }
}
