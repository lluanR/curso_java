package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String saudacao = "Boa tarde";
        System.out.println(saudacao.concat("!!!"));
        System.out.println(saudacao + "!!!");
        System.out.println(saudacao.startsWith("Boa"));
        System.out.println(saudacao.toLowerCase().startsWith("boa"));
        System.out.println(saudacao.toUpperCase().endsWith("TARDE"));
        System.out.println(saudacao.length());
        System.out.println(saudacao.equals("boa tarde"));
        System.out.println(saudacao.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade =  33;
        var salario = 12345.987;
        System.out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario  + "\n\n");

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome , sobrenome , idade , salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome , sobrenome , idade , salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6 , 10));

    }

}
