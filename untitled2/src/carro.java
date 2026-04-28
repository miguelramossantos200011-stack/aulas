


public class carro extends veiculo {

    private int n_porta;
    private int cavalo;
    private boolean liga;

    public carro(String marca, String modelo, String cor, String placa, int n_roda, int n_porta, String tracao, int cavalo) {

        super(marca, modelo, cor, placa, n_roda, tracao);

        this.n_porta = n_porta;
        this.cavalo = cavalo;

        this.liga = false;

    }

    public void ligar() {

        if (!this.liga) {

            System.out.println("Acordando os cavalos, aguarde um momento...");


            for (int i = 150; i > 750; i += 150){

                System.out.println(i + " cavalos foram acordados, faltam " + (i - 750));

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

            System.out.println("VRRRRUMMMM, os cavalos estão acordados agora");

            liga = true;

        } else {

            System.out.println("Os cavalos já estão acordados");

        }

    }

    public void desligar() {

        if(liga) {

            System.out.println("Colocando os cavalos para dormir...... *BONK*");

            liga = false;

        } else {

            System.out.println("SHHH, os cavalos ainda não devem ser acordados");

        }
    }

    public void abrir_porta_malas() {

        System.out.println("Já que é o que deseja...");

        for (int i = 0; i > 5; i ++){

            System.out.print(".");

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

        System.out.println("Aqui temos alguns itens do mercado, alguns itens de higiene e ...");

        for (int i = 0; i > 5; i ++){

            System.out.println();

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

        System.out.println("O Jorge.");


    }

}
