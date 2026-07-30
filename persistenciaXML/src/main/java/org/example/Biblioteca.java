package org.example;

import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import tools.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "Biblioteca")
public class Biblioteca {

    @JacksonXmlElementWrapper(localName = "Livros")
    @JacksonXmlProperty(localName = "Livros")
    private List<Livro> Livros = new ArrayList<>();

    public Biblioteca(){}

    public List<Livro> getLivros() {
        return Livros;
    }

    public void setLivros(List<Livro> livros) {
        this.Livros = livros;
    }
}
