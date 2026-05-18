

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProgramadorDeRobo {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        List<Acao> Programa = new ArrayList<>();

        int Opc = 0;

        while (Opc != 4) {
            System.out.println("Programador de Robo");
            System.out.println("[1] para adicionar ação: Andar ");
            System.out.println("[2] para adicionar ação: Girar");
            System.out.println("[3] para Ver Programa");
            System.out.println("[4] para adicionar ação");
            Opc = sc.nextInt();

            if (Opc == 1) Programa.add(new Andar(10));
            if (Opc == 2) Programa.add(new Girar("Direita"));
            if (Opc == 3) System.out.println("Programa tem " + Programa.size() + " ações.");

        }

        System.out.println("EXECUTANDO PROGRAMA DO ROBÔ");

        for (Acao acao : Programa) {

            acao.Executar();

        }

        System.out.println("FIM DO PROGRAMA");
        sc.close();

    }
}