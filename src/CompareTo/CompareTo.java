package CompareTo;

import java.io.IOException;
import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args) {
        /* Por não ter um modo de limpar o Console da IDE, utilizei um método manual, porém não muito
          bonito visualmente, mas acredito que seja melhor que deixar todas as informações visíveis
          simultaneamente. */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("1 = Comparar letra inicial.");
        System.out.println("2 = Lower Case e Upper Case.");
        System.out.print("\nPor favor, selecione uma opção: ");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("\n\n\n\n\n\n\n");
                compareText();
                break;

            case 2:
                System.out.println("\n\n\n\n\n\n\n");
                upperLower();
                break;

            default:
                System.out.println(opcao + " não é uma opção válida.");
        }
    }

    private static void compareText() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sistema de comparação com o primeiro caractere de cada String.\n");

        System.out.print("Entre com um nome: ");
        String nome1 = scan.nextLine();

        System.out.println("");
        System.out.print("Entre com um segundo nome: ");
        String nome2 = scan.nextLine();

        int Compara = nome1.compareTo(nome2);
        if (Compara < 0) {
            Compara *= -1;
        }
        System.out.println("\nA letra inicial do nome " + nome1 + " está a " + Compara + " casas de distância da letra inicial do nome " + nome2 + ".");
    }
    private static void upperLower() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Código de transformação para letras maiúsculas e minúsculas.\n");
        System.out.print("Insira um texto que deseja modificar para maiúsculo e minúsculo: ");
        String text = scan.nextLine();
        System.out.println();
        System.out.println("Texto original: \n" + text);
        System.out.println("\nTexto maiúsculo: \n" + text.toUpperCase());
        System.out.println("\nTexto minúsculo: \n" + text.toLowerCase());
    }
}
