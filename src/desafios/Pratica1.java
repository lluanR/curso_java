package desafios;

import java.time.LocalDate;
import java.util.Scanner;

public class Pratica1 {

    public static void main(String[] args) {

        // Utilizando o Scanner. Informe seu nome, sua idade e a data que está exibindo esta informação
        // Utilize LocalDate para isso

        LocalDate data = LocalDate.now();
        String nome = "";
        int idade = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.printf("%s tem %d anos, na data de %s \n", nome, idade, data);
        System.out.println(nome + " tem " + idade + " anos, na data de " + data);

        scanner.close();

        // Utilizando o Scanner, informe a temperatura em Celsius e converta para Fahrenheit
        // F = (C * 1.8) + 32

        final double FATOR = 32.0;
        final double MULTIPLICADOR = 1.8;
        double resultMultiplicacao = 0.0;
        double resultadoFinal = 0.0;
        double celsius = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma temperatura em Celsius: ");
        celsius = sc.nextDouble();

        resultMultiplicacao = celsius * MULTIPLICADOR;
        resultadoFinal = resultMultiplicacao + FATOR;

        System.out.println(celsius + "ºC equivalem à " + resultadoFinal + "ºF");

        sc.close();
    }
}
