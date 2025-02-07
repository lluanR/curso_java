package desafios;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        // usando SCANNER 3 string usando nextLine recebem 3 salários
        // possibilidade de separar as casas decimais com VIRGULA ou PONTO
        // calcular a MEDIA dos 3 salários

        double salario1;
        double salario2;
        double salario3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        salario1 = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.print("Digite o segundo salário: ");
        salario2 = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.print("Digite o terceiro salário: ");
        salario3 = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        double mediaSalarial = (salario1 + salario2 + salario3) / 3;

        System.out.println("A média salarial é de: " + mediaSalarial);

        scanner.close();
    }
}
