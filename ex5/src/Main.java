import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis e entrada de dados

        float base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));

        // Processamento

        float area = (base * altura)  / 2;

        // Saída

        JOptionPane.showMessageDialog(null,"A área do triângulo é: " + area);
    }
}