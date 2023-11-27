import javax.swing.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {

        // Declarações

        DecimalFormat df = new DecimalFormat("##.##");

         // Entrada (leitura)

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite  seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));

        // Processamento

        double imc = peso / (altura * altura);

        // Saída (exibir o resultado)

        JOptionPane.showMessageDialog(null, "Seu imc é: " + df.format(imc));
    }
}