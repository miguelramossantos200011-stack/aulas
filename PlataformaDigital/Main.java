
import  java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo");
        System.out.println("Insira seu nome de usuário: ");
        String UsrNM = sc.nextLine();

        System.out.println("Insra seu E-mail: ");
        String UsrMail = sc.nextLine();

        Usr newUsr = new Usr(UsrNM, UsrMail);

        System.out.println("Usuário " + Usr.getUsrNM() + " foi criado com sucesso");

        List<DGTCntt> feed = new ArrayList<>();

        int esc = 0;

        while (esc != 3) {

            System.out.println("O que você quer criar agora");
            System.out.println("[1] criar vídeo");
            System.out.println("[2] criar artigo");
            System.out.println("[3] sair");

            try {
                esc = sc.nextInt();

                switch (esc) {

                    case 1:
                        System.out.println("Insira o título do vídeo: ");
                        String VdTT = sc.nextLine();

                        System.out.println("insira a duração do ídeo: ");
                        int VdTM = sc.nextInt();

                        DGTCntt NewVd = new Vd(VdTT, VdTM, UsrNM);
                        feed.add(NewVd);
                        System.out.println("Vídeo adicioado ao feed com sucesso");
                        break;

                    case 2:
                        System.out.println("Insira o titulo do artigo: ");
                        String ArtTT = sc.nextLine();

                        System.out.println("Insira o número de palavras: ");
                        int PLVRs = sc.nextInt();

                        DGTCntt NewArt = new Art(ArtTT, PLVRs, UsrNM);
                        feed.add(NewArt);
                        System.out.println("Artigo adicionado ao feed com sucesso");
                        break;

                    case 3:
                        System.out.println("Seu Feed");

                        for(DGTCntt Cntt : feed){

                            Cntt.Exibir();
                            System.out.println(" i " + Cntt.getUsrInf() + " i ");

                        }

                        sc.close();

                        System.out.println("Programa finalizado");
                        break;

                    default:
                        System.out.println("Escolha Inválida");
                        break;





                }

            } catch (InputMismatchException e){

                System.out.println("Erro, Insira um valor válido para digitação");
                sc.next();

            }
        }
    }
}