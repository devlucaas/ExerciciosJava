package LISTA3;

import javax.swing.JOptionPane;

public class l3q7 {

    public static int mdc(int dividendo, int divisor) {
        if (dividendo % divisor == 0) {
            return divisor;
        }
        return mdc(divisor, dividendo % divisor);
    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        while (n1 != -1) {
                n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o primeiro número ou -1 para sair do programa."));
                    if(n1 == -1){
                        JOptionPane.showMessageDialog(null,
                    "Programa Fechado");
                    }else{
                        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o segundo número ou -1 para sair do programa."));

                    int resposta = mdc(n1, n2);
                    JOptionPane.showMessageDialog(null,
                    "O resultado do MDC é: " + resposta);
                    }
        }
    }
}