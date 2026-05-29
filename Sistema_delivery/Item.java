public abstract class Item {

    protected String Tipo;
    protected int Id;
    protected double Preco;

    public Item(String Tipo, Double Preco, int Id){

        this.Tipo = Tipo;
        this.Preco = Preco;
        this.Id = Id;



    }

    public double GetPreco(){

        return this.Preco;

    }

}
