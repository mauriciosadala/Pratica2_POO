import javax.swing.*;

public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    void darBaixa(int qtde){

    }
    public String mostra(){
        String retorna = nome + "" + Integer.toString( qtdMinima) + "" + Integer.toString( qtdAtual);
        return retorna;

    }
    boolean precisaRepor(){

        if(qtdAtual<=qtdMinima){
            return true;
        }
        else{
            return false;
        }
    }
}
