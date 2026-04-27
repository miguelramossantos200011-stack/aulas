
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double vlr;
        String nm;
        int op;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        conta_bancaria minha_conta = new conta_bancaria(100.0);

        System.out.println("Insira seu nome: ");
        nm = sc.nextLine();



        do{

            System.out.println("olá, " + nm + "selecione o tipo de operação que você deseja fazer :");
            System.out.println("selecione: ");
            System.out.println("[1] para depositar");
            System.out.println("[2] para sacar");
            System.out.println("[3] para verificar saldo");
            System.out.println("[0] para sair");
            op = sc.nextInt();

            for (int i = 0; i < 10; i++) {

                System.out.println();

            }

            switch (op) {

                case 1:

                    System.out.println("Qual valor você deseja depositar? ");
                    vlr = sc.nextDouble();

                    minha_conta.depositar(vlr);

                    System.out.println("Saldo final: " + minha_conta.getSaldo());
                    break;

                case 2:

                    System.out.println("Qual valor você deseja sacar? ");
                    vlr = sc.nextDouble();

                    minha_conta.sacar(vlr);

                    System.out.println("Saldo final: " + minha_conta.getSaldo());
                    break;

                case 3:

                    System.out.println("Saldo atual: " + minha_conta.getSaldo());
                    break;

                case 0:
                    System.out.println("Desligando sistema");
                    break;

                default:
                    System.out.println("operação inexistente, tente novamemte.");
                    break;

            }

        }while(op != 0);

    }
}