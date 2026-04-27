public class carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public carro() {

        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;

        System.out.println("Um novo carro nasceu, está parado e desligado");

    }

    public void ligar() {

        if (!this.ligado) {

            this.ligado = true;

            System.out.println("Os cavalos estão acordados agora");

        } else {

            System.out.println("O carro já está ligado");

        }

    }

    public void acelerar(int aumento) {

        if (ligado && aumento > 0) {

            this.velocidade += aumento;

            System.out.println("VRRRRUM, velocidade atual: " + this.velocidade + "km/h");

        } else {

            System.out.println("Não foi possível acelerar o carro pois os cavalos estão dormindo");

        }

    }

    public void frear(int reducao) {

        if (ligado && reducao > 0) {

            this.velocidade -= reducao;

            if (this.velocidade < 0) {

                this.velocidade = 0;

            }

            System.out.println("Freando.. Velociade atual: " + this.velocidade + "km/h");

        }

    }

    public int getVelocidade(){return this.velocidade;}

}
