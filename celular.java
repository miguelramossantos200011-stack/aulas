public class celular {
    private int nivel_bateria;

    public celular() {

        this.nivel_bateria = 50;

        System.out.println("Celular criado com " + this.nivel_bateria + "% de bateria");

    }

    public void carregar (int porcentagem) {

        if (porcentagem < 100){

            this.nivel_bateria += porcentagem;

            if(this.nivel_bateria > 100) {

                this.nivel_bateria = 100;

                System.out.println("\n O celular já está totalmente carregado");

            }

        } else {

            System.out.println("o celular já está carregado");

        }

        System.out.println("carregando bateria, nível atual: " + this.nivel_bateria + "%");

    }

    public void usar(int porcentagem) {

        if (porcentagem > 0) {

            this.nivel_bateria -= porcentagem;

            if (this.nivel_bateria < 0) {

                this.nivel_bateria = 0;

            }

            System.out.println("usando bateria, nível atual: " + this.nivel_bateria + "%");

        }

    }

    public int getnivel_bateria() {return nivel_bateria;}
}
