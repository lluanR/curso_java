package desafios;

public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";
        for(int i = 1;  i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        for(String simbolo = "#"; !simbolo.equals("######"); simbolo = simbolo + "#") {
            System.out.println(simbolo);
        }
    }
}
