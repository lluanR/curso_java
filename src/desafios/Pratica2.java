package desafios;

public class Pratica2 {

    public static void main(String[] args) {

        // Encontre a média aritmética de 3 valores inteiros distintos vindos por parâmetro.
        int parametro1 = (int) (Math.random() * 10) + 1;
        int parametro2 = (int) (Math.random() * 10) + 1;
        int parametro3 = (int) (Math.random() * 10) + 1;

        int mediaFinal = (parametro1 + parametro2 + parametro3) / 3;

        System.out.printf("Parâmetros atuais: %s, %s, %s\n", parametro1, parametro2, parametro3);
        System.out.println("A média dos parâmetros é " + mediaFinal);

        // Faça um algoritmo que leia a idade de uma pessoa em dias.
        // Considere o ano com 365 dias e os meses com 30 dias.
        // Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.
        int anos = (int) (Math.random() * 11);
        int meses = (int) (Math.random() * 13);
        int dias = (int) (Math.random() * 30) + 1;

        final int DIAS_ANO = 365;
        final int DIAS_MES = 30;
        int idadeEmDias = 0;

        System.out.printf("\n\n%s ano(s), %s mes(es) e %s dia(s)\n", anos, meses, dias);
        idadeEmDias = (anos * DIAS_ANO) + (meses * DIAS_MES) + dias;
        System.out.println("A idade em dias desta pessoa é de " + idadeEmDias + " dias.");

        // Retorne um caractere aleatório minúsculo de uma palavra aleatória vindos como parâmetro.
        // Exemplo: palavraSorteada: "Carro", posicaoDoCaractereSorteado: 0, resposta: 'c'
        String[] palavras = {"bAnAnA", "aBACAXI", "LarAnjA", "Morango", "Uva"};

        int posicaoPalavraSorteada = (int) (Math.random() * 5);
        int posicaoCaracatereSorteado = (int) (Math.random() * palavras[posicaoPalavraSorteada].length());

        String palavraSorteada = palavras[posicaoPalavraSorteada];
        char caractereSorteado;
        char caractereSorteadoMinusculo;

        System.out.printf("\n\nA palavra sorteada é %s e o caractere sorteado é o %s\n", palavraSorteada, posicaoCaracatereSorteado);
        // Forma alternativa de resolução:
        //        palavraSorteada = palavraSorteada.toLowerCase();
        //        caractereSorteadoMinusculo = palavraSorteada.charAt(posicaoCaracatereSorteado);

        // Forma utilizada para a resolução
        caractereSorteado = palavraSorteada.charAt(posicaoCaracatereSorteado);
        caractereSorteadoMinusculo = Character.toLowerCase(caractereSorteado);
        System.out.println("O caractere aleatório convertido para minúsculo é o: " + caractereSorteadoMinusculo);

    }

}
