import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] convidados = new String[5];
        int opcao = -1;

        do {
            System.out.println("\n+---+---+---+ MENU VIP +---+---+---+");
            System.out.println("1 - Cadastrar convidado");
            System.out.println("2 - Listar convidados");
            System.out.println("3 - Deletar convidado");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

          
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    boolean cadastrou = false;
                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] == null) {
                            System.out.print("Escreva o nome do convidado: ");
                            convidados[i] = sc.nextLine();
                            System.out.println("Convidado registrado!");
                            cadastrou = true;
                            break;
                        }
                    }
                    if (!cadastrou) System.out.println("A lista está cheia!");
                    break;

                case 2:
                    System.out.println("\n+---+-- LISTA ATUAL --+---+---+");
                    boolean listaVazia = true;
                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] != null) {
                            System.out.println(i + " - " + convidados[i]);
                            listaVazia = false;
                        }
                    }
                    if (listaVazia) System.out.println("A lista está vazia.");
                    break;

                case 3:
                    System.out.print("Insira o nome exato para remover: ");
                    String nomeRemover = sc.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] != null && convidados[i].equalsIgnoreCase(nomeRemover)) {
                            convidados[i] = null;
                            System.out.println("Convidado removido!");
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) System.out.println("Convidado não encontrado.");
                    break;

                case 0:
                    System.out.println("Fechando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close(); 
    }
}
