import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Declaração de Variável e entrada de dados

        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro: "));

        // Processamento


        double quadrado = num * num;
        double cubo = quadrado * num;

        JOptionPane.showMessageDialog(null, "O número ao quadrado é: " + quadrado + "\nO número ao cubo é : " + cubo );
    }
}