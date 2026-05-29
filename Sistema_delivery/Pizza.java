public class Pizza extends Item {

    protected String Sabor;

    public Pizza(String Tipo, String Sabor, Double Preco, int Id){

        super(Tipo, Preco, Id);
        this.Sabor = Sabor;

    }

    @Override
    public double GetPreco(){

        return this.Preco;

    }


}
