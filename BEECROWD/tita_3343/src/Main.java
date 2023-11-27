import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// DECLARAÇÃO DE VARIAVEL 
        int quant, tamanho_muralha, p,m,g;
        String tamanho_titas;
        int num_muralhas = 0;
        int tam_atual_muralha = 0;

// ENTRADA PARA O USUARIO INSERIR A QUANTIDADE DAS COISAS 
        System.out.print("Informe a quantidade de titãs: ");
        quant = leia.nextInt();
        System.out.print("Informe o tamanho da muralha: ");
        tamanho_muralha = leia.nextInt();
        System.out.print("Informe o tamanho P do titãs: ");
        p = leia.nextInt();
        System.out.print("Informe o tamanho M do titãs: ");
        m = leia.nextInt();
        System.out.print("Informe o tamanho G do titãs: ");
        g = leia.nextInt();


// LAÇO DE REPETIÇÃO PARA DESCOBRIR SE O TITÃ É P,M OU G 
        for (int i = 1; i <= quant; i++) {
            System.out.printf("Informe se o %dº titã é P, M ou G: ", i);
            tamanho_titas = leia.next();

            int titanSize = 0;

// O método equals é utilizado para comparações 
            if (tamanho_titas.equals("P")) {
                titanSize = p;
            } else if (tamanho_titas.equals("M")) {
                titanSize = m;
            } else if (tamanho_titas.equals("G")) {
                titanSize = g;
            }

// Se o tamanho do titã for menor ou igual ao tamanho atual da muralha, ele faz essa equação: 
            if (titanSize <= tam_atual_muralha) {
// EX: titã P tem 5 de altura, então t = 20 - 5 
                tam_atual_muralha = tam_atual_muralha - titanSize;
            } else {
                num_muralhas++;
                tam_atual_muralha = tamanho_muralha - titanSize;
            }
        }

        System.out.println("Número mínimo de muralhas necessárias: " + num_muralhas);

    }
} 