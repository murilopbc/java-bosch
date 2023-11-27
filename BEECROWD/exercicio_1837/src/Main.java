import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int a,b,r,q;

        System.out.print("Informe o valor de A: ");
        a = leia.nextInt();
        System.out.print("Informe o valor de B: ");
        b = leia.nextInt();


        if (-1000 <= a && b < 1000 && a != 0 && b != 0){
            q = a / b;
            r = a % b;
            System.out.printf("O quociente da divisão é "+q+" e o resto é "+ r);
        }

        else {
            System.out.print("Valor inválido!");
        }
    }
} 