import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class Sistema_Delivery {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Item> Cardapio = new ArrayList<>();
        Cardapio.add(new Pizza("Pizza Salgada", "Calabresa", 75.50, 656565));
        Cardapio.add(new Pizza("Pizza Salgada", "Queijo", 72.50, 787878));
        Cardapio.add(new Pizza("Pizza Doce", "Chocolate", 79.99, 909090));
        Cardapio.add(new Pizza("Pizza Doce", "Pacoca", 79.99, 101010));

        Cardapio.add(new Bebida("Bebida Lata", 250, 9.99, 131313));
        Cardapio.add(new Bebida("Bebida Copo", 300, 6.50, 353535));

        Entregador Jorge = new Entregador("Jorge", "Moto", "3NTR3G4", 242424);
        Pedido MeuPedido = new Pedido(1, Jorge);

        System.out.println("=== Cardapio ===");
        for (Item item : Cardapio) {
            System.out.println("ID: " + item.Id + " | " + item.Tipo + " | R$ " + item.GetPreco());
        }

        int IdSelecionado = -1;


        while (IdSelecionado != 0) {
            System.out.print("\nDigite o ID do item que deseja adicionar ou 0 para fechar o pedido: ");
            IdSelecionado = sc.nextInt();

            if (IdSelecionado == 0) {
                break;
            }

            boolean ItemEncontrado = false;

            for (Item item : Cardapio) {
                if (item.Id == IdSelecionado) {
                    MeuPedido.Adicionar_Item(item);
                    System.out.println("-> " + item.Tipo + " adicionado ao seu pedido!");
                    ItemEncontrado = true;
                    break;
                }
            }

            if (!ItemEncontrado) {
                System.out.println("ID inválido! Item não encontrado no cardápio.");
            }
        }


        System.out.println("\n=== SEU PEDIDO FINAL ===");
        for (Item item : MeuPedido.Itens_No_Pedido) {
            System.out.println("ID: " + item.Id + " | " + item.Tipo + " | R$ " + item.GetPreco());
        }

        System.out.println("\n=== Pedido Fechado com sucesso! ===");
        sc.close();
    }
}