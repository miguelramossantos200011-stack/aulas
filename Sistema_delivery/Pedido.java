import java.util.ArrayList;
import java.util.List;

public class Pedido {

    protected int IdPedido;
    protected List<Item> Itens_No_Pedido;
    private Entregador Jorge;

    public Pedido(int IdPedido, Entregador Jorge){

        this.IdPedido = IdPedido;
        this.Jorge = Jorge;
        this.Itens_No_Pedido = new ArrayList<>();

    }

    public void Adicionar_Item(Item item){

        this.Itens_No_Pedido.add(item);

    }

}
