public abstract class DGTCntt {

    protected String TiTle;
    protected Usr Autor;

    public DGTCntt (String TiTle, Usr Autor){

        this.TiTle = TiTle;
        this.Autor = Autor;

    }

    public abstract void Exibir();
    public abstract void geTipo();

    public String getUsrInf(){

        return "criado por " + Usr.getUsrNM() + " (" + Usr.getUsrMail() + ") ";

    }

}
