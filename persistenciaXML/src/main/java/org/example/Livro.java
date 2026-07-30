package org.example;

public class Livro {

    private String Title;
    private String Autor;
    private String Trecho;
    private int Ano;


    public Livro(){}

    public Livro(String Title, String Autor,String Trecho, int Ano){

        this.Title = Title;
        this.Autor = Autor;
        this.Trecho = Trecho;
        this.Ano = Ano;

    }

    public String getTitle() {
        return Title;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTrecho() {
        return Trecho;
    }

    public int getAno() {
        return Ano;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setTrecho(String trecho) {
        Trecho = trecho;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    @Override
    public String toString() {
        return String.format("Título: %s Autor: %s Trecho: %s Ano: %d", Title, Autor, Trecho, Ano);
    }
}
