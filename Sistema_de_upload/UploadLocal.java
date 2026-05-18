public class UploadLocal implements Armazenavel {

    @Override
    public void Salvar (String Arquivo){

        System.out.println("Verificando disponibilidade do disco...");
        System.out.println("Salvando aquivo " + Arquivo + " ....");
        System.out.println(".!. Arquivo Salvo localmente com sucesso .!.");

    }

}