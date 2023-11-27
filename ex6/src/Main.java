import javax.swing.*;

public class Main {
    public static void main(String[] args) {

// Declaração de Variáveis e Entrada de dados

int a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para 'a': "));
int b = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para 'b': "));
int c = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para 'c': "));

// Processamento

int delta = (b * b) - (4 * a * c);

// Saída
        JOptionPane.showMessageDialog(null, "O valor do delta é: " + delta);

    }
}