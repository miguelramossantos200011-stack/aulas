import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//adicioinar o gitignore ntes do arquivo
public class Main {
    public static void main(String[] args) {

        String arquivoEntrada = "vendas.csv";
        String arquivoSaida = "relatorio_final.txt";

        double totalGeral = 0.0;


        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))) {

            String linha;
            escritor.write("========== Relatório de vendas =========\n");
            System.out.println("Processando arquivo......\n");

            while ((linha = leitor.readLine()) != null) {

                String[] colunas = linha.split(";");

                if (colunas.length < 3) continue;

                String produto = colunas[0];
                int quantidade = Integer.parseInt(colunas[1].trim());
                double preco = Double.parseDouble(colunas[2].trim());

                double totalProduto = quantidade * preco;
                totalGeral += totalProduto;

                String registro = String.format("Produto: %s | Qtd: %d | Total: R$ %.2f\n",
                        produto, quantidade, totalProduto);

                escritor.write(registro);
                System.out.print(registro);
            }

            String rodape = "\n--------------------------------------------------------\n";
            rodape += String.format("Total geral arrecadado: R$ %.2f\n", totalGeral);
            rodape += "==========================================================\n";

            escritor.write(rodape);
            System.out.println("\nSucesso, o arquivo '" + arquivoSaida + "' foi gerado.");

        } catch (IOException e) {
            System.out.println("Erro de E/S: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato: O arquivo contém caracteres inválidos em campos numéricos." + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Linha com colunas insuficientes." + e.getMessage());
        }
    }
}
