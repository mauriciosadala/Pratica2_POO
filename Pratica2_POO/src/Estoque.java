public class Estoque {
    private String nome;
    private int qtdAtual, qtdminima;

    //Construtor sem parametros.
    public Estoque() {
    }

    //construtor com parametros.
    public Estoque(String nome, int qtdAtual, int qtdminima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdminima = qtdminima;
    }

    //metodo getter
    public String getNome() {
        return nome;
    }
    public int getQtdAtual() {
        return qtdAtual;
    }
    public int getQtdminima() {
        return qtdminima;
    }
    //metodo setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    public void setQtdminima(int qtdminima) {
        this.qtdminima = qtdminima;
    }




    void darBaixa(int qtde){
    }

    String mostra(){
    }

    boolean precisaRepor(){
    }




}
