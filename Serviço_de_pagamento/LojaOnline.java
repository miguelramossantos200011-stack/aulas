
import java.util.Scanner;

public class LojaOnline {
    public static void main(String[] args) throw InterruptedExption {

        Scanner sc = new Scanner(System.in);
        Pedido MeuPedido = new Pedido(101, 250, 75);
        System.out.println("Bem Viado a loja #$%¨&**( ");
        System.out.println("Seu pedido de R$" + MeuPedido.getValorTotal() + " etá pronto para pagamento");
        System.out.println("Escolha a fora de pagamento");
        System.out.println("[1] para Cartão ");
        System.out.println("[2] para Pix");
        System.out.println("[3] para Boleto");
        int Esc = sc.nextInt();

        ProcesadorPagamento Processador = null;

        if (Esc == 1) {

            System.out.println("Escolha o tipo de cartão: ");
            System.out.println("[1] para Crédito");
            System.out.println("[2] para Débito");
            int TipoCartao = sc.nextInt();

            if (TipoCartao == 1) {

                Processador =  new PagamentoCartao(TipoCartao.Credito);

            } else {

                Processador =  new PagamentoCartao(TipoCartao.Debito);

            }

        } else if (Esc == 2) {

            Processador = new PagamentoPix();

        } else if (Esc == 3) {

            Processador = new PagamentoBoleto();

        }



    }
}