import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = leia.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
    }
}