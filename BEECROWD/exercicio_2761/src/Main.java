import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int a = leia.nextInt();

        System.out.print("Insira um número quebrado: ");
        float b = leia.nextFloat();

        System.out.print("Insira uma letra: ");
        String c = leia.next();

        System.out.print("Insira uma frase de até 50 caractéres: ");
        String d = read.nextLine();

        if (d.length() > 50){
            System.out.println("A frase tem: "+ d.length() + " caractéres.");
            System.out.print("Insira uma frase menor!");
        }
        else{
            System.out.printf("%d%f%s%s", a, b, c, d);
            System.out.println("\n" + a + "      " + b + "      " + c + "      " + d);

        }
    }
} 