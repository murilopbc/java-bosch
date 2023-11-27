import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Produto p1 = new Produto();

    p1.nome = "Notebook";
    p1.preco = 5000;
    p1.desconto = 0.10;

    System.out.println(p1.nome);
    System.out.println(p1.preco);
    System.out.println(p1.desconto);

    Produto p2 = new Produto();

    p2.nome = "Shampoo";
    p2.preco = 15;
    p2.desconto = 0.25;

    System.out.println(p2.nome);
    System.out.println(p2.preco);
    System.out.println(p2.desconto);

    System.out.println(p1.returnaResumoDoPedido());
    System.out.println(p2.returnaResumoDoPedido());

    System.out.println(p1.retornaPrecoDesconto());
    System.out.println(p2.retornaPrecoDesconto());

    p1.imprimirResumoDoProduto();
    p2.imprimirResumoDoProduto();

    }
    Scanner input = new Scanner(System.in);
    int valor;
    int valor1;

   // try {
        //System.out.print("Digite um valor: ");
        //valor = input.nextInt();
        //valor1 = Integer.parseInt(valor);

    //} catch (InputMismatchException e) {
        //System.out.println("Você digitou algo que não devia!");
    }
    // finally {
           // System.out.print ("bloco finally")
                   // }

//}

//Scanner ler = new Scanner(System.in);
//int numero;
//while (true) {
    //try {
        //System.out.print("Digite um número ")
        //numero = Integer.parseInt(ler.nextLine());
        //if (numero < 20) {
            //continue;
        //}
        //break;
        //} catch (InputMismatchException e) {
//System.out.print("Você digitou algo que não devia");
//}
//ler.nextLine();
       // }
        //System .out.print("O número digitado foi: "+ numero)
        //}
