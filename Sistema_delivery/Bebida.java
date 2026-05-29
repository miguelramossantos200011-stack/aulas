public class Bebida extends Item {

    protected int Volume;

    public Bebida(String Tipo, int Volume, Double Preco, int Id){

        super(Tipo, Preco, Id);
        this.Volume = Volume;

    }

    @Override
    public double GetPreco(){

        return this.Preco;

    }


}