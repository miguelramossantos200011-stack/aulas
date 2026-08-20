package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorCSV {

    public static void exportar(List<Venda> vendas, String caminhoArquivo){

        try (BufferedWriter writer= new BufferedWriter(new FileWriter(caminhoArquivo))){

            writer.write("ID;Produto;Categoria;ValorUnit;Quant;ValorTotal");
            writer.newLine();

            for(Venda v: vendas){

                String linha = String.format("%d;%s;%s;%2f;%d;%2f",
                        v.getId(),
                        v.getProduto(),
                        v.getCategoria(),
                        v.getValorUnit(),
                        v.getQuant(),
                        v.getValorTotal());

                writer.write(linha);
                writer.newLine();

            }

            System.out.println("Arquivo CSV gerado: " + caminhoArquivo);

        } catch(IOException e){

            System.out.println("Erro ao exportar arquivo: " + e.getMessage());

        }

    }

}
