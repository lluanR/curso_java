package desafios;

import java.util.Scanner;

public class DesafioRevisao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int entrada1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int entrada2 = scanner.nextInt();

        if (entrada1 == entrada2) {
            System.out.println("\nAtribua valores diferentes para o range");
        } else if (entrada1 > entrada2) {
            rangeNumerico(entrada2, entrada1);
        } else {
            rangeNumerico(entrada1, entrada2);
        }

        scanner.close();
    }

    public static void rangeNumerico(int valorMinimo, int valorMaximo) {

        System.out.println();

        for (; valorMinimo <= valorMaximo ; valorMinimo++) {
            if (valorMinimo % 2 == 0) {
                System.out.print(valorMinimo);
                if ((valorMaximo % 2 == 0 && valorMinimo < valorMaximo) || (valorMaximo % 2 == 1 && valorMinimo < (valorMaximo - 1))) {
                    System.out.print(" - ");
                }
            }
        }

        System.out.println();
    }
}
