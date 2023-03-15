package br.com.estoque;

public class Estoque {

    private int codProduto, qtdMinima, qtdAtual;
    private String nome;

    public Estoque() {
    }

    public Estoque(int codProduto, int qtdMinima, int qtdAtual, String nome) {
        this.codProduto = codProduto;
        this.qtdMinima = qtdMinima;
        this.qtdAtual = qtdAtual;
        this.nome = nome;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     public void darBaixa(int qtd){
        if(qtd<=qtdAtual)
        qtdAtual = qtdAtual -= qtd;
        else
            System.out.println("Estoque insuficiente para dar baixa");
     }
     public String mostra(){
        return " Produto " + getNome() + "\nQtde minima: " + getQtdMinima() + "\nqtde atual " + getQtdAtual();


     }
     public boolean prescisaRepor(){
        if (getQtdAtual()<=getQtdMinima())
            return true;
        else
            return false;
     }

}
