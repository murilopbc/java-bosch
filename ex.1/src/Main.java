import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = leia.nextInt();

        celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura em celsius é:  " + celsius);

    }
}