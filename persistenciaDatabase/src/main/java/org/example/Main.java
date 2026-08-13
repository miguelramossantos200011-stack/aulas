package org.example;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final ContatoDAO dao = new ContatoDAO();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        Database.CriarTabela();

        System.out.println("Agenda de contatos");
        int op = 0;

        while (op != 5){

            ExibirMenu();

            try {

                op = sc.nextInt();
                sc.nextLine();

                switch (op) {

                    case 1:
                        AdicionarContato();
                        break;
                    case 2:
                        ListarContato();
                        break;
                    case 3:
                        AtualizarContato();
                        break;
                    case 4:
                        RemoverContato();
                        break;
                    case 5:
                        System.out.println("Encerrando.......");
                        break;
                    default:
                        System.out.println("Opção inválida tente valores entre 1 e 5");
                }

            } catch(InputMismatchException e){

                System.out.println("Erro, favor, insira apenas numerais nesse campo");
                sc.nextLine();
            }

            if (op != 5) {
                System.out.println("\nPressione ENTER para continuar...");
                sc.nextLine();
            }
        }

    }

    private static void ExibirMenu(){
        System.out.println("\033[H\033[2J");
        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                   ║");
        System.out.println("║   🌟 𝓒𝓸𝓷𝓽𝓪𝓬𝓽 𝓜𝓪𝓷𝓪𝓰𝓮𝓶𝓮𝓷𝓽 𝓢𝔂𝓼𝓽𝓮𝓶 🌟                              ║");
        System.out.println("║                                                                   ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                                   ║");
        System.out.println("║         [1] Adicionar Novo Contato                                ║");
        System.out.println("║             └── Inserir dados de forma rápida e segura            ║");
        System.out.println("║                                                                   ║");
        System.out.println("║         [2] Consultar Lista de Contatos                           ║");
        System.out.println("║             └── Visualizar todos os registros armazenados         ║");
        System.out.println("║                                                                   ║");
        System.out.println("║         [3] Modificar Registro Atual                              ║");
        System.out.println("║             └── Atualizar informações de um contato existente     ║");
        System.out.println("║                                                                   ║");
        System.out.println("║         [4] Excluir Contato do Sistema                            ║");
        System.out.println("║             └── Remover permanentemente um registro               ║");
        System.out.println("║                                                                   ║");
        System.out.println("║         [5] Encerrar Aplicação                                    ║");
        System.out.println("║             └── Fechar o programa com salvamento automático       ║");
        System.out.println("║                                                                   ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
        System.out.print("\n        🔮 Selecione o comando desejado [1-5] ❯ ");
    }

    private static void AdicionarContato(){
        System.out.println("\n--- Adicionar Contato ---");
        System.out.print("Nome: ");
        String Name = sc.nextLine();

        System.out.print("Telefone: ");
        String Fone = sc.nextLine();

        dao.adicionar(new Contato(Name, Fone));
        System.out.println("Contato salvo com sucesso!");
    }

    private static void ListarContato(){
        System.out.println("\n--- Lista de Contatos ---");
        List<Contato> contatos = dao.listar();

        if (contatos.isEmpty()){
            System.out.println("Nenhum contato salvo.");
        } else {
            contatos.forEach(System.out::println);
        }
    }

    private static void AtualizarContato(){
        System.out.println("\n--- Atualizar Contato ---");
        System.out.print("Digite o ID do contato a ser atualizado: ");

        try{
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Novo Nome: ");
            String Name = sc.nextLine();

            System.out.print("Novo Número: ");
            String Fone = sc.nextLine();

            dao.Atualizar(new Contato(id, Name, Fone));
            System.out.println("Contato atualizado com sucesso!");

        } catch (InputMismatchException e){
            System.out.println("ID inválido, insira apenas números.");
            sc.nextLine();
        }
    }

    private static void RemoverContato(){
        System.out.println("\n--- Remover Contato ---");
        System.out.print("Insira o ID a ser removido: ");

        try{
            int id = sc.nextInt();
            sc.nextLine();
            dao.Remover(id);

            System.out.println("Contato removido com sucesso!");

        } catch(InputMismatchException e){
            System.out.println("ID inválido, insira apenas números.");
            sc.nextLine();
        }
    }
}