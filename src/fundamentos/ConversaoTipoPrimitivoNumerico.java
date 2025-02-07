package fundamentos;

import java.sql.SQLOutput;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.123456788888; // explícita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explícita (CAST)
        System.out.println(c);

        double e = 1.9999999;
        int f = (int) e; // explícita (CAST)
        System.out.println(f);

    }


}
