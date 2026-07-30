package org.example;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;


public class BibliotecaManager {

    private final String NomeArquivo;
    private final XmlMapper xmlMapper;

    public BibliotecaManager(String NomeArquivo) {

        this.NomeArquivo = NomeArquivo;
        this.xmlMapper = XmlMapper.builder()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .build();

    }

    public Biblioteca Carregar(){

        File Arquivo = new File(NomeArquivo);

        if(!Arquivo.exists()){

            System.out.println("Num achamo chefe, vamo fazer uma nova");
            return new Biblioteca();

        }

        try {

            return xmlMapper.readValue(Arquivo, Biblioteca.class);

        } catch (JacksonException e){

            System.out.println("Deu pau no leitor do arquivo man, o nome foi esse: " + e.getMessage());

            e.printStackTrace();

            return new Biblioteca();

        }

    }

    public void Salvar(Biblioteca biblioteca){

        try {

            xmlMapper.writeValue(new File(NomeArquivo), biblioteca);

        } catch (JacksonException e){

            System.out.println("Deu ruim pra Salvar man, Nome do Arquivo: " + e.getMessage());

            e.printStackTrace();

        }

    }

}
