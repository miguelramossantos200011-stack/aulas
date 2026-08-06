
package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    private static final ConfigManager mananger = new ConfigManager("Config_Mananger.json");
    private static final Scanner scan = new Scanner(System.in);
    private static JogoConfig Config;

    static void main() {

        Config = mananger.Carregar();
        System.out.println("Painel de config do jogo");

        int op = 0;
        while(op != 5){

            exibirmenu();

            try{

                op = scan.nextInt();
                scan.nextLine();

                switch (op) {

                    case 1:
                        VerConfig(); break;

                    case 2:
                        ChangePlayerName(); break;

                    case 3:
                        ChangedifNivel(); break;

                    case 4:
                        ChangeAudio(); break;

                    case 5:
                        System.out.println("Salvando....."); break;

                    default:
                        System.out.println("Opção inválida"); break;

                }

            } catch (InputMismatchException e){

                System.out.println("Errado, Bicho burro, tem que colocar um número");
                scan.nextLine();

            }

        }

        mananger.Salvar(Config);
        System.out.println("Tá salvo!!! ");

    }

    private static void exibirmenu(){

        System.out.println("\n ---- Menu de config ----");
        System.out.println("1 para ver config atual");
        System.out.println("2 para Alterar nome do jogador");
        System.out.println("3 para Alterar de dif (1 - 3)");
        System.out.println("4 para Habilitar / desabilitar Som");
        System.out.println("5 para salvar e sair");

    }

    private static void VerConfig(){

        System.out.println(Config.toString());

    }

    private static void ChangePlayerName(){

        System.out.println("Insira seu novo nome: ");
        String NewName = scan.nextLine();

        Config.setNomePLayer(NewName);

        System.out.println("Nome alterado para: " + NewName);

    }

    private static void ChangedifNivel(){

        System.out.println("escolha a dif de 1 a 3:");
        System.out.println("1 para fácil");
        System.out.println("2 para médio");
        System.out.println("3 para Difícil");

        try {

            int NewLevel = scan.nextInt();
            scan.nextLine();

            if (NewLevel >= 1 && NewLevel <= 3) {

                Config.setNivelDif(NewLevel);

                System.out.println("Nivel de dif alterado para: " + NewLevel);

            } else {

                System.out.println("nivel inválido, apenas de 1 a 3");

            }

        } catch(InputMismatchException e) {

            System.out.println("Errado, Bicho burro, tem que colocar um número");
            scan.nextLine();

        }

    }

    public  static void ChangeAudio() {

        boolean AudioAtual = Config.isSomHabilitado();
        Config.setSomHabilitado(!AudioAtual);
        String NewStatus = Config.isSomHabilitado() ? "Habilitado" : "Desabilitado";

        System.out.println("Áudio agora está: " + NewStatus);
    }

}
