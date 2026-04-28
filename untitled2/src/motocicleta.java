


public class motocicleta extends veiculo{

    private int cilindrada;
    private boolean liga;

    public motocicleta (String marca, String modelo, String cor, String placa, int n_roda, String tracao, int cilindrada){

        super(marca, modelo, cor, placa, n_roda, tracao);

        this.cilindrada = cilindrada;

    }

    public void ligar() {

        if (!this.liga) {

            System.out.println("Estamos girando os cilindros, aguarde um momento...");


            for (int i = 100; i > 500; i += 100){

                System.out.println(i + " cilindros girando, faltam " + (i - 500));

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

            System.out.println("VRRRRUMMMM, os cilindros estão girando agora");

            liga = true;

        } else {

            System.out.println("Os cilindros já estão rodando");

        }

    }

    public void desligar() {

        if(liga) {

            System.out.println("parando os cilindros.... *HRRRRR*");

            liga = false;

        } else {

            System.out.println("Os cillindros ainda estão parados");

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

        System.out.println("Aqui temos uma fita isolante, meio metro de corda com a ponta cortada, um pano sujo e um vidro de clorofórmio.");

    }

}
