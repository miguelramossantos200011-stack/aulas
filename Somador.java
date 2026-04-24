 public class Somador {

    private int [] nmrs;

    public Somador(int[] nmrs){

     this.nmrs = nmrs;

    }

    public int calcsma(){

        int sma = 0;
        int l = 0;

        for (int n: nmrs){

            sma += n;

            l++;

        }

        sma = sma / l;

        return sma;

    }
}
