public class UploadNuvem implements Armazenavel {

    @Override
    public void Salvar (String Arquivo){

        System.out.println("onectando a Servidor...");
        System.out.println("Fazendo Upload no aquivo " + Arquivo + " ....");
        System.out.println(".!. Arquivo adicionado a nuvem com sucesso .!.");

    }

}
