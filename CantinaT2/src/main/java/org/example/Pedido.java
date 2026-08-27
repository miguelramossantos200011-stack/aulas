package org.example;

public class Pedido {

    private int id;
    private String codigo;
    private String matricula;
    private String nomeAluno;
    private String periodo;
    private int produtiId;
    private String produtoNome;
    private int quantidade;
    private double ValorOriginal;
    private double percentualDesconto;
    private double valorFinl;
    private String status;

    public Pedido(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getProdutiId() {
        return produtiId;
    }

    public void setProdutiId(int produtiId) {
        this.produtiId = produtiId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorOriginal() {
        return ValorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        ValorOriginal = valorOriginal;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double getValorFinl() {
        return valorFinl;
    }

    public void setValorFinl(double valorFinl) {
        this.valorFinl = valorFinl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
