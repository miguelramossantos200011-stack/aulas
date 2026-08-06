package org.example;

import java.util.Objects;

public class JogoConfig {

    private String NomePLayer;
    private int NivelDif;
    private boolean SomHabilitado;
    private String ResolucaoTela;

    public JogoConfig() {

        this.NomePLayer = "Player01";
        this.NivelDif = 2;
        this.SomHabilitado = true;
        this.ResolucaoTela = "caneta-azul X azul-caneta";

    }

    public String getNomePLayer() {
        return NomePLayer;
    }

    public void setNomePLayer(String nomePLayer) {
        NomePLayer = nomePLayer;
    }

    public int getNivelDif() {
        return NivelDif;
    }

    public void setNivelDif(int nivelDif) {
        NivelDif = nivelDif;
    }

    public boolean isSomHabilitado() {
        return SomHabilitado;
    }

    public void setSomHabilitado(boolean somHabilitado) {
        SomHabilitado = somHabilitado;
    }

    public String getResolucaoTela() {
        return ResolucaoTela;
    }

    public void setResolucaoTela(String resolucaoTela) {
        ResolucaoTela = resolucaoTela;
    }

    public String toString(){

        String StatusSom = SomHabilitado ? "Habilitado" : "Desablitado";
        return String.format(

                "-------------Config atuais-----------------\n" +
                "Nome do jogador: %s\n" +
                "Nivel dificuldade: %d\n" +
                "Áudio: %s\n" +
                "Resolução da tela %s\n" +
                "---------------------------------------------",
                NomePLayer, NivelDif, StatusSom, ResolucaoTela
        );
    }
}
