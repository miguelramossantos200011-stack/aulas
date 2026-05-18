
import java.util.Scanner;

public class SistemaDeUpload {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo para Upload: ");
        String Arquivo = sc.nextLine();

        System.out.println("Onde você deseja salvar? ");
        System.out.println("[1] para Nuvem");
        System.out.println("[2] para Local");
        int Esc = sc.nextInt();

        Armazenavel ServicoDeUpload = null;

        if (Esc == 1) {

            ServicoDeUpload = new UploadNuvem();

        } else if (Esc == 2) {

            ServicoDeUpload = new UploadLocal();

        }
        if (ServicoDeUpload != null) {

            ServicoDeUpload.Salvar(Arquivo);

        } else {

            System.out.println("Comando inválido para Upload");

        }
        sc.close();

    }
}