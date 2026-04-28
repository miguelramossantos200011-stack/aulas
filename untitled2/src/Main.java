


public class Main {
    public static void main(String[] args) {

        carro meu_carro = new carro("aston martim", "vantage", "branco", "t007-VNTG", 4, 4, "diantetra", 750);
        motocicleta minha_moto = new motocicleta("honda", "cb 500", "preto", "CB5-0D00",  2, "traseira", 500);

        System.out.println("=======+ Ações com carro +======");
        meu_carro.ligar();
        meu_carro.abrir_porta_malas();
        meu_carro.desligar();

        System.out.println("=======+ Ações com moto +======");
        minha_moto.ligar();
        minha_moto.abrir_porta_malas();
        minha_moto.desligar();

    }

}