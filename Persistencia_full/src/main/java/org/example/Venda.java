package org.example;

public class Venda {

    private Integer id;
    private String Produto;
    private String Categoria;
    private Double ValorUnit;
    private int Quant;

    public Venda(){}

    public Venda(String Produto, String Categoria, double ValorUnit, int Quant){

        this.Produto = Produto;
        this.Categoria = Categoria;
        this.ValorUnit = ValorUnit;
        this.Quant = Quant;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Double getValorUnit() {
        return ValorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        ValorUnit = valorUnit;
    }

    public int getQuant() {
        return Quant;
    }

    public void setQuant(int quant) {
        Quant = quant;
    }

    public double getValorTotal(){

        return this.ValorUnit * this.Quant;

    }

}
