public class Entregador {

    protected String Nome;
    protected String Veiculo;
    protected String Placa;
    protected int Id;

    public Entregador(String Nome, String Veiculo, String Placa, int Id){

        this.Nome = Nome;
        this.Veiculo = Veiculo;
        this.Placa = Placa;
        this.Id = Id;

    }

    public String GetNome(){

        return this.Nome;

    }

    public String GetVeiculo(){

        return this.Veiculo;

    }

}
