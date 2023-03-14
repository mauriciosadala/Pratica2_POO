import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Calculo calculo = new Calculo(0,0,0);

        float inicial, meses, taxa;


        System.out.println("digite  o valor do investimento inicial: ");
        inicial = ler.nextFloat();
        calculo.setInvestInicio(inicial);

        System.out.println("digite a quantidade de meses: ");
        meses = ler.nextFloat();
        calculo.setMeses(meses);

        System.out.println("digite a taxa aplicada: ");
        taxa = ler.nextFloat();
        calculo.setTaxa(taxa);

        JOptionPane.showMessageDialog(null,"ao final de " + calculo.getMeses() +
                " meses, o valor inestido de " + calculo.getInvestInicio() + " será de " + calculo.rendimento());









    }
}
