package org.example;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VendaDAO dao = new VendaDAO();

        int op = -1;

        while(op != 0){

            System.out.println("Bem vindo a o sistema de vendas " +
                    "\n 1 para cadastrar vendas " +
                    "\n 2 para listar vendas " +
                    "\n 3 para exportar para CSV " +
                    "\n 4 para exportar para JSON " +
                    "\n 0 para Sair " +
                    "\n Escolha uma opção: ");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1 -> {
                    System.out.println("Nome do produto: ");
                    String Produto = sc.nextLine();

                    System.out.println("Categoria: ");
                    String Categoria = sc.nextLine();

                    System.out.println("Preço unitário (apenas nums): ");
                    double ValorUnit = sc.nextDouble();

                    System.out.println("Quantidade (apenas valores inteiros):  ");
                    int Quant = sc.nextInt();

                    dao.Salva(new Venda(Produto, Categoria, ValorUnit, Quant));

                }

                case 2 -> {

                    List<Venda> vendas = dao.ListarTodos();
                    System.out.println("Vendas registradas: ");
                    vendas.forEach(v -> System.out.printf("[%d] %s (%s) - Qtd: %d - Preço: R$ %.2f - Total: R$ %.2f \n ",
                            v.getId(),
                            v.getProduto(),
                            v.getCategoria(),
                            v.getQuant(),
                            v.getValorUnit(),
                            v.getValorTotal()));

                }

                case 3 -> {

                    List<Venda> vendas =  dao.ListarTodos();
                    ExportadorCSV.exportar(vendas, "Vendas.csv");

                }

                case 4 -> {

                    List<Venda> vendas = dao.ListarTodos();
                    Exportador_Json.exportar(vendas, "Vendas.json");

                }

                case 0 -> {

                    System.out.println("Saindo");

                }

                default -> {

                    System.out.println("Opção inválida");

                }

            }

        }

    }
}