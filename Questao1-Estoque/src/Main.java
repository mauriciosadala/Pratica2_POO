import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Estoque estoque = new Estoque();

        String nome;
        int quantiamin, quantiaatual;

        System.out.println("digite o nome: ");
        nome = ler.next();
        estoque.setNome(nome);

        System.out.println("digite a quantidade minima: ");
        quantiamin = ler.nextInt();
        estoque.setQtdMinima(quantiamin);

        System.out.println("digite a quantidade atual: ");
        quantiaatual = ler.nextInt();
        estoque.setQtdAtual(quantiaatual);



        JOptionPane.showMessageDialog(null,"O estoque " +estoque.getNome()+
                " com quantidade minima de " +estoque.getQtdMinima()+
                " Está atualmente com "+ estoque.getQtdAtual());



    }
}
