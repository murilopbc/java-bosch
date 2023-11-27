import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

// DECLARAÇÃO DE VARIAVEL
        int horas_inicio, minuto_inicio, horas_final, minuto_final, total_horas, total_minuto;


// ENTRADA PARA O USUARIO INSERIR A QUANTIDADE DAS COISAS
        System.out.print("Informe em que hora começou o jogo: ");
        horas_inicio = leia.nextInt();
        System.out.print("Informe em que minuto começou o jogo: ");
        minuto_inicio = leia.nextInt();
        System.out.print("Informe em que hora terminou o jogo: ");
        horas_final = leia.nextInt();
        System.out.print("Informe em que minuto terminou o jogo: ");
        minuto_final = leia.nextInt();

        total_horas = horas_final - horas_inicio;
        total_minuto = minuto_final - minuto_inicio;

        if (total_horas < 0) {
            total_horas = 24 + (horas_final - horas_inicio);
        }

        if (total_minuto < 0) {
            total_minuto = 60 + (minuto_final - minuto_inicio);
            total_horas--;
        }
        if (horas_inicio == horas_final && minuto_inicio == minuto_final) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else {
            System.out.println("O JOGO DUROU "+ total_horas + " HORA(S) E " + total_minuto + " MINUTO(S)");}
    }
}