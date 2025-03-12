package orientacaoObjeto.desafios;

import java.sql.SQLOutput;

public class DataTeste {

    public static void main(String[] args) {

        Data aniversario = new Data();
        aniversario.ano = 2025;
        aniversario.mes = 5;
        aniversario.dia= 19;

        System.out.println("Meu mês de aniversário é: " + aniversario.mes);

        Data nascimento = new Data();
        nascimento.ano = 1997;
        nascimento.mes = 5;
        nascimento.dia = 19;

        System.out.printf("Minha data de nascimento é %d / %d / %d " , nascimento.ano , nascimento.mes , nascimento.dia);



    }
}
