package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final BibliotecaManager Mananger = new BibliotecaManager("Biblioteca.xml");
    private static final Scanner sc = new Scanner(System.in);
    private static Biblioteca biblioteca;

    public static void main(String[] args) {

        biblioteca = Mananger.Carregar();

        System.out.println("Oi, Boa noite, seja bem vindo a biblioteca de estudos!!");
        System.out.println(biblioteca.getLivros().size() + " Livro(s) carregado(s).");

        int op = 0;

        while(op != 3){

            exibirMenu();

            try(){

                switch(op) {

                    case 1: break;
                    case 2: listarlivros() break;
                    case 3: break;

                }

            }

        }

    }

    private static void exibirMenu() {

        System.out.println("1 para Adicionar novo livro");
        System.out.println("2 para listar todos os livros");
        System.out.println("3. para sair");
        System.out.println("Ecolha: ");

    }

    private static void adicionarLivro(){

        System.out.println("Adicionar livro");

        try{

            System.out.println("Titulo: ");
            String Title = sc.nextLine();

            System.out.println("Autor: ");
            String Autor = sc.nextLine();

            System.out.println("Trecho: ");
            String Trecho = sc.nextLine();

            System.out.println("Ano: ");
            int Ano = sc.nextInt();

            biblioteca.getLivros().add(new Livro(Title, Autor, Trecho, Ano));
            System.out.println("Livro adicionado com sucesso!!");

        } catch(InputMismatchException e) {

            System.out.println("Erro, Ano deve ser numeral");
            sc.nextLine();

        }

    }

    public static void listarlivros(){

        System.out.println("Livros na biblioteca: ");

        if (biblioteca.getLivros().isEmpty()) {

            System.out.println("Tem não pae");

        } else {

            biblioteca.getLivros().forEach(System.out :: println);

        }

    }

}