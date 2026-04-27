


public class Main {
    public static void main(String[] args) {

        System.out.println("--- gerenciando a ateria do meu celular ---");

        celular meu_celular = new celular();

        System.out.println("\n Usando o Youtube por muito tempo...");
        meu_celular.usar(20);

        System.out.println("\n Jogando um jogo pesado...");
        meu_celular.usar(40);
        System.out.println("bateria final após jogar: " + meu_celular.getnivel_bateria() + "%");

        System.out.println("conectando na tomada...");
        meu_celular.carregar(80);

        System.out.println("deixando carregar mais um pouco...");
        meu_celular.carregar(80);

        System.out.println("bateria final após carregar: " + meu_celular.getnivel_bateria() + "%");

    }
}