    public class CentralDeControle {

        public void ApertarPlay(DispositivoDeMidia Dispositivo){

            System.out.println("conectando dispositivo... ");

            Dispositivo.Reproduzir();

            System.out.println("----");

        }



        public static void main(String[] args) {

            CentralDeControle controle = new CentralDeControle();

            SmartTV TVSala = new SmartTV("TV da sala", "Matrix");
            Celular MeuCelular = new Celular("Iphone 15", "Braindance", "Annihilator");
            RadioAutomotivo RadioCarro = new RadioAutomotivo("Rádio do carro", 98.9);

            System.out.println("\n Demonstração com uma lista de dispositivos");

            DispositivoDeMidia[] MeusDispositivos = {TVSala, MeuCelular, RadioCarro};

            for (DispositivoDeMidia Dispositivo : MeusDispositivos) {

                Dispositivo.Reproduzir();

            }

        }
}