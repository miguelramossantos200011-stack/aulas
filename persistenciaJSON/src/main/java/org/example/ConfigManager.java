package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigManager {

    private final String NomeArquivo;
    private final Gson gson;

    public ConfigManager(String nomeArquivo){

        this.NomeArquivo = nomeArquivo;
        this.gson = new GsonBuilder().setPrettyPrinting().create();

    }

    public JogoConfig Carregar(){

        File arquivo = new File(NomeArquivo);

        if (!arquivo.exists()) {

            System.out.println("File not found, using defoult config");
            return new JogoConfig();

        }

        try (FileReader reader = new FileReader(arquivo)){

            JogoConfig config = gson.fromJson(reader, JogoConfig.class);
            return (config !=null) ? config : new JogoConfig();

        } catch (IOException | JsonSyntaxException e) {

            System.out.println("deu pau no carregamento:" + e.getMessage());
            return new JogoConfig();

        }

    }

    public void Salvar (JogoConfig config) {

        try(FileWriter writer = new FileWriter(NomeArquivo)) {

            gson.toJson(config, writer);

        } catch (IOException e) {

            System.out.println("Deu pra  salvar não mn: " + e.getMessage());

        }

    }

}
