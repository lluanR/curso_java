package desafios;

public class DesafioAritimetico {

    public static void main(String[] args) {

        // primeiro calculo =  ([6 * (3 + 2)]^2)/ 3*2
        // segundo calculo  =  [((1 - 5) * (2 -7)) /2 ]^2

        int parteA = 6 * (3 + 2);
        int parteB = (1 - 5) * (2 - 7);
        int divisor1 = 3 * 2;
        int divisor2 = 2;
        int divisor3 = 10;
        int divisorExponencial3 = (int) Math.pow(divisor3 , 3);

        // primeiro calculo =  ([6 * (3 + 2)]^2)/ 3*2
        int exponencial1 = (int) Math.pow(parteA , 2);
        int resultadoPrimeiroCalculo = exponencial1 / divisor1;
        System.out.println(resultadoPrimeiroCalculo);

        // segundo calculo  =  [((1 - 5) * (2 -7)) /2 ]^2
        int resultadoDivisor1 = parteB / divisor2;
        int resultadoSegundoCalculo = (int) Math.pow(resultadoDivisor1 , 2);
        System.out.println(resultadoSegundoCalculo);

        // (150 - 100)^3 / 10^3
        int subtracaoExponencial = (int) Math.pow(resultadoPrimeiroCalculo - resultadoSegundoCalculo , 3);
        System.out.println(subtracaoExponencial);

        int resultadoCalculo = subtracaoExponencial / divisorExponencial3;
        System.out.println(resultadoCalculo);


        // DESAFIO - SERÁ DIVIDIDO EM 3 PARTES
        // PRIMEIRA PARTE: ([6 * (3 + 2)]^2) / (3 * 2)
        int primeiraParteA = 6 * (3 + 2);
        int primeiraParteB = (int) Math.pow(primeiraParteA, 2);
        int primeiraParteC = primeiraParteB / (3 * 2);
        System.out.println("\nPrimeira parte = " + primeiraParteC);

        // SEGUNDA PARTE: (((1 - 5) * (2 - 7)) / 2)^2
        int segundaParteA = (1 - 5) * (2 - 7);
        int segundaParteB = segundaParteA / 2;
        int segundaParteC = (int) Math.pow(segundaParteB, 2);
        System.out.println("Segunda parte = " + segundaParteC);

        // TERCEIRA PARTE: ((PRIMEIRA PARTE - SEGUNDA PARTE)^3) / 10^3
        int terceiraParteA = primeiraParteC - segundaParteC;
        int terceiraParteB = (int) Math.pow(terceiraParteA, 3);
        int terceiraParteC = terceiraParteB / ((int) Math.pow(10, 3));
        System.out.println("Resultado final = " + terceiraParteC);

    }


}
