
import java.util.Scanner;

public class MaquinaDeBebida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Maquina de bebidas !LIGADA!");
        System.out.println("Esclha sua Bebida:");
        System.out.println("[1] para Café");
        System.out.println("[2] para Chá ");
        int Esc = sc.nextInt();
        Bebida BebidaSelecionada = null;

        if (Esc == 1) {

            BebidaSelecionada = new Cafe();

        } else if (Esc == 2) {

            BebidaSelecionada = new Cha();

        } else {

            System.out.println("Escolha inválida. Tente novamente ");

        }

        if (BebidaSelecionada !=  null) {

            System.out.println("Iniciando preparo");
            BebidaSelecionada.Preparar();

        }
        sc.close();

    }
}