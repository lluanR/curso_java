package fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        // ( ºF - 32 ) x 5/9 = ºC

        double f = 10;
        final int FATOR = 32;
        final double DIVISOR = 5.0/9.0;
        double c = (f - FATOR) * DIVISOR;

        System.out.println("O resultado é " + c + "ºC");

    }
}
