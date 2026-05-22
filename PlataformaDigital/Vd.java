public class Vd  extends DGTCntt{

    private int VdTM;
    private String VdTT

    public Vd(String VdTT, Usr UsrNM, int VdTemp){

        super(VdTT, UsrNM);
        this.VdTM = VdTM;
        this.VdTT = VdTT;

    }

    @Override
    public void Exibir() {

        System.out.println("Vídeo " + this.VdTT + " [" + this.VdTM + "] ");

    }

}
