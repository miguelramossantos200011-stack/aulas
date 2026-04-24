public class PP {

    private String nm;
    private int idd;

    public PP (String nm, int idd) {

        this.nm = nm;
        this.idd = idd;

    }

    public void exibirinf() {

        System.out.println("nome: " + nm);
        System.out.println("idade: " + idd);

    }

    public boolean isMiidd(){

        return idd >= 18;

    }

}
