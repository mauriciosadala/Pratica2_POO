package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {

        //ultilizando o constutor vazio
        Estoque e1 = new Estoque();
        e1.setNome("Caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinima(5);
        //ultilizando o sysout com o metodo mostra criado
        System.out.println(e1.mostra());

        Estoque e2 = new Estoque();


        }
    }
}
