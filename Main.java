//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Criando e interagindo com meu fusca");

        carro meu_fusca = new carro();

        System.out.println("\n Tentando acelerar desligado...");

        meu_fusca.acelerar(20);

        System.out.println("velocidade atual do fusca: " + meu_fusca.getVelocidade() + "km/h ");

        System.out.println("\n agora vamos ligar o carro...");
        meu_fusca.ligar();


        meu_fusca.ligar();

        System.out.println("\n acelerando ");
        meu_fusca.acelerar(15);
        meu_fusca.acelerar(20);

        System.out.println("velocidade atual do fusca:  " + meu_fusca.getVelocidade() + "kh/h");

        System.out.println("\n freando um pouco");
        meu_fusca.frear(10);

        System.out.println("Velocodade final do fusca : " + meu_fusca.getVelocidade() + "km/h");

    }
}